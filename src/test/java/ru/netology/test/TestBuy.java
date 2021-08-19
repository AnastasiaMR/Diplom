package ru.netology.test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.val;
import org.junit.jupiter.api.*;
import ru.netology.date.DBHelper;
import ru.netology.date.DataHelper;
import ru.netology.page.MainPage;
import ru.netology.page.PaymentPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBuy {
    MainPage mainPage = new MainPage();
    PaymentPage paymentPage = new PaymentPage();

    @BeforeEach
    void shouldOpenApp() {
            open("http://localhost:8080", MainPage.class);
            mainPage.buyWithCredit();
        }

    @AfterEach
    void cleanDataBases() {
        DBHelper.clean();
    }
    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    @Test
    void shouldApproveFirstCard() {
        val cardNumber = DataHelper.getValidCardNumber();
        val month = DataHelper.getValidMonth();
        val year = DataHelper.getValidYear();
        val owner = DataHelper.getCardHolder();
        val cvs = DataHelper.getValidCVC();
        paymentPage.fillOutFields(cardNumber, month, year, owner, cvs);
        paymentPage.expectApprovalFromBank();
        val expected = DataHelper.getValidCardStatus();
        val actual = DBHelper.getStatusBuy();
        assertEquals(expected, actual);
    }
}

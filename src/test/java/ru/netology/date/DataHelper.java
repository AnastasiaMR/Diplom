package ru.netology.date;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataHelper {
    private Faker fakerEn = new Faker(new Locale("en"));
    private Faker fakerRu = new Faker(new Locale("ru"));

    public static String getValidCardNumber() {
        return "4444 4444 4444 4441";
    }

    public static String getValidCardStatus() {
        return "APPROVED";
    }

    public String getInvalidCardStatus () {
        return "DECLINED";
    }

    public String getInvalidCardNumber () {
        return "4444 4444 4444 4442";
    }

    public String getEmptyCardNumber () {
        return "                ";
    }
    
    public String getRandomCardNumber () {
        return fakerEn.business().creditCardNumber();
    }

    public static String getValidMonth() {
        return "08";
    }

    public String getInValidMonth () {
        return "00";
    }

    public String getEmptyMonth () {
        return "  ";
    }

    public static String getValidYear() {
        return "22";
    }

    public String getInvalidYear () {
        return "15";
    }

    public String getEmptyYear () {
        return "00";
    }

    public static String getCardHolder() {
        return "Vasya Ivanov";
    }

    public String getNotCardHolder() {
        return fakerRu.name().fullName();
    }

    public String getEmptyCardHolder () {
        return "";
    }

    public static String getValidCVC() {
        return "999";
    }

    public String getInvalidCVC() {
        return "234";
    }

    public String getEmptyCVC () {
        return "   ";
    }
}

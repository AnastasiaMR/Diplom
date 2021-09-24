# Дипломный проект по курсу «Тестировщик ПО»
[План дипломного проекта](https://github.com/AnastasiaMR/Diplom/blob/master/Plan.md) 

[Отчет по итогам тестирования](https://github.com/AnastasiaMR/Diplom/blob/master/Report.md)

[Отчет по итогам автоматизации](https://github.com/AnastasiaMR/Diplom/blob/master/Summary.md)

## Запуск автотестов
1. Клонировать репозиторий на компьютер
2. Открыть проект в JetBrains IntelliJ IDEA
3. Запустить контейнер командой: 
* `docker-compose up -d --build`

4. Перейти в папку artifacts:
* `cd artifacts`

5.1 Запустить приложение с MySQL командой: 
* `java -Dspring.datasource.url=jdbc:mysql://localhost:3306/app -Dspring.datasource.username=app -Dspring.datasource.password=pass -jar aqa-shop.jar`

5.2 Запустить приложение с PostgreSQL командой:
* `java -Dspring.datasource.url=jdbc:postgresql://localhost:5432/app -Dspring.datasource.username=app -Dspring.datasource.password=pass -jar aqa-shop.jar` 

6.1 Запустить тесты командой `gradlew clean test -Durl="jdbc:mysql://localhost:5432/app" -Duser="app" -Dpassword="pass" --info`

6.2 Запустить тесты командой `gradlew clean test -Durl="jdbc:postgresql://localhost:5432/app" -Duser="app" -Dpassword="pass" --info`

7. Для получения отчета (Allure) использовать команду gradlew allureServe

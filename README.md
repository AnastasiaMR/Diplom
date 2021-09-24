# Дипломный проект по курсу «Тестировщик ПО»
[План дипломного проекта](https://github.com/AnastasiaMR/Diplom/blob/master/Plan.md) 

[Отчет по итогам тестирования](https://github.com/AnastasiaMR/Diplom/blob/master/Report.md)

## Запуск автотестов

1. Запустить контейнер командой: 
* `docker-compose up -d --build`

2. Перейти в папку artifacts:
* `cd artifacts`

3.1 Запустить приложение с MySQL командой: 
* `java -Dspring.datasource.url=jdbc:mysql://localhost:3306/app -jar aqa-shop.jar` 

3.2 Запустить приложение с PostgreSQL командой:
* `java -Dspring.datasource.url=jdbc:postgresql://localhost:5432/app -jar aqa-shop.jar` 


package ru.geekbrains.lesson1;

public class Main {
    public static void main(String[] args)
    {
        // п.2 объявляем переменные и присваиваем им значения
        byte z = 126;
        short y = 12;
        int a = 32, b = 136, c = 321, d = 68;
        long q = 32156;
        float e = 12.62f;
        double g = 62.12;

        char h;

        // п. 3 вычисления. в рамках данного метода невозможен возврат. при выполнении метода static inc
        // (стр 43-50)   - результат не выводится в консоль. Не разобрался с этим.
        int x = a * (b + (c / d));
        System.out.println("x =" + x);

        // п. 4 проверка суммы двух чисел на удовлетворение условия >= 10 и <=20
        int k = a + b;
        if (10 <= k && 20 >= k) {

            System.out.println("Значение суммы а и b лежит в пределах от 10 до 20");
        }
        else {
            System.out.println("Значение суммы а и b находится за пределами интересующего нас диапазона" );
        }
    }}

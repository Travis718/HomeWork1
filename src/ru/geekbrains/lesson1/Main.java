package ru.geekbrains.lesson1;

import java.util.Arrays;

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
        boolean n = false;
        char v ='j';

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

        // п.5 Проверяем - положительное число или отрицательное
        if (a >=0) {
            System.out.println("Число а является положительным");
        }
        else {
            System.out.println( "Число а число является отрицательным");
        }


               // п. 8 Определяем високосность.
        int m = 1983;
        if (!(m % 4 == 0) && (m % 100 == 0) && !(m % 400 == 0)) {
            System.out.println("Возрадуйтесь - этот год не високосный!");
        }
        else
        {
            System.out.println("Это високосный год");
        }

        // п.7 передаем имя в качестве параметра
        String str = "Привет, Ваня";

        System.out.println(str);

         sayHello( "Ваня");
                            }
        static void sayHello(String name) {
            System.out.println("Привет"  + name);
            return;
        }

        //п.6 возвращаем true при условии - число отрицательное
        // ломаем порядок пунктов домашки, поскольку в методе void return не работает

        static boolean goBack(int a) {
        if (a < 0) return true;
        return false;
        }
    }

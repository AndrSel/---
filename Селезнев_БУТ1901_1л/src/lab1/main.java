package lab1;

import java.util.Scanner;
import java.util.Arrays;

class l1 {
    public static void main(String[] arg) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("№1");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(x % 10);
    }

    public static void task2() {
        System.out.println("№2");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int sum = 0;
        if (a.length() == 3) {
            int aa = Integer.parseInt(a);
            while (aa > 0) {
                sum = sum + aa % 10;
                aa = aa / 10;
            }
            System.out.println("сумма: " + sum);

        } else {
            System.out.println("не трёхзначное число");
        }
    }


    public static void task3() {
        System.out.println("№ 3");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x >= 0) {
            x += 1;
            System.out.println("положительное число : " + x);
        } else {
            System.out.println("число отрицательное: " + x);
        }
    }


    public static void task4() {
        System.out.println("№ 4");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x > 0) {
            x += 1;
            System.out.println("положительное число : " + x);
        } else if (x < 0) {
            x -= 2;
            System.out.println("отрицательное число : " + x);
        } else {
            x = 10;
            System.out.println("0" + x);
        }
    }

    public static void task5() {
        System.out.println("№ 5");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mini = Math.min(a, b);
        int mini1 = Math.min(mini, c);
        System.out.println("минимальное число: " + mini1);
    }

    public static void task6() {
        System.out.println("№ 6");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if ((x < 0) && (x % 2 == 0)) {
            System.out.println("отрицательное четное число");
        } else if ((x > 0) && (x % 2 != 0)) {
            System.out.println("положительное нечетное число");
        } else if ((x < 0) && (x % 2 != 0)) {
            System.out.println("отрицательное нечетное число");
        } else if ((x > 0) && (x % 2 == 0)) {
            System.out.println("положительное четное число");
        } else if (x == 0) {
            System.out.println("нулевое число");
        }

    }

    public static void task7() {

        System.out.println("№ 7");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите код города: ");
        int x = sc.nextInt();
        double Moscow = 4.15;
        double Rostov = 1.98;
        double Krasnodar = 2.69;
        double Kirov = 5.00;
        if (x == 905) {
            System.out.println("Москва. стоимость : " + Moscow * 10);
        } else if (x == 194) {
            System.out.println("Ростов. стоимость : " + Rostov * 10);
        } else if (x == 491) {
            System.out.println("Краснодар. стоимость : " + Krasnodar * 10);
        } else if (x == 800) {
            System.out.println("Краснодар. стоимость : " + Krasnodar * 10);
        } else {
            System.out.println("некорректно введенный код");
        }
    }

    public static void task8() {
        System.out.println("№ 8");
        int[] Array = {1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
        Arrays.sort(Array);//Сортировка по возрастанию
        int maxi = Array[Array.length - 1];
        System.out.println("Максимальное число в массиве: " + maxi);
        int sum1 = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > 0) {//если положительный
                sum1 += Array[i];
            }
        }
        System.out.println("Сумма положительных: " + sum1);
        int sum2 = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < 0 && Array[i] % 2 == 0) {//если четный и отрицательный
                sum2 += Array[i];
            }
        }
        System.out.println("Сумма чётных отрицательных чисел: " + sum2);
        int k1 = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > 0) {//если положительный
                k1 += 1;
            }
        }
        System.out.println("Кол-во положительных элементов: " + k1);
        double sum3 = 0;
        int k2 = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < 0) {//если отрицательный
                sum3 += Array[i];
                k2 += 1;
            }
        }
        double avg = sum3 / k2;
        System.out.println("Среднеарифметическое отрицательных элементов: " + avg);
    }

    public static void task9() {
        System.out.println("№ 9");
        int[] Array = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.print(Array[i] + " ");
        }
    }

    public static void task10() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("№ 10");
        int[] Array = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        System.out.println("Исходный: " + Arrays.toString(Array));
        int temp;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == 0) {
                for (int j = i + 1; j < Array.length; j++) {
                    if (Array[j] != 0) {
                        temp = Array[j];
                        Array[j] = Array[i];
                        Array[i] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println("Новый: " + Arrays.toString(Array));
    }

}

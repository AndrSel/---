package com.company;

import java.util.HashMap;
import java.util.Map;

class lab4 {
    public static void main(String[] arg) {
        //Написать программу, которая проверяет, является ли строка палиндромом
        System.out.println(" 1");
        //String str = "qwerty";
        String str = "qwq";

        System.out.println("Введенная строка " + str);
        if (str.equals((new StringBuffer(str)).reverse().toString())) {
            System.out.println("Введенная строка палиндром");
        } else
            System.out.println("Введенная строка не является палиндромом");
        System.out.println("------------------------------");

        //Реализовать удаление повторяющихся символов в строке

        //Метод indexOf() возвращает первый индекс, по которому данный элемент
        // может быть найден в массиве или -1, если такого индекса нет.

        //Метод charAt() возвращает указанный символ из строки.

        //Метод lastIndexOf() возвращает индекс последнего вхождения указанного значения в строковый объект String,
        // на котором он был вызван, или -1,
        // если ничего не было найдено. Поиск по строке ведётся от конца к началу, начиная с индекса fromIndex.

        System.out.println(" 2");
        String two = "qqwwerty";
        String result="";
        for (int i = 0; i < two.length() ; i++) {
            if (two.indexOf(two.charAt(i)) == two.lastIndexOf(two.charAt(i))) {
                result+=two.charAt(i);
            }
        }


        System.out.println(result);
        System.out.println("------------------------------");




        //Реализовать проверку, являются ли две строки анаграммами
        System.out.println(" 3");
        String str1 = "дорога";
        String str2 = "города";
        System.out.println("1: "+str1+" "+"2: "+str2);
        if (str1.length() != str2.length()) {
            System.out.println("не анаграммы");
        }
        else {
            StringBuilder s1 = new StringBuilder(str1.toLowerCase());
            StringBuilder s2 = new StringBuilder(str2.toLowerCase());
            int x, y;
            x = -1;
            while (++x < s1.length()) {
                y = -1;
                while (++y < s2.length()) {
                    if (s1.charAt(x) == s2.charAt(y)) {
                        s2.deleteCharAt(y);
                    }
                }
            }
            System.out.println("анаграммы");
        }
        System.out.println("------------------------------");

        //Напишите Java-программу для лексикографического сравнения двух строк
        //Метод compareTo() в Java структурирован двумя вариантами. Первый: метод сравнивает строку с другим объектом,
        // а второй: метод лексически сравнивает две строки.

        //В Java compareTo() получает значение 0, если аргумент является строкой лексически равной данной строке; значение меньше 0,
        // если аргумент является строкой лексически большей, чем сравниваемая строка; и значение больше 0,
        // если аргумент является строкой лексически меньшей этой строки.

        System.out.println(" 4");
        String w1 = "Пам";
        String w2 = "пам";
        System.out.println(w1.compareTo(w2));
        System.out.println("------------------------------");

        //Напишите Java-программу для лексикографического сравнения двух строк, игнорируя различия в регистре
        System.out.println(" 5");
        String w3 = "Пам";
        String w4 = "пам";
        System.out.println(w3.compareToIgnoreCase(w4));
        System.out.println("------------------------------");

        //Напишите программу на Java для объединения данной строки в конец другой строки
        System.out.println(" 6");
        String w5 = "ПАМ";
        String w6 = " ПАМ";
        System.out.println(w6+" "+w5);
        System.out.println("------------------------------");

        //Напишите Java-программу для сравнения заданной строки с указанной последовательностью символов

        //Метод contentEquals() – возвращает значение true только в том случае, если эта строка представляет собой ту же
        // последовательность символов, которая указана в строке буфера (StringBuffer).

        System.out.println(" 7");
        String w7 = "ПАМ";
        CharSequence w71 = "ПУМ";
        if (w7.contentEquals(w71) == true) {
            System.out.println("Строки совпадают");
        }
        else {
            System.out.println("Строки различны");
        }
        System.out.println("------------------------------");

        //Напишите программу на Java, чтобы проверить, заканчивается ли данная строка содержимым другой строки

        //Метод endsWith() позволяет определить, заканчивается ли строка символами указанными в скобках,
        // возвращая, соответственно, true или false.

        System.out.println(" 8");
        String w8 = "начало";
        String w81 = "Это был длинный текст который заканчивался словом начало";
        System.out.println(w81.endsWith(w8));
        System.out.println("------------------------------");

        //Напишите программу на Java, чтобы проверить, содержат ли два объекта String одинаковые данные
        System.out.println(" 9");
        String w9 = "qwerty";
        String w91 = "ytrewq";
        System.out.println(w9.equals(w91));
        System.out.println("------------------------------");

        //Напишите Java-программу, чтобы получить длину заданной строки
        System.out.println(" 10");
        String w10 = "ПАМПАМ";
        System.out.println("Длина строки: "+ w10.length());
        System.out.println("------------------------------");

        //Напишите программу на Java, чтобы преобразовать все символы строки в нижний регистр
        System.out.println(" 11");
        String w11 = "ПАм пАМ";
        System.out.println(w11.toLowerCase());
        System.out.println("------------------------------");

        //Напишите программу на Java, чтобы преобразовать все символы в строке в верхний регистр
        System.out.println(" 12");
        System.out.println(w11.toUpperCase());
        System.out.println("------------------------------");

        //Напишите программу на Java, чтобы найти второй по частоте символ в данной строке
        System.out.println(" 13");
        Map <String, Integer> letters = new HashMap<String,Integer>();

        //Метод indexOf() возвращает первый индекс, по которому данный элемент может быть найден в массиве или -1,
        // если такого индекса нет.

        //берется каждый символ, затем считается кол-во повторений этого символа
        String words = "qqwwwerty";
        int wordLen = words.length();
        int countLetter = 0;
        for (int i = 0; i < wordLen; ){
            int count=0;
            char t = words.charAt(i);
            int index = i;
            boolean b = true;
            while (b) {
                if(words.indexOf(t, index) != -1) {
                    count++;
                    index++;
                }else{
                    b = false;
                    i=index;
                }
            }
            letters.put(Character.toString(t),count);//запись в формате "значение:кол-во повторений"
        }

        //keySet(): возвращает набор всех ключей отображения

        //находим самое большое кол-во повторений
        String maxKey = null;
        for (String key : letters.keySet()) {
            if (maxKey == null || letters.get(key) > letters.get(maxKey)) {
                maxKey = key;
            }
        }

        //Удаляется символ, встречающийся больше всех
        ////находим самое большое кол-во повторений (второй по частоте символ)
        letters.remove(maxKey);
        maxKey = null;
        for (String key : letters.keySet()) {
            if (maxKey == null || letters.get(key) > letters.get(maxKey)) {
                maxKey = key;
            }
        }
        System.out.println(maxKey);
        System.out.println("------------------------------");







        //Напишите программу на Java, чтобы найти первый неповторяющийся символ в строке

        //Метод indexOf() возвращает первый индекс, по которому данный элемент
        // может быть найден в массиве или -1, если такого индекса нет.

        //Метод charAt() возвращает указанный символ из строки.

        //Метод lastIndexOf() возвращает индекс последнего вхождения указанного значения в строковый объект String,
        // на котором он был вызван, или -1,
        // если ничего не было найдено. Поиск по строке ведётся от конца к началу, начиная с индекса fromIndex.

        System.out.println(" 15");
        String str12 = "qqwwe";
        boolean f = true;
        for (int i = 0; i < str12.length() && f; i++) {
            //если индексы равны -> первый неповторяющийся символ в строке
            if (str12.indexOf(str12.charAt(i)) == str12.lastIndexOf(str12.charAt(i))) {
                System.out.print( str12.charAt(i));
                f = false;
            }
        }
        System.out.println();
        System.out.println("------------------------------");


        //Напишите программу на Java, которая возвращает true из заданной строки, если первые два символа в строке также появляются в конце

        //Метод substring() в Java имеет два варианта и возвращает новую строку, которая является подстрокой данной строки.
        // Подстрока начинается с символа, заданного индексом, и продолжается до конца данной строки или до endIndex-1, если введен второй аргумент.


        System.out.println(" 16");
        String w16 = "qwerqw";
        String begin = (w16.substring(0,2)).toLowerCase();//первые 2
        String end = (w16.substring(w16.length()-2)).toLowerCase();//вторые 2
        System.out.println(begin.equals(end));
        System.out.println("------------------------------");




        //Напишите программу на Java, которая возвращает количество символов, появляющихся три раза подряд в строке

        //Метод indexOf() возвращает первый индекс, по которому данный элемент может быть найден в массиве или -1,
        // если такого индекса нет.
        //
        //        //берется каждый символ, затем считается кол-во повторений этого символа


        System.out.println(" 17");
        String w17 = "qqqwwweeerrr";
        int len17 = w17.length();
        int countW = 0;
        for (int i = 0; i < len17; ){
            int countN=0;
            char t1 = w17.charAt(i);
            int index = i;
            boolean b1 = true;
            while (b1) {
                if(w17.indexOf(t1, index) != -1) {
                    countN++;
                    index++;
                }else{
                    b1 = false;
                    i=index;
                }
            }
            if(countN == 3){//Если 3 повторения
                countW++;
            }
        }
        //String prev = null;
        System.out.println(countW);
        System.out.println("------------------------------");


        //Напишите программу на Java, которая возвращает сумму цифр, присутствующих в строке. Если цифр нет, возвращаемая сумма равна 0
        System.out.println(" 18");
        String w18 = "qq123ww";
        //отбор с помощью регулярных выражений
        w18 = w18.replaceAll("[^0-9]", "");
        if (w18.isEmpty()){
            System.out.println("сумма = 0");
        }
        else{
            int sum = 0;
            boolean b2 = true;
            int num = Integer.parseInt(w18);
            //System.out.println(w18);
            while (b2){
                sum+=num%10;//деление с остатком (остаток)
                num/=10; // 3 + 2 + 1
                if(num <= 0){
                    b2 = false;
                }
            }
            System.out.println(sum);
        }

        System.out.println("------------------------------");

        //Напишите программу на Java для печати после удаления дубликатов из заданной строки

        //For-each — это разновидность цикла for, которая используется, когда нужно обработать все элементы массива или коллекции.

        //Метод append() – обновляет значение объекта, который вызвал метод.
/*
        System.out.println(" 14");
        StringBuilder sb = new StringBuilder();
        String str14 = "qqwwwerty";
        str14.chars().distinct().forEach(x -> sb.append((char) x));
        System.out.println(sb);

        System.out.println("------------------------------");
*/

        System.out.println(" 14");
        String a = "qqwwerty";
        int len;
        do {
            len = a.length();
            a = a.replaceAll("([^a-z])\\1", "");


        }
        while (len != a.length());
        System.out.println(a);

        }
    }




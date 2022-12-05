package com.company.model;

import java.util.ArrayList;
import java.util.List;


public class Box<T extends Fruit> {

    // Создаем массив с типом передаваемым в класс Box
    private final List<T> fruits = new ArrayList<>();

    // Метод возвращающий вес фруктов от их количества и веса
    public double getWeight() {
        int sum = 0;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }


//    <?>—это сокращение от <? extends Object>, также известное как
//    неограниченный подстановочный знак.
//    Таким образом, вы можете указать любой тип объекта в вашем generic.
//
//    Например, Listкласс объявлен как List<?>,
//    потому что это может быть список чего угодно.

        // Получаем бокс с <?> какой-то там класс, но не <T>
        public boolean compare (Box < ? extends Fruit > o){
            return this.getWeight() == o.getWeight();
        }

        // Добавление фрукта
        public void addFruit (T fruit){
            fruits.add(fruit);
        }

        // Переброска фруктов из этого ящика в принимаемый
        public void dropFruits (Box < T > anotherBox) {
            // Вызываю метод ниже
            anotherBox.addAllFruits(this.fruits);
            // Очищаю текущий массив
            this.fruits.clear();
        }

        // Добавляю в текущий массив все элементы из принимаемого массива
        private void addAllFruits (List < T > list) {
            this.fruits.addAll(list);
        }

    }


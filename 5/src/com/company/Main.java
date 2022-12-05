package com.company;

import com.company.collection.MyCollection;
import com.company.model.Apple;
import com.company.model.Box;
import com.company.model.Fruit;
import com.company.model.Orange;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        //System.out.println(appleBox.getWeight());
        //System.out.println(orangeBox.compare(orangeBox));

    }

}

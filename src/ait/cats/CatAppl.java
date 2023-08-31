package ait.cats;

import java.util.Arrays;
import java.util.function.Predicate;

public class CatAppl {
    public static void main(String[] args) {

        Cat[] cats = new Cat[4];
        cats[0] = new Cat(8, "A", "B");
        cats[1] = new Cat(5, "F", "V");
        cats[2] = new Cat(3, "I", "K");
        cats[3] = new Cat(1, "G", "X");

        printArray(cats);//печатаем до сортировки
        Arrays.sort(cats);// отсортировали массив котов
        printArray(cats);//печатаем после сортировки
    }

    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("===================");
    }


}



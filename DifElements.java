package com.company;

import java.util.Arrays;

// а массив то можно было сортануть

public class DifElements {

    public static void main(String[] args) {
        //Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.

        int[]myArray={1,4,5,1,1,3};
        System.out.println(Arrays.toString(myArray));

        myArray = minusDublicates(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println("We have this much unique numbers "+myArray.length);
    }

    static int []minusDublicates(int[]array){
        int index = 0;
        while (index < array.length){
            int count =0;
            for (int i = index+1; i < array.length; i++) {
                if(array[i]==array[index]){
                    System.arraycopy(array,i+1,array,i,array.length-i-1);
                    count ++;
                    i--;
                }
            }
            array=Arrays.copyOf(array,array.length-count);
            index++;
        }
        return array;
    }
}



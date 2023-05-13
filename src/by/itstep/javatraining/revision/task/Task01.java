package by.itstep.javatraining.revision.task;

/*	Task 01. The same Numbers [совпадающие числа]
 *
 *	Даны четыре целых числа. Определите, сколько из них совпадающих.
 *	Если числа не совпадают, то необходимо возвратить ноль.
 *
 *	Формат входных данных [input]
 *	На вход даётся четыре целых числа в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Возвратите количество совпадающих чисел или ноль, если таких чисел нет.
 *
 *	[ input 1]: 7 7 7 7
 *	[output 1]: 4
 *
 *	[ input 2]: 7 7 7 8
 *	[output 2]: 3
 *
 *	[ input 3]: 7 7 8 9
 *	[output 3]: 2
 *
 *	[ input 4]: 6 7 8 9
 *	[output 4]: 0
 */

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task01 {
    public static int task01(int a, int b, int c, int d) {

        List<Integer> arraylist = Arrays.asList(a, b, c, d);
        Collections.sort(arraylist);

        int count = 1;
        for (int i = 0; i < arraylist.size() - 1; i++) {
            if (arraylist.get(i) == arraylist.get(i + 1)) {
                count++;
            }
        }

        if (count == 1) {
            count = 0;
        }


        return count;
    }

    public static void main(String[] args) {

        int a = 7;
        int b = 7;
        int c = 3;
        int d = 7;

        ArrayList arraylist = new ArrayList();
        arraylist.add(a);
        arraylist.add(b);
        arraylist.add(c);
        arraylist.add(d);

        Collections.sort(arraylist);
        System.out.println(arraylist);

        int count = 1;
        for (int i = 0; i < arraylist.size() - 1 ; i++) {
            if (arraylist.get(i) == arraylist.get(i+1)){
                count++;
            }
        }

        if (count == 1){
            count = 0;
        }

        System.out.println(count);


    }

}






















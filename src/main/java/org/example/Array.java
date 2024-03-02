package org.example;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array {
    @Test
    public void sortLess() {
        ArrayList<Integer> k = new ArrayList();
        k.add(1);
        k.add(5);
        k.add(4);
        k.add(3);
        k.add(11);
        ArrayList<Integer> neww = new ArrayList(k);
        //Collections.sort(neww);
        System.out.println(neww);
    }

    @Test
    public void chatGTP() {
        ArrayList<Integer> k = new ArrayList<>();
        k.add(1);
        k.add(5);
        k.add(4);
        k.add(3);
        k.add(11);

        ArrayList<Integer> neww = new ArrayList<>(k);

        for (int i = 1; i < neww.size(); i++) {
            int key = neww.get(i);
            int j = i - 1;
            while (j >= 0 && neww.get(j) > key) {
                neww.set(j + 1, neww.get(j));
                j = j - 1;
            }
            neww.set(j + 1, key);
        }

        System.out.println(neww);
    }

    @Test
    public void sortmyself() {

        ArrayList<Integer> k = new ArrayList();
        k.add(1);
        k.add(5);
        k.add(4);
        k.add(3);
        k.add(11);
        ArrayList<Integer> neww = new ArrayList();

        for (int i = 0; i < k.size(); i++) {
            if (i == 0) neww.add(k.get(0));
            else if (neww.get(i - 1) > k.get(i)) {

                neww.set(i - 1, k.get(i));
                neww.add(neww.get(i - 1));
            } else neww.add(k.get(i));
        }
        System.out.println(neww);
    }

    @Test
    public void arraysort(){
        int []  ass= new int[5];
        ass[0]=15;
        ass[1]=52;
        ass[2]=555;
        ass[3]=50;
        ass[4]=54;
        Arrays.sort(ass);
        System.out.println(Arrays.toString(ass));

    }
}


package org.example;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class twoElementchange {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;

        int k = 0;
        k = a;
        a = b;
        b = k;
        System.out.println(a + " = a,b= " + b);
    }
@Test
public void sumtwonumber(){
    int a = 15;
    int b = 10;
    int sum =a+b;

    a=sum-a;
    b=sum-b;
    System.out.println(a +","+b );

}

    @Test
    public void sortmyself() {

        ArrayList<Integer> k = new ArrayList();
        k.add(10);
        k.add(5);
        k.add(45);
        k.add(3);
        k.add(1);
        ArrayList<Integer> neww = new ArrayList(k);

        int temp = 0;
        for (int i = 0; i < k.size(); i++) {
            if (i == 0) neww.add(k.get(i));
            else if (neww.get(i - 1) > k.get(i)) {
                temp = neww.get(i - 1);
                neww.set(i - 1, k.get(i));
                neww.add(temp);
            } else neww.add(k.get(i));
        }
        System.out.println(neww);
    }
}

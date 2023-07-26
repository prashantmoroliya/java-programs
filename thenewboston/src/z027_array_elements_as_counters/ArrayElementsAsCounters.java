package z027_array_elements_as_counters;

import java.util.Random;

public class ArrayElementsAsCounters {
    public static void main(String[] args) {
        Random random = new Random();
        int freq[] = new int[7];

        for (int roll=1; roll<1000; roll++) {
            ++freq[1+random.nextInt(6)];
        }

        System.out.println("Face\tFrequency");

        for (int face=1; face<freq.length; face++) {
            System.out.println(face + "\t\t" + freq[face]);
        }
    }
}

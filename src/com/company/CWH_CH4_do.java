package com.company;

public class CWH_CH4_do {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 78;
        marks[3] = 97;
        marks[4] = 87;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        for (int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}
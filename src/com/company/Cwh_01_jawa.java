package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Cwh_01_jawa {
    public static void main(String[] args) {

        //  Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter your name:");
        //     String age = sc.nextLine();
        ////Syst{
//            char grade = 'A';
//            switch (grade) {
//                case 'A':
//                    System.out.println("very good learning");
//                    break;
//                case 'B':
//                    System.out.println("nice keep it going");
//                    break;
//                case 'C':
//                    System.out.println("very good leraning");
//                    break;
//                default://            }
//
////                    System.out.println("wrong argument}
//            int age = 52;
//            if (!(age > 18) ) {
//                System.out.println("you can vote");
//            } else {
//                System.out.println("you can not
        //   for(int i = 0; i <10; i++) {
        //    S//ystem.out.println("Anuj");
        //    int marks[] = new int[5];
        /////   marks[0] = 23;
        //marks[1] = 12;
        ////    marks[2] = 56;
        //     marks[3] = 34;
        //    marks[4] = 99;
        //    int marks [] = {23,12,56,34,99, 23,34};

        //  for(int i = 0; i<marks.length; i++) {
        //     Sys*};{


        // for (int i = 5; i > 0; i--) {
        //   for (int j = 0; j < i; j++) {
        //       System.out.print("*");

        //   }
        // System.out.println();
        // int age;
        //   System.out.println("Enter your age");
        ////  Scanner sc = new Scanner(System.in);
        ////    age = sc.nextInt();

        //  switch (age){
////                System.out.println("You are going to become an Adult");
        //  break;
        // case 23:
     //   System.out.println("You are gonig to join a job");
        //break;
        // case 68:
       // System.out.println("YOu are going to get retired");
     //      default:
        // System.out.println("Enjoy your life");


    ///   System.out.println("Thanks for visit my java");
    Scanner sc = new Scanner(System. in);
    System.out.println("Enter your name in lakhs per annum");
    float tax = 0;
    float income = sc.nextFloat();
     if(tax<2.5) {
        tax = tax + 0;
    }
    else if(tax>2.5f && tax< 5f) {

        tax = tax + 0.05f * (income - 2.5f);
    }
    else if(tax>5f && tax< 10.0f) {
        tax = tax + 0.05f * (5.0f - 2.5f);
        tax = tax + 0.02f * (income - 5.0f);
    }
else if(tax>10.0f){
    tax = tax + 0.05f * (5.0f - 2.5f);
        tax = tax + 0.2f * (10.0f - 5f);
        tax = tax + 0.3f * (income - 10.0f);
    }

System.out.println("The total tax paid by the employee is: + tax");
}
}













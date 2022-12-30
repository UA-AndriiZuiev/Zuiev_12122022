package ua_hillel.homework_4;

import java.util.*;
public class MyClass {
 public void calcSin(){
     double x;
     int i=0;

     for(x=0; x<=360; x=x+10)
     {
        System.out.format("sin(%.0f) = %.2f", x, Math.sin(Math.toRadians(x)));
        if (i<3){
            System.out.print("\t");
            i++;
        }
        else{
            System.out.print("\n");
            i=0;
        }
     }
 }
 public int [] initArray(){
     Random random = new Random();
     int[] myArray = new int[10];
     for(int i = 0; i < myArray.length; i++)
     {
         myArray[i] = random.nextInt(100);
     }
     System.out.println("\nSource array "+ Arrays.toString(myArray));
     return myArray;
 }
 public void changeArray(int[] myArray){
     //int i=0;
     for(int i=0; i < myArray.length; i++){
         if(myArray[i] % 2 == 0)
             myArray[i] = 0;
     }
     System.out.println("Result array "+ Arrays.toString(myArray));
 }

 public void sumArray(int[] myArray){
     double sum = 0;
     for(int element:myArray){
         sum = sum + element;
     }
 System.out.println("Average of array = " + sum/myArray.length);
 }
}

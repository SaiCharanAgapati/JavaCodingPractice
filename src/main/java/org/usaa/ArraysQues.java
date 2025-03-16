package org.usaa;

import javax.swing.plaf.IconUIResource;
import javax.swing.plaf.MenuItemUI;
import java.util.HashSet;

public class ArraysQues {
    public static void main(String[] args) {
        //Second Larget Number in Array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            }
            if (i > secondMax && i != max) {
                secondMax = i;
            }

        }
        System.out.println(max + "," + secondMax);


        //Third Largest Element
        int[] arr1 = {34, 56, 10, 2, 78, 86, 3, 33};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr1.length;i++){
            if(arr1[i]>first){
                third=second;
                second=first;
                first=arr1[i];
            }if (arr1[i]>second && arr1[i] != first) {
                third=second;
                second=arr1[i];

            }if(arr1[i]>third && arr1[i] != second && arr1[i] != first){
                third=arr1[i];
            }
        }
        System.out.println("First : "+first+" Second : "+second+" Third : "+third);

        //Duplicates in array

        String [] dupString={"har","har","maha","dev"};
        HashSet<String> duplicates=new HashSet<>();
        int count=0;
        for(int i=0;i<dupString.length;i++){
            for(int j=i+1;j<dupString.length;j++){
                if(dupString[i].equals(dupString[j]) && j!=i){
                    duplicates.add(dupString[i]);
                    count++;
                }
            }

        }
        System.out.println("Duplicates are :: "+count);
        System.out.println("Duplicates are :: "+duplicates);

        //Product of max of three highest number i array
        int [] arr2={1,9,3,4,6,7,8,5,2};
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int thirdHighest = Integer.MIN_VALUE;
        for(int x :arr2){
            if(x>firstHighest){
                thirdHighest=secondHighest;
                secondHighest=firstHighest;
                firstHighest=x;
            }if(x>secondHighest && x != firstHighest){
                thirdHighest=secondHighest;
                secondHighest=x;
            }if(x>thirdHighest && x!= firstHighest && x!=secondHighest){
                thirdHighest=x;
            }
        }
        Long l= (long) (firstHighest*secondHighest*thirdHighest);
        System.out.println("Product of three highest numbers = " +l);
        System.out.println("Product of first highest numbers = " +firstHighest);
        System.out.println("Product of second highest numbers = " +secondHighest);
        System.out.println("Product of third highest numbers = " +thirdHighest);

    //Max Number of Consecutive  1's i an array

        int [] arr3={0,0,1,1,1,1,0,0,1,0,1,1,0,1,1,1,1,1};
        int maximum=0;
        int count1=0;
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]==1){
                count1++;
            }else{
                maximum=Math.max(maximum,count1);
                count1=0;
            }
            maximum=Math.max(maximum,count1);
        }
        System.out.println(maximum);
    }
}

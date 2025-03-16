package org.usaa;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        String s="charan";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);

        Main obj=new Main();
        int x=10;
        if(obj.SearchInArray(x)){
            System.out.println("Number found in array");
        }else {
            System.out.println("not found");
        }


        System.out.println("Largest, Smallest Number In Array : " +obj.LargestNumber());
    }
    //Search in Array
    public boolean SearchInArray(int x) {
        int[] arr = {2, 6, 4, 9, 7, 1};
        for (int i = 0; i < arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
    //Max number in array
    public List<Integer> LargestNumber() {
        int[] arr1 = {41, 10, 12, 14, 32};
        List<Integer> l=new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if(arr1[i]<small){
                small=arr1[i];
            }

        }
        l.add(max);
        l.add(small);
        return l;
    }
}
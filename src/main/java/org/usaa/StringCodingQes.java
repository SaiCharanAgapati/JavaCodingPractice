package org.usaa;

import java.util.*;

public class StringCodingQes {
    public static void main(String[] args) {


        //Palindrome check
        String s1 = "cec";
        int left = 0;
        int right = s1.length()-1;
        boolean palindrome=true;
        while (left < right) {
            if (s1.charAt(left) == s1.charAt(right)) {
                left++;
                right--;
            }else {
                palindrome=false;
                break;
            }

        }
        if(palindrome){
            System.out.println("It is a Palindrome");
        }else {
            System.out.println("not a Palindrome");
        }

        //Reverse words in a Given String

        String s2="welcome to java";
        String [] words=s2.split(" ");
        System.out.println(Arrays.toString(words));
        int left1=0;
        int right1=words.length-1;
        String temp="";
        while (left1 < right1){
            temp=words[left1];
            words[left1]=words[right1];
            words[right1]=temp;
            left1++;
            right1--;

        }
        System.out.println(Arrays.toString(words));
        String newWord="";
        for(String word :words){
            newWord=newWord +" "+ word;
        }
        System.out.println(newWord.trim());

        //First non-repeating character in a String
        String s3="newStreing";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s3.length();i++){
            char ch=s3.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else {
                map.put(ch, map.get(ch)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey() +" This is the first Non repeting char in string ");
                break;
            }else {
                System.out.println("No non repeting characters");
            }


        }

        //Longest SubString in a given String
        //EX:abcabcd
        String s4="abcabcdabcdeabcdef";
        HashSet<Character> set=new HashSet<>();
        String longestSubString="";
        String currentSubString="";
        int count=0;
        for(int i=0;i<s4.length();i++){
            if(!set.contains(s4.charAt(i))){
                char c=s4.charAt(i);
                set.add(c);
                currentSubString +=c;
            }else {
                if(currentSubString.length()>longestSubString.length()){
                    longestSubString=currentSubString;
                    currentSubString=""+s4.charAt(i);
                    set.clear();
                    set.add(s4.charAt(i));
                }else {
                    set.clear();
                }

            }
        }if(currentSubString.length()>longestSubString.length()){
            longestSubString=currentSubString;

        }
        System.out.println(longestSubString);

        //Practice LOngestSub String
        String s5="kjdfabviufecvjdfbviudh";
        String longest="";
        String current="";
        HashSet<Character> set1=new HashSet<>();
        for(int i=0;i<s5.length();i++){
            char c=s5.charAt(i);
            if(!set1.contains(c)){
                current += c;
                set1.add(c);
            }else if(current.length()>longest.length()){
                longest=current;
                while (current.charAt(0)!=c){
                    set1.remove(s5.charAt(0));
                    current=current.substring(1);
                }
            }
            current=current.substring(1)+c;
        }
        if(current.length()>longest.length()){
            longest=current;
        }

        System.out.println(longest);


    }
}

package org.usaa;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        String  [] geek={"abc","hc","kn","heu"};
        List<String > list=new ArrayList<>();

        Collections.addAll(list,geek);
        System.out.println(list);
        list.stream().forEach(System.out::println);

        //Read Only list
        list=Collections.unmodifiableList(list);
        List<Integer> list2=new ArrayList<>(List.of(1,2,3,4,5,6));
        list2.add(10);
        System.out.println(list2);
        list2.add(2,20);
        list2.remove(3);
        System.out.println(list2);

        //Given a list of integers, find out all the even numbers that
        // exist in the list using Stream functions?
        List<Integer> list3=new ArrayList<>(List.of(1,2,3,4,2,4,5,6,7,8,9,10,11,12,13)) ;
        list3.stream().filter(n->n%2==0).forEach(System.out::println);

        //duplicates in list
        HashSet<Integer> set =new HashSet<>();
        list3.stream().filter(n->!set.add(n)).forEach(System.out::println);
    }
}

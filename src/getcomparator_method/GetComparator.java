/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcomparator_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Amit Kakade
 */
public class GetComparator {

    public static void main(String[] args) {
        //SortedSet<String> set = new TreeSet<>(Collections.reverseOrder());
        SortedSet<String> set = new TreeSet<>();
        set.add("Tejas");
        set.add("Akash");
        set.add("Swapnesh");
        set.add("Rahul");
        System.out.println(set);
        System.out.println(set.spliterator().getComparator());

        ArrayList<String> list = new ArrayList<>();
        list.add("Mahesh");
        list.add("Swapnil");
        list.add("Rohan");
        list.add("Bhavna");
        System.out.println(list);
        System.out.println(list.spliterator().getComparator());
    }
    
}

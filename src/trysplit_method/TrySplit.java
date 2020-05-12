/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trysplit_method;

import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

/**
 *
 * @author Amit Kakade
 */
public class TrySplit {

    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Tejas");
        set.add("Akash");
        set.add("Swapnesh");
        set.add("Rahul");
        Spliterator<String> split1 = set.spliterator();
        Spliterator<String> split2 = split1.trySplit();
        split1.forEachRemaining(System.out::println);
        System.out.println("Spliterator is splited");
        split2.forEachRemaining(System.out::println);
    }
    
}

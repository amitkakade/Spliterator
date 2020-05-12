/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreachremaining_method;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 *
 * @author Amit Kakade
 */
public class ForEachRemaining {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sumit");
        list.add("Arshad");
        list.add("Shubham");
        list.add("Shubham");
        list.add("Shubham");
        list.add("Kshitij");

        Spliterator<String> split = list.spliterator();

        System.out.println("Processing only one element");
        split.tryAdvance(System.out::println);
        
        System.out.println("Processing remaining element using forEachRemaining()");
        split.forEachRemaining(System.out::println);
    }
}

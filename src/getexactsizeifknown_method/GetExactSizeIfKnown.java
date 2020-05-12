/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getexactsizeifknown_method;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Spliterator;

/**
 *
 * @author Amit Kakade
 */
public class GetExactSizeIfKnown {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Adarsh");
        list.add("Harshada");
        list.add("Sarang");
        list.add("Mrunal");

        System.out.println("List Elements: " + list);
        Spliterator<String> splitrator = list.spliterator();
        System.out.println("getExactSizeIfKnown() before processing : [ " + splitrator.getExactSizeIfKnown() + " ]");
        splitrator.tryAdvance(x -> System.out.println(x));
        System.out.println("getExactSizeIfKnown() after processing : [ " + splitrator.getExactSizeIfKnown() + " ]");
        
        HashSet<String> set = new HashSet<String>();
        set.add("Bhakti");
        set.add("Avinash");
        set.add("Vinita");
        set.add("Pawan");
        
        System.out.println("\nSet Elements: " + set);
        splitrator = set.spliterator();
        System.out.println("getExactSizeIfKnown() before processing : [ " + splitrator.getExactSizeIfKnown() + " ]");
        splitrator.tryAdvance(x -> System.out.println(x));
        splitrator.tryAdvance(x -> System.out.println(x));
        System.out.println("getExactSizeIfKnown() after processing : [ " + splitrator.getExactSizeIfKnown() + " ]");
    }
}

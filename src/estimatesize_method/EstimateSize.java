
import java.util.ArrayList;
import java.util.Spliterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Amit Kakade
 */
public class EstimateSize {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bhupesh");
        list.add("Kshitij");
        list.add("Ajinkya");
        list.add("Aniket");
        
        System.out.println("List Elements: " + list);
        Spliterator<String> splitrator = list.spliterator();
        System.out.println("Printing Estimate Size before processing 1st element of list [ " + splitrator.estimateSize() + " ]");
        splitrator.tryAdvance(x -> System.out.println(x));
        System.out.println("We have procesed 1st element of list Now displaying Estimate size [ " + splitrator.estimateSize() + " ]");

    }
    
}

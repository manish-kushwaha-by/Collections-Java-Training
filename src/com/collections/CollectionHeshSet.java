package com.collections;
import java.util.*;
public class CollectionHeshSet {
    public static void display(HashSet<String> str, String name){
        System.out.println("-----------"+name+"-----------");
        Iterator <String> itr = str.iterator();
        int index=0;
        while(itr.hasNext()){
            String var = itr.next();
            System.out.println(index+". -> value = "+var+"  , HashCode = "+var.hashCode());
            index++;
        }
        System.out.println("------------ END ----------");

    }
    public static void main(String[] args) {
        // Allows null values
        // Doesn't allow duplicated

        HashSet<String> hash = new HashSet<>();
        hash.add("-3");
        hash.add("-2");
        hash.add("-1");
        hash.add("0");
        hash.add("1");
        //hash.add(null); // Error
        hash.add("1");
        hash.add("2");
        hash.add("3");
        hash.add("4");
        hash.add("5");
        hash.add("6");

        // display
        display(hash,"HASHSET");
        System.out.println("LinkedHashSet elements: "+hash);

        System.out.println("isContains "+hash.contains("0"));

        System.out.println("isEmpty() "+hash.isEmpty() );

        System.out.println("size() " + hash.size());

        hash.remove("2");
        display(hash,"removed 2 - HASHSET");

        //clone
        HashSet<String> clone = (HashSet<String>) hash.clone();
        display(clone,"CLONE - HASHSET");



        hash.clear();
        display(hash,"CLEARED - HASHSET");
        



    }
}

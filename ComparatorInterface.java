/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCollections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @Sir Darey
 * 
 * Comparator Interface 
 */



public class ComparatorInterface {
    static class Data <K, V> {
        private K key;
        private V value;

        public Data(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Data{" + "key=" + key + ", value=" + value + '}';
        }        
    }
    
    public static void main(String[] args) {
        Comparator<Data<Integer, String>> compareKey = (Data<Integer, String> data1, Data<Integer, String> data2) -> {
            if (data1.getKey() > data2.getKey())
                return 1;
            else if (data2.getKey() > data1.getKey())
                return -1;
            else {
                return (data2.getValue().compareTo(data1.getValue()));
            }
        };
        
        Comparator<Integer> com = (Integer x, Integer y) -> {
            return 0;
        };
        Set <Integer> s = new TreeSet<>(com);
        Set <Data<Integer, String>> set = new TreeSet<>(compareKey);
        
        set.add(new Data(1, "one"));
        set.add(new Data(5, "five"));
        set.add(new Data(2, "two"));
        set.add(new Data(7, "Seven"));
        set.add(new Data(7, "seven"));
        
        set.forEach(data -> {
            System.out.println(data);
        });
           
        System.out.println("\n******* Using Iterator to print data******* \n");
        Iterator<Data<Integer, String>> it = set.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}

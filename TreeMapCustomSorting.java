/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCollections;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @ir Darey
 */
public class TreeMapCustomSorting  {
   
    static class Course implements Comparable<Course>{
        private String code;

        public Course(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
        
        @Override
        public String toString() {
            return "Course{" + "code=" + code + '}';
        }

        @Override
        public int compareTo(Course o) {
            return code.compareTo(o.getCode()); 
            //This will sort the courseMap based on Alphabetical order of the Course "code"
        }
              
    }
    
    public static void main(String[] args) {        
        Map <Course, Integer> map = new TreeMap<>();
        map.put(new Course("EEG317"), 27);
        map.put(new Course("CPE313"), 7);
        map.put(new Course("CPE513"), 1);
        
        
        map.entrySet().forEach(x-> {
            System.out.println(x.getKey());
        });
       
    }
}

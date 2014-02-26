package com.bionic.javase.week4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetPerformanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> coll1 = new HashSet<>();
        for (int i =0; i<100000; i++) {
            coll1.add(i);
        }
        long t1 =System.nanoTime();
        coll1.remove((Integer) 50000);
        long t2 = System.nanoTime();
        long t = (t2-t1)/1000;
        System.out.println("Elapsed time: "+t+" mks");
        
        
		TreeSet <Integer> coll2 = new TreeSet<>();
        for (int i =0; i<100000; i++) {
            coll2.add(i);
        }
        t1 =System.nanoTime();
        coll2.remove((Integer) 50000);
        t2 = System.nanoTime();
        t = (t2-t1)/1000;
        System.out.println("Elapsed time: "+t+" mks");
        
		ArrayList <Integer> coll3 = new ArrayList <>();
        for (int i =0; i<100000; i++) {
            coll3.add(i);
        }
        t1 =System.nanoTime();
        coll3.remove((Integer) 50000);
        t2 = System.nanoTime();
        t = (t2-t1)/1000;
        System.out.println("Elapsed time: "+t+" mks");


	}

}

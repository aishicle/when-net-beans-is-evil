/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one.three;

import one.First;
import two.Third;

public class Second {
    public int e = 5;
    private int f = 6;
    protected int g = 7;
    int h = 8;
   
    public void display() {
        First objB = new First(); 
        Third objI = new Third();
       
        System.out.println(objB.a);
        System.out.println(objB.b);
        System.out.println(objB.c);
        System.out.println(objB.d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(objI.i);
        System.out.println(objI.j);
        System.out.println(objI.k);
        System.out.println(objI.l);
        System.out.println(l);
        
    }
}

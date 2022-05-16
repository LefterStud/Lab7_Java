package com.company;

import com.company.classes.Vector;

public class Main {
    /**
     * Lefter Olexiy, 18
     */
    public static void main(String[] args) {
        Vector aVector = new Vector(1, 2, 3);
        Vector bVector = new Vector(4, 5, 6);
        System.out.println("a = " + aVector);
        System.out.println("b = " + aVector);
        System.out.println("c=(a+a)xb = " + Vector.vectorProduct((Vector.sum(aVector, aVector)), bVector));
        System.out.println("d=ab = " + Vector.scalarProduct(aVector, bVector));
        System.out.println(Vector.isCollinear(aVector, bVector));
    }
}

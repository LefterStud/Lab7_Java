package com.company.classes;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(final int x, final int y, final int z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static Vector sum(Vector aVector, Vector bVector) {
        return new Vector(aVector.getX() + bVector.getX(), aVector.getY() + bVector.getY(), aVector.getZ() + bVector.getZ());
    }

    public static double scalarProduct(Vector aVector, Vector bVector) {
        return aVector.getX() * bVector.getX() + aVector.getY() * bVector.getY() + aVector.getZ() * bVector.getZ();
    }

    public static Vector vectorProduct(Vector aVector, Vector bVector) {
        return new Vector((aVector.getY() * bVector.getZ() - aVector.getZ() * bVector.getY()), (aVector.getZ() * bVector.getX() - aVector.getX() * bVector.getZ()), (aVector.getX() * bVector.getY() - aVector.getY() * bVector.getX()));
    }

    public static boolean isCollinear(Vector aVector, Vector bVector) {
        double n = bVector.getY() / aVector.getY();
        boolean isCollinear=false;
        if(((aVector.getX() / bVector.getX()) == (aVector.getY() / bVector.getY())) && ((aVector.getX() / bVector.getX()) == (aVector.getZ() / bVector.getZ()))&&((aVector.getY() / bVector.getY()) == (aVector.getZ() / bVector.getZ()))){
            isCollinear = true;
        }
        if((n*aVector.getX()==bVector.getX())&&((n*aVector.getY()==bVector.getY())&&((n*aVector.getZ()==bVector.getZ())))){
            isCollinear = true;
        }
        if(((vectorProduct(aVector, bVector).getY() == 0))&&(vectorProduct(aVector, bVector).getY() == 0) && (vectorProduct(aVector, bVector).getZ() == 0)){
            isCollinear = true;
        }
        return isCollinear;
    }

}

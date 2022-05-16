package com.company.classes;

public class Vector {
    private int ax;
    private int ay;
    private int az;
    private int bx;
    private int by;
    private int bz;

    public Vector(final int ax, final int ay, final int az, final int bx, final int by, final int bz) {
        this.setAx(ax);
        this.setAy(ay);
        this.setAz(az);
        this.setBx(bx);
        this.setBy(by);
        this.setBz(bz);
    }

    public void setAx(int ax) {
        this.ax = ax;
    }
    public void setAy(int ay) {
        this.ay = ay;
    }
    public void setAz(int az) {
        this.az = az;
    }
    public void setBx(int bx) {
        this.bx = bx;
    }
    public void setBy(int by) {
        this.by = by;
    }
    public void setBz(int bz) {
        this.bz = bz;
    }

    public int getAx() {
        return ax;
    }
    public int getAy() {
        return ay;
    }
    public int getAz() {
        return az;
    }
    public int getBx() {
        return bx;
    }
    public int getBy() {
        return by;
    }
    public int getBz() {
        return bz;
    }

    

}

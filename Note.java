/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss.model;

/**
 *
 * @author INT105
 */
public class Note extends Samsung {

    private double hasPen = 3000;

    public Note(double hasPen, long id, String model, double price) {
        super(id, model, price);
        this.hasPen = hasPen;
    }

    public double getHasPen() {
        return hasPen;
    }

    public void setHasPen(double hasPen) {
        this.hasPen = hasPen;
    }

    @Override
    public double pay() {
        return getPrice() + hasPen;
    }

    @Override
    public String toString() {
        return "Note : " + super.toString() + " ,Has Pen = " + hasPen
                + "\nTotal : " + (super.getPrice() + hasPen)
                + "\n";
    }

}

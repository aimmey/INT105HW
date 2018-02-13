package ss.model;

public class GalaxyS extends Samsung {

    private double noPen = 0;

    public GalaxyS(double noPen, long id, String model, double price) {
        super(id, model, price);
        this.noPen = noPen;
    }

    public double getNoPen() {
        return noPen;
    }

    public void setNoPen(double noPen) {
        this.noPen = noPen;
    }

    @Override
    public double pay() {
        return getPrice() + noPen;
    }

    @Override
    public String toString() {
        return "GalaxyS : " + super.toString() + " ,No Pen = " + noPen
                +"\nTotal = "+(super.getPrice()+noPen)
                +"\n";
    }

}

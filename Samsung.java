package ss.model;

public class Samsung {
    private long id;
    private String model;
    private double price;

    public Samsung() {
    }

    public Samsung(long id, String model, double price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double pay(){
        return price;
    }

    @Override
    public String toString() {
        return "id = " + id + ", model = " + model + ", price = " + price;
    }
    
    
}

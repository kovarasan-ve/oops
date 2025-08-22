class Device {
    
    private String brand;
    private String model;
    private double price;

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        if (price > 0) { 
            
            this.price = price;
        } else {
            System.out.println("Invalid Price!");
        }
    }

    
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
    
        Device d1 = new Device();

        
        d1.setBrand("Samsung");
        d1.setModel("Galaxy S25");
        d1.setPrice(79999);

        
        System.out.println("Device Details:");
        System.out.println("Brand: " + d1.getBrand());
        System.out.println("Model: " + d1.getModel());
        System.out.println("Price: ₹" + d1.getPrice());
    }
}

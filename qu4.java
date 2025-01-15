class LED {
    private int id;
    private String brand;
    private double price;

    public LED(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("LED ID: " + id + ", Brand: " + brand + ", Price: Rs" + price);
    }
}

class LEDComparison {

    public static void compareAndMarkPremium(LED sony, LED samsung) {
        if (sony.getPrice() > samsung.getPrice()) {
            sony.setBrand("Premium Model - Sony");
        } else if (samsung.getPrice() > sony.getPrice()) {
            samsung.setBrand("Premium Model - Samsung");
        }
    }

    public static void showLEDDetails(LED sony, LED samsung) {
        sony.displayDetails();
        samsung.displayDetails();
    }

    public static void main(String[] args) {
        LED sonyLED = new LED(1, "Sony", 200000.00);
        LED samsungLED = new LED(2, "Samsung", 500000.00);

        compareAndMarkPremium(sonyLED, samsungLED);
        showLEDDetails(sonyLED, samsungLED);
    }
}
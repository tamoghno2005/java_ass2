class Laptop {
    private String brand;
    private double price;
    private String processorType;


    public Laptop(String brand, double price, String processorType) {
        this.brand = brand;
        setPrice(price); 
        this.processorType = processorType;
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
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Price: Rs" + price + ", Processor: " + processorType;
    }
}


class User {
    private String username;
    private String address;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void findAndPurchaseLaptop(Laptop[] laptops) {
        boolean purchased = false;

  
        for (Laptop laptop : laptops) {
            if ("Intel Core Ultra".equals(laptop.getProcessorType())) {
                System.out.println(username + " has purchased the " + laptop.getBrand() + " laptop with Intel Core Ultra processor.");
                System.out.println(laptop);
                purchased = true;
                break;
            }
        }
		
        if (!purchased) {
            System.out.println(username + " did not purchase any laptop as none have the Intel Core Ultra processor.");
        }
    }
}

class LaptopPurchaseSystem {
	
    public static void createAndCompareLaptops() {
        Laptop hpLaptop = new Laptop("HP", 70000.00, "Intel Core i7");
        Laptop lenovoLaptop = new Laptop("Lenovo", 60000.00, "Intel Core Ultra");
        Laptop dellLaptop = new Laptop("Dell", 80000.00, "Intel Core i5");

        Laptop[] laptops = { hpLaptop, lenovoLaptop, dellLaptop };

     
        User user = new User();
        user.setUsername("Tamoghno");
        user.setAddress("Shyamnagar, Kolkata");

        user.findAndPurchaseLaptop(laptops);
    }

    public static void main(String[] args) {
		
        createAndCompareLaptops();
    }
}
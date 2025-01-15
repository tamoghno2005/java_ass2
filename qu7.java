class Mobile {
    private String brand;
    private String model;
    private String androidVersion;
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }
	
    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Android Version: " + androidVersion);
    }
}

class Shop {
    private Mobile[] mobiles;

   
    public void setMobiles(Mobile[] mobiles) {
        this.mobiles = mobiles;
    }

    
    public Mobile findVivoWithAndroid15() {
        for (Mobile mobile : mobiles) {
            if ("VIVO".equals(mobile.getBrand()) && "Android 15".equals(mobile.getAndroidVersion())) {
                return mobile;
            }
        }
        return null; 
    }
}

class Customer {
    private String name;
    private String address;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public void attemptPurchase(Shop shop) {
        Mobile mobileToPurchase = shop.findVivoWithAndroid15();

        if (mobileToPurchase != null) {
            System.out.println(name + " purchased a VIVO mobile with Android 15.");
            mobileToPurchase.displayDetails();
        } else {
            System.out.println(name + " did not find a VIVO mobile with Android 15 in the shop.");
        }
    }
}

class MobileShopSystem {

    
    public static void setupAndPurchase() {
        
        Mobile vivoMobile = new Mobile();
        vivoMobile.setBrand("VIVO");
        vivoMobile.setModel("V24 MAX");
        vivoMobile.setAndroidVersion("Android 15");

        Mobile samsungMobile = new Mobile();
        samsungMobile.setBrand("Samsung");
        samsungMobile.setModel("Galaxy S23");
        samsungMobile.setAndroidVersion("Android 13");

        Mobile iphoneMobile = new Mobile();
        iphoneMobile.setBrand("Apple");
        iphoneMobile.setModel("iPhone 15");
        iphoneMobile.setAndroidVersion("iOS 15");

      
        Mobile[] mobiles = {vivoMobile, samsungMobile, iphoneMobile};

      
        Shop shop = new Shop();
        shop.setMobiles(mobiles);

        
        Customer customer = new Customer();
        customer.setName("Tamoghno");
        customer.setAddress("Shyamnagar, Kolkata");

        
        customer.attemptPurchase(shop);
    }

    public static void main(String[] args) {
       
        setupAndPurchase();
    }
}
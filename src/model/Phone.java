package model;

public class Phone {
    private String brand;
    private String model;

    private Screen phoneScreen;

    private Battery phoneBattery;

    public Phone(String b, String m, Screen s, Battery bat) {
        this.brand = b;
        this.model = m;
        this.phoneScreen = s;
        this.phoneBattery = bat;
    }

    public Phone() {
    }

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

    public Screen getPhoneScreen() {
        return phoneScreen;
    }

    public void setPhoneScreen(Screen phoneScreen) {
        this.phoneScreen = phoneScreen;
    }

    public Battery getPhoneBattery() {
        return phoneBattery;
    }

    public void setPhoneBattery(Battery phoneBattery) {
        this.phoneBattery = phoneBattery;
    }

    public void powerOn() {
        System.out.println("Hello, welcome to " + brand + " " + model);

        if (phoneScreen != null) {
            System.out.println("This phone has a screen.");
        } else {
            System.out.println("This phone has no screen");
        }

        if (phoneBattery != null) {
            System.out.println("This phone has a battery");
        } else {
            System.out.println("This phone has no battery");
        }
    }

}

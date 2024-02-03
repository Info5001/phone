import model.Battery;
import model.Phone;
import model.Screen;

public class PhoneMain {
    public static void main(String[] args) throws Exception {
        /**
         * +1. Rename the main class from App.java to PhoneMain.java
         * +2. Create a package named 'model' (package is a folder)
         * +3. Create a class Phone
         * +4. First play with a single class phone
         * +5. Create additional classes based on different parts of the phone
         * +6. Then create separate parts and "assemble" them in the Phone class
         */
        // Why this is important? We want to demonstrate how to create relationships
        // between classes

        // Create a phone
        Phone iPhone13 = new Phone();
        iPhone13.setBrand("Apple");
        iPhone13.setModel("iPhone 13");

        Screen iPhone13Screen = new Screen();
        iPhone13Screen.setSize(6.1f);
        iPhone13Screen.setResolutionWidth(1170);
        iPhone13Screen.setResolutionHeight(2532);
        iPhone13Screen.setTechnology("OLED");

        Battery iPhone13Battery = new Battery();

        iPhone13.setPhoneScreen(iPhone13Screen);
        iPhone13.setPhoneBattery(iPhone13Battery);

        Phone samsungS24Ultra = new Phone();
        samsungS24Ultra.setBrand("Samsung");
        samsungS24Ultra.setModel("Galaxy S24 Ultra");

        Screen samsungScreen = new Screen();
        samsungScreen.setSize(6.8f);
        samsungScreen.setResolutionWidth(1440);
        samsungScreen.setResolutionHeight(3200);
        samsungScreen.setTechnology("AMOLED");

        Battery samsungBattery = new Battery();
        samsungBattery.setCapacity("5000 mAh");

        iPhone13.powerOn();
        samsungS24Ultra.powerOn();

    }
}

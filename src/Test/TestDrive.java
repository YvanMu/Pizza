package Test;

import java.util.Scanner;
import model.PizzaConfig;

public class TestDrive {

    StringBuilder build = new StringBuilder();

    public static void main(String[] args) {
//the menu methods

        new TestDrive().menue();

    }

    PizzaConfig conf = new PizzaConfig();
    PizzaConfig pizza = new PizzaConfig();

    public void menue() {
        System.out.println("......................................");
        System.out.println("WElCome To palm Pizza Restaurent\n");
        System.out.println("......................................");
        double totalPrice = 0.0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("...............................");
        System.out.println("Enter Pizza Name You want here:");
        System.out.println("...............................");
        String selected = scanner.nextLine();
        pizza.setName(selected);
        System.out.println("Thanks for selecting: " + pizza.getName());
        System.out.println("What  size of " + pizza.getName() + " Would you like? \n");
        System.out.println("Press 1: for Large =4500Rwf\n");
        System.out.println("Press 2: for Medium =3000Rwf\n");
        System.out.println("Press 3: for Small =1000Rwf\n");
        double price = 0.0;
        int size = scanner.nextInt();

        switch (size) {
            case 1:
                pizza.setSize("Large");
                pizza.setBaseprice(4500);
                price = 4500;
                break;

            case 2:
                pizza.setSize("Medium");
                pizza.setBaseprice(3000);
                price = 3000;
                break;

            case 3:
                pizza.setSize("Small");
                pizza.setBaseprice(1000);
                price = 1000;

        }

        //Delivery or east-in checking
        boolean terminate = false;
        while (!terminate) {
            System.out.println("Do you want to Delivery? \n Enter Y or N" + " :" + "There is Charges for Derivering: 1000rwf");
            String delivery = scanner.next();

            if (delivery.toUpperCase().equals("Y")) {

                totalPrice = price + 1000;
                double amount = 1000;
                pizza.setDelivery(amount);
                System.out.println("Total Price is: " + totalPrice);
                terminate = true;
            } else if (delivery.toUpperCase().equals("N")) {

                totalPrice = price;
                double amount = 0.0;
                System.out.println("TotalPrice is : " + totalPrice);
                pizza.setDelivery(amount);
                terminate = true;
            } else {
                System.err.println("No match.");
                terminate = false;
            }
        }

        meatOrVegetableOptionSet(pizza, totalPrice);
    }

    public void meatOrVegetableOptionSet(PizzaConfig config, double totalPrice) {

        boolean terminated = false;
        Scanner scan = new Scanner(System.in);

        String category = "";

        while (!terminated) {

            System.out.println("Press 1 For Meat.  Press 2 For Vegetable");

            switch (scan.nextInt()) {

                case 1:
                    String[] meatChoosen = meat();
                    category = "meat";
                    terminated = true;
                    config.setOptionsets(category, meatChoosen, totalPrice);
                //oset[iset]=config.getDelivery();
                case 2:
                    String[] vegetableChoosen = vegetable();
                    category = "vegetable";
                    terminated = true;
                    config.setOptionsets(category, vegetableChoosen, totalPrice);

                    //Here we call requestedOrdering method to dispay pizza requested by customer 
                    requestedOrdering();
            }

        }
    }

    // Method for MeatOptions
    public String[] meat() {
        String arrayOfMeat[] = new String[12];
        boolean terminated = false;
        Scanner scan = new Scanner(System.in);

        while (!terminated) {
            System.out.println("Press 1 For Beef. 2 For Peperoni. 3 For Anchovy. Press 4 For Ham . Press 5 -> go To Vegetable");
            switch (scan.nextInt()) {
                case 1:
                    build.append("Beef").append(" ");
                    requestedOrdering();
                    System.exit(0);
                    break;
                case 2:
                    build.append("Peperoni").append(" ");
                    requestedOrdering();
                    System.exit(0);
                    break;
                case 3:
                    build.append("Anchovy").append(" ");
                    requestedOrdering();
                    System.exit(0);
                    break;
                case 4:
                    build.append("Ham").append(" ");
                    requestedOrdering();
                    System.exit(0);
                    break;
                case 5:

                    terminated = true;
                    break;
                default:
                    System.err.println("wrong choice");
            }

        }
        return arrayOfMeat;

    }
    // Method for VegetableOptions

    public String[] vegetable() {
        int size = 1;
        String arrayOfVegetable[] = new String[12];
        int i = 0;
        boolean terminated = false;

        Scanner scan = new Scanner(System.in);
        while (!terminated) {
            System.out.println("Press 1 For Mushroom. 2 For Onion. 3 For Pineaple. 4 for Tomatoes. 5 back to meat. 6 For Finish ");
            switch (scan.nextInt()) {
                case 1:
                    build.append("Mushroom").append(" ");
                    requestedOrdering();
                    System.exit(0);
                    break;
                case 2:
                    build.append("Onion").append(" ");
                    requestedOrdering();
                    System.exit(0);
                    break;
                case 3:
                    build.append("Pineaple").append(" ");
                    requestedOrdering();
                    System.exit(0);
                    break;
                case 4:
                    build.append("Tomatoes").append(" ");
                    requestedOrdering();
                    System.exit(0);
                    break;

                case 5:
                    meat();
                    break;

                case 6:

                    terminated = true;
                    break;
            }
        }
        return arrayOfVegetable;
    }

    //Complete Customer Order Here:
    public void requestedOrdering() {
        System.out.println("---------------------------------------------------------");
        System.out.println("THANK YOU FOR ORDERING PALM PIZZA");
        System.out.println("----------------------------------------------------------");
        System.out.println("This is your Requested Pizza Order:");
        System.out.println("----------------------------------------------------------");
        System.out.println("Pizza Name: " + pizza.getName());
        System.out.println("Pizza Size: " + pizza.getSize());
        System.out.println("Pizza Price: " + pizza.getBaseprice());
        double basePrice = pizza.getBaseprice();
        System.out.println("Pizza Derrivering Charge:" + pizza.getDelivery());
        Double deriver = pizza.getDelivery();
        System.out.println("This " + pizza.getName() + " Will Be Made Of: \n" + build);
        double totalAmount = basePrice + deriver;
        System.out.println("Total Amount To Pay :" + totalAmount);
        System.out.println("----------------------------------------------------------");
        System.out.println("Thanks!");
        System.out.println(" Please be Patient a Second while we are preparing your Pizza for you!!!!");
    }

}

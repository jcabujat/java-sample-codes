package com.BillsBurger;

import java.util.Scanner;

import static com.BillsBurger.Validate.validateInput;

class Hamburger {
    private String rollType;
    private String meat;
    private double price;
    private String name;
    private AddOns addOns;

    public Hamburger(String rollType, String meat, double price, String name,
                     AddOns addOns) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
        this.addOns = addOns;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public void calculateTotalPrice() {
        System.out.println("\n" + name + " (" + rollType + ", " + meat + ")"
                + " price = " + price);
        addOns.displayAddOns();
        double totalPrice = addOns.calculateAddOns() + price;
        System.out.println("Total burger price = $" + totalPrice);
    }

}

class HealthyBurger extends Hamburger {

    public HealthyBurger(String meat, double price, String name, AddOns addOns) {
        super("Brown rye bread roll", meat, price, name, addOns);
    }

}

class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String rollType, String meat, double price, String name) {
        super(rollType, meat, price, name, new AddOns());
    }

    @Override
    public void calculateTotalPrice() {
        System.out.println(super.getName() + "\n" + super.getRollType() + ", " +
                super.getMeat() + " with Chips and Drinks"
                + "\nTotal burger price = " + super.getPrice());

    }
}

class AddOns {
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean cheese;
    private boolean egg;
    private boolean bacon;
    private boolean patty;
    private final double lettucePrice = 5;
    private final double tomatoPrice = 3;
    private final double carrotPrice = 3;
    private final double cheesePrice = 3;
    private final double eggPrice = 3;
    private final double baconPrice = 3;
    private final double pattyPrice = 3;

    public void displayAddOns() {
        System.out.println("Add-Ons:");
        if (lettuce) {
            System.out.println("Lettuce - $" + lettucePrice);
        }
        if (tomato) {
            System.out.println("Tomato - $" + tomatoPrice);
        }
        if (carrot) {
            System.out.println("Carrot - $" + carrotPrice);
        }
        if (cheese) {
            System.out.println("Cheese - $" + cheesePrice);
        }
        if (egg) {
            System.out.println("Egg - $" + eggPrice);
        }
        if (bacon) {
            System.out.println("Bacon - $" + baconPrice);
        }
        if (patty) {
            System.out.println("Patty - $" + pattyPrice);
        }
        System.out.println("Total Add-on price = $" + calculateAddOns());
    }

    public double calculateAddOns() {
        double additionalPrice = 0;
        if (lettuce) {
            additionalPrice += lettucePrice;
        }
        if (tomato) {
            additionalPrice += tomatoPrice;
        }
        if (carrot) {
            additionalPrice += carrotPrice;
        }
        if (cheese) {
            additionalPrice += cheesePrice;
        }
        if (egg) {
            additionalPrice += eggPrice;
        }
        if (bacon) {
            additionalPrice += baconPrice;
        }
        if (patty) {
            additionalPrice += pattyPrice;
        }
        return additionalPrice;
    }

    public void chooseAddOns(int burgerType) {
        int allowedAddOns = 0;
        switch (burgerType) {
            case 1:
                allowedAddOns = 4;
                break;
            case 2:
                allowedAddOns = 6;
                break;
            case 3:
                return;
        }
        System.out.println("Choose add-ons: " +
                "\nYou may choose up to " + allowedAddOns + " add-ons" +
                "\n 1. Lettuce (+ $" + lettucePrice + ")" +
                "\n 2. Tomato (+ $" + tomatoPrice + ")" +
                "\n 3. Carrot (+ $" + carrotPrice + ")" +
                "\n 4. Cheese (+ $" + cheesePrice + ")" +
                "\n 5. Egg (+ $" + eggPrice + ")" +
                "\n 6. Bacon (+ $" + baconPrice + ")" +
                "\n 7. Patty (+ $" + pattyPrice + ")");

        Scanner order = new Scanner(System.in);
        System.out.println("Select Add-on: ");
        int validAddOns = 0;
        while (validAddOns < allowedAddOns) {
            boolean hasNextInt = order.hasNextInt();
            if (hasNextInt) {
                int addOnType = order.nextInt();
                boolean isValid = validateInput(addOnType, 7);
                if (!isValid) {
                    continue;
                }
                switch (addOnType) {
                    case 1:
                        validAddOns += 1;
                        displayRemaining("Lettuce", allowedAddOns - validAddOns);
                        lettuce = true;
                        break;
                    case 2:
                        validAddOns += 1;
                        displayRemaining("Tomato", allowedAddOns - validAddOns);
                        tomato = true;
                        break;
                    case 3:
                        validAddOns += 1;
                        displayRemaining("Carrot", allowedAddOns - validAddOns);
                        carrot = true;
                        break;
                    case 4:
                        validAddOns += 1;
                        displayRemaining("Cheese", allowedAddOns - validAddOns);
                        cheese = true;
                        break;
                    case 5:
                        validAddOns += 1;
                        displayRemaining("Egg", allowedAddOns - validAddOns);
                        egg = true;
                        break;
                    case 6:
                        validAddOns += 1;
                        displayRemaining("Bacon", allowedAddOns - validAddOns);
                        bacon = true;
                        break;
                    case 7:
                        validAddOns += 1;
                        displayRemaining("Patty", allowedAddOns - validAddOns);
                        patty = true;
                        break;
                    case 0:
                        return;
                }
            } else {
                System.out.println("Invalid selection");
                order.nextLine();
                continue;
            }
        }
    }

    private static void displayRemaining(String addOn, int remainingAddOn) {
        System.out.println(addOn + " selected. " +
                remainingAddOn + " remaining add-on. " +
                "\nSelect more add-ons or press '0' to calculate total price:");
    }

}


public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose type of burger: " +
                    "\n 1. Regular Burger (up to 4 Add-ons) " +
                    "\n 2. Healthy Burger (up to 6 Add-ons)" +
                    "\n 3. Deluxe Burger (with chips and drinks - no Add-on)");
            Scanner order = new Scanner(System.in);
            boolean hasNextInt = order.hasNextInt();
            if (hasNextInt) {
                int burgerType = order.nextInt();
                boolean isValid = validateInput(burgerType, 3);
                if (isValid) {
                    createBurger(burgerType);
                } else {
                    continue;
                }
            } else {
                System.out.println("Invalid input");
                continue;
            }
        }
    }

    public static void createBurger(int burgerType) {
        switch (burgerType) {
            case 1:
                AddOns regAddOns = new AddOns();
                Hamburger hamburger = new Hamburger("Regular bread", "Regular patty", 15,
                        "Regular burger", regAddOns);
                regAddOns.chooseAddOns(burgerType);
                hamburger.calculateTotalPrice();
                break;
            case 2:
                AddOns healthAddOns = new AddOns();
                HealthyBurger healthyBurger = new HealthyBurger("Chicken patty", 20,
                        "Healthy burger", healthAddOns);
                healthAddOns.chooseAddOns(burgerType);
                healthyBurger.calculateTotalPrice();
                break;
            case 3:
                DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe bread", "Quarter-pound beef",
                        50, "Deluxe Burger");
                deluxeBurger.calculateTotalPrice();
                break;
        }
        System.exit(0);
    }

}

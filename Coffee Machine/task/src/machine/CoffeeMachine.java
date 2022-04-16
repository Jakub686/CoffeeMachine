package machine;

import java.util.Scanner;

public class CoffeeMachine {
    
    public static void main(String[] args) {
        int water =400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        boolean loopCondition= true;
        Scanner scanner = new Scanner(System.in);
        //status(water,milk,beans,cups,money);
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffeeType = scanner.nextLine();
                if (coffeeType.equals("1")) {
                    if(water>=250 & beans>=16&cups>=1) {
                        if(water<250){
                            System.out.println("Sorry, not enough water!");
                        }
                        if(beans<16){
                            System.out.println("Sorry, not enough beans!");
                        }
                        if(cups<1){
                            System.out.println("Sorry, not enough cups!");
                        }
                        if(water>250 & milk>16 & beans>0&cups>1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 250;
                            beans = beans - 16;
                            cups = cups - 1;
                            money = money + 4;
                        }
                    }
                }
                if (coffeeType.equals("2")) {
                    if (water < 350) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (beans < 75) {
                        System.out.println("Sorry, not enough milk!");
                    }
                    if (beans < 20) {
                        System.out.println("Sorry, not enough beans!");
                    }
                    if (cups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    }
                    if(water>350 & milk>75 & beans>20&cups>1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - 350;
                        milk = milk - 75;
                        beans = beans - 20;
                        cups = cups - 1;
                        money = money + 7;
                    }
                }
                if (coffeeType.equals("3")) {
                    if (water < 200) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (beans < 100) {
                        System.out.println("Sorry, not enough milk!");
                    }
                    if (beans < 12) {
                        System.out.println("Sorry, not enough beans!");
                    }
                    if (cups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    }
                    if (water > 200 & milk > 100 & beans > 12 & cups > 1){
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - 200;
                        milk = milk - 100;
                        beans = beans - 12;
                        cups = cups - 1;
                        money = money + 6;
                    }
                }
                if(coffeeType=="back"){
                }
            }
            if (action.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                water = water + scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add: ");
                milk = milk + scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add: ");
                beans = beans + scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add: ");
                cups = cups + scanner.nextInt();
                System.out.println();
            }
            if (action.equals("take")) {
                System.out.println("I gave you $" + money);
                money -= money;
                System.out.println();
            }
            if (action.equals("remaining")) {
                System.out.println();
                status(water, milk, beans, cups, money);
            }
            if (action.equals("exit")) {
                loopCondition = false;
            }
        }while(loopCondition);
    }
    public static void status(int water, int milk, int beans, int cups, int money){
        System.out.printf("The coffee machine has:%n" + water + " ml of water%n"+milk+" ml of milk%n"+beans+" g of coffe beans%n"+ cups +" disposable cups%n"+"$"+money+" of money%n");

    }
}


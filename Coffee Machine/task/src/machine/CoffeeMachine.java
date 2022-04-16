package machine;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class CoffeeMachine {


    public static void main(String[] args) {
        int water =400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        Scanner scanner = new Scanner(System.in);
        status(water,milk,beans,cups,money);
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();
        if(action.equals("buy")){
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            int coffeeType = scanner.nextInt();
            if(coffeeType==1) {
                water = water - 250;
                beans = beans - 16;
                cups = cups - 1;
                money = money + 4;
                status(water, milk, beans, cups, money);
            }
            if(coffeeType==2) {
                water = water - 350;
                milk = milk - 75;
                beans = beans - 20;
                cups = cups - 1;
                money = money + 7;
                status(water, milk, beans, cups, money);
            }
            if(coffeeType==3) {
                water = water - 200;
                milk = milk - 100;
                beans = beans - 12;
                cups = cups - 1;
                money = money + 6;
                status(water, milk, beans, cups, money);

            }
        }
        if(action.equals("fill")){
            System.out.println("Write how many ml of water you want to add:");
            water = water + scanner.nextInt();
            System.out.println("Write how many ml of milk you want to add: ");
            milk =  milk + scanner.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add: ");
            beans = beans + scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee you want to add: ");
            cups = cups + scanner.nextInt();
            System.out.println();
            status(water, milk, beans, cups, money);
        }
        if(action.equals("take")){
            System.out.println("I gave you $"+money);
            money -= money;
            status(water, milk, beans, cups, money);
            System.out.println();
        }


    }
    public static void status(int water, int milk, int beans, int cups, int money){
        System.out.printf("The coffee machine has:%n" + water + " ml of water%n"+milk+" ml of milk%n"+beans+" g of coffe beans%n"+ cups +" disposable cups%n"+"$"+money+" of money%n%n");

    }

}


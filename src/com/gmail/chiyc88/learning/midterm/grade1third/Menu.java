//package fju.order;
//
//import java.util.Scanner;
//
//public class Tester {
//    public static void main(String[] args) {
//        MenuItem[] menu = {
//                new PorkRice(), new ChickenRice(), new FriedNoodles(),
//                new BraisedPorkRice(), new FishBallSoup(), new WontonSoup(),
//                new EggSoup()
//        };
//        int number = -1;
//        Scanner scanner = new Scanner(System.in);
//        int total = 0;
//        int discount = 0;
//        int soup = 0;
//        int porkDish = 0;
//        while(number != 9) {
//            System.out.println("=== Menu ===");
//            for (int i = 0; i < menu.length; i++) {
//                MenuItem item = menu[i];
//                System.out.println(i + ")" + item.name + "(" + item.price + ")");
//            }
//            System.out.println("Please enter menu item number: ");
//            number = Integer.parseInt(scanner.next());
//            if (number != 9) {
//                if (menu[number] instanceof Soup) {
//                    soup++;
//                }
//                if (menu[number] instanceof Pork) {
//                    porkDish++;
//                }
//
//                if (soup != 0 && porkDish != 0 && soup == porkDish) {
//                    discount += 10;
//                }
//                System.out.println("Added item: " + menu[number].name);
//                total += menu[number].price;
//
//                System.out.println("Total: " + total + " / discount: " + discount);
//            }
//        }
//    }
//}

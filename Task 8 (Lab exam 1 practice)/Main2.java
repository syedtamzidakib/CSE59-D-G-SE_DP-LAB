import java.util.Scanner;

class ShoppingCart{
    double subtotal = 0;
    void addItem(String itemName, double price, int qty){
        subtotal = subtotal + (price* qty);
    }
    double applyDiscount(double percentage){
        return subtotal - (subtotal*percentage/100);
    }
    double calculateTotalwithTax(double taxRate, double amount){
        return amount + (amount*taxRate/100);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        String item1 = input.next();
        double price1 = input.nextDouble();
        int qty1 = input.nextInt();
        cart.addItem(item1, price1, qty1);

        String item2 = input.next();
        double price2 = input.nextDouble();
        int qty2 = input.nextInt();
        cart.addItem(item2, price2, qty2);

        input.next();
        double discount =input.nextDouble();

        input.next();
        double tax =input.nextDouble();

        double afterDiscount = cart.applyDiscount(discount);
        double total = cart.calculateTotalwithTax(tax, afterDiscount);

        System.out.println("Subtotal: "+(int)cart.subtotal);
        System.out.println("Total After "+(int)discount+"% discount and "+(int)tax+"% tax:"+total);

    }
    
}


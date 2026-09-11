import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("====welcome to flipkart shopping.com====");
   System.out.println("enter your product name");
   String product = input.nextLine();
   int price;
   System.out.println("enter your product price");
   price = input.nextInt();
   int quantity;
   System.out.println("enter your product quantity");
   quantity= input.nextInt();
   int total = price * quantity;
   System.out.println("your total bill is " + total);
   System.out.println("=======thank you for shopping with us have a nice day======");
   input.close();

    }
}
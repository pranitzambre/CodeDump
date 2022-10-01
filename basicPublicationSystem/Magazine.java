import java.util.Scanner;

public class Magazine extends Publication{

    String curentIssue;

    @Override
    void sellCopy(){
        System.out.println("Title: " + title + "\n");
        System.out.println("Price per 1 magazine: " + price + "\n");
        System.out.println("Copies ordered: " + copies + "\n");
        System.out.println("Total sale of 'Magazines' is "  + "₹" + (price*copies) + "\n");
    }

    void orderQuantity(){
        System.out.println("Enter Quantity (Magazine): \n");
        Scanner quantity = new Scanner(System.in);
        copies = quantity.nextInt();
    }

    void curentIssue(){
        System.out.println("Current issue of the Magazine is: " + curentIssue + "\n");

    }

    void recieveIssue(){
        System.out.println("You'll get " + curentIssue + " Magazine soon... \n");

    }

    @Override
    void setPrice(){
        System.out.println("Enter the title of the magazine: \n");
        Scanner tit = new Scanner(System.in);
        title = tit.next();

        System.out.println("Enter issue: \n");
        Scanner issue = new Scanner(System.in);
        curentIssue = issue.next();

        System.out.println("Enter the price of the magazine: \n");
        Scanner pri = new Scanner(System.in);
        price = pri.nextInt();
    }
}

import java.util.*;

public class Book extends Publication{

    String author;

    @Override
    void sellCopy(){
        System.out.println("Title: " + title + "\n");
        System.out.println("Author name: " + author + "\n");
        System.out.println("Price per 1 book: " + price + "\n");
        System.out.println("Copies ordered: " + copies + "\n");
        System.out.println("Total sale of 'Books' is "  + "₹" + (price * copies) + "\n");
    }

    void orderCopies(){
        System.out.println("Order Quantity: \n");
        Scanner sc1 = new Scanner(System.in);
        copies = sc1.nextInt();
    }

    @Override
    void setPrice(){
        System.out.println("Enter the title of the book: \n");
        Scanner tit = new Scanner(System.in);
        title = tit.next();

        System.out.println("Enter the author of the book: \n");
        Scanner auth = new Scanner(System.in);
        author = auth.next();

        System.out.println("Enter the price of the book: \n");
        Scanner pri = new Scanner(System.in);
        price = pri.nextInt();

    }
}

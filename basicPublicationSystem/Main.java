public class Main {
    public static void main(String[] args){
        Book b = new Book();
        b.setPrice();
        b.orderCopies();
        b.sellCopy();

        Magazine m = new Magazine();
        m.setPrice();
        m.orderQuantity();
        m.recieveIssue();
        m.sellCopy();
    }
}
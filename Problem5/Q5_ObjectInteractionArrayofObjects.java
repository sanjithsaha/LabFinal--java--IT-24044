class Book {
    int bookId;
    String title;
    double price;
    Book(int id, String t, double p) {
        bookId = id; title = t; price = p;
    }
}
public class Q5_ObjectInteractionArrayofObjects {
    public static void main(String[] args) {
        Book[] b = {
            new Book(1,"A",400),
            new Book(2,"B",600),
            new Book(3,"C",800),
            new Book(4,"D",300),
            new Book(5,"E",700)
        };
        double sum = 0;
        for (Book x : b) {
            if (x.price > 500)
                System.out.println(x.title + " " + x.price);
            sum += x.price;
        }
        System.out.println("Average: " + (sum / b.length));
    }
}
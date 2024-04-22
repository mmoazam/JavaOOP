public class Main {

    public static void main(String[] args) {
        String hello = "Hello World!";
        System.out.println(hello);

        Book book1 = new Book("A book", 200);
        book1.getTitle();
        System.out.println(book1.getCurrentPage());
        int randomNumber = (int) (Math.random() * 100);
        book1.turnPage(300);
        System.out.println(book1.getCurrentPage());
       // book1.turnPage(-50);
       // System.out.println(book1.getCurrentPage());



    }
}

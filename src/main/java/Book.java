public class Book {
    private String title;
    private int pages;
    private int currentPage = 1;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    public void turnPage(int input) {
        int minPages = 1;
        int result = 0;
        if (input > 0) {
            result = currentPage + input;
        } else if (input < 0) {
            result = currentPage - input;
        }
        if (result >= minPages && result <= pages){
            currentPage = result;
        } else {
            System.out.println("Error");
        }

    }
    public void getTitle() {
        System.out.println(this.title);
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public int getPages(){
        return pages;
    }


}

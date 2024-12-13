package class5;

public class Book {
    String title, author;

    public Book(String t){title = t; author="작자미상";}

    public Book(String t, String a) {title = t; author= a;}
    public  String getTitle(){return title;}
    public String getAuthor(){return author;}


    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");

        System.out.println(littlePrince.getTitle()+" "+littlePrince.getAuthor());
        System.out.println(loveStory.getTitle()+" "+loveStory.getAuthor());
    }
}

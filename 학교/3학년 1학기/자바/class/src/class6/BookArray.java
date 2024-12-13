package class6;

import java.util.Scanner;

public class BookArray {
    String title, author;
    void show(){System.out.println(title+" "+author);}
    public BookArray() {     this("", "");   }
    public BookArray(String title){   this(title,"작자미상");   }
    public BookArray(String title, String author) { this.title = title; this.author=author;}

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        BookArray [] book = new BookArray[2];

        for(int i=0; i<book.length;i++){
            System.out.print("제목>>");       String title = scanner.nextLine();
            System.out.print("저자>>");       String author = scanner.nextLine();
            book[i] = new BookArray(title, author);
        }
        for(int i=0; i<book.length;i++)
            book[i].show();

    }
}

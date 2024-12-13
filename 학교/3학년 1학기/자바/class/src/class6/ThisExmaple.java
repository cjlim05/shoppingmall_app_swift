package class6;

public class ThisExmaple {
    String title, author;

    void show(){System.out.println(title+" "+author);}

    public ThisExmaple() {     this("", "");   //     this.title = title; this.author=author; 이렇게 해도 같다.
    }
    public ThisExmaple(String title) { this(title, "작자미상"); //this.title = title; this.author="작자미상"; 이렇게 해도 같다.
    }
    public ThisExmaple(String title, String author){
        this.title = title; this.author=author;
        System.out.println("생산자 호출됨");
    }

    public static void main(String[] args) {
        ThisExmaple littlePrice = new ThisExmaple("어린왕자", "생덱쥐페리");  littlePrice.show();
        ThisExmaple LoveStory = new ThisExmaple("춘향전");  LoveStory.show();
        ThisExmaple emptyBook = new ThisExmaple();  emptyBook.show();

    }
}

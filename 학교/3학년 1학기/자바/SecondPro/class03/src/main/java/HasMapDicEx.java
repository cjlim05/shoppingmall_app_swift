
import java.util.*;

public class HasMapDicEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dic = new HashMap<String, String>();
        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");
    while(true){
        System.out.println("찾을 단어? ");
        String eng = scanner.next();
        if(eng.equals("exit")){
            System.out.println("종료");
            break;
        }
        String kor = dic.get(eng);
        if(kor==null)
            System.out.println(eng+" 없음");
        else System.out.println(kor);
    }
    }
}

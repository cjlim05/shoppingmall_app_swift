package example;

public class sum {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int answer = 0;
        if(a>b){
            for(int i=b; i<a+1; i++){answer+=i;}
        }
        else{ for(int i=0; i<b+1; i++){for(int j=a; j<b+1; j++){answer+=i;}
        }
        }
        System.out.println(answer);
    }
}

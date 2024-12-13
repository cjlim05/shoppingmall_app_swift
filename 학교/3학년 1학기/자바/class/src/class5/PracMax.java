package class5;

public class PracMax {
    public static void main(String[] args) {
        int max = 0;
        int arr[] = {4,7,3,8,5};
        for(int i = 0; i< arr.length;i++){
            if (max<arr[i]) max = arr[i];
        }

        System.out.println("max: " + max);
    }
}

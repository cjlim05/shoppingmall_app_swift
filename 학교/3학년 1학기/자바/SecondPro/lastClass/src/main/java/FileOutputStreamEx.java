//import java.io.*;
//.
//public class FileOut                                                                                                                                                                                                                                                                                                                                                                  putStreamEx {
//    public static void main(String[] args) {
//        byte b[] = {7,51,3,4,-1,24};
//        try{
//            FileOutputStream fout = new FileOutputStream("test.out");
//            for (int i=0;i<b.length;i++)
//                fout.write(b[i]);
//            fout.close();
//
//            byte b2[] = new byte[6];
//                                                                                                                                                                                                                                                                                      FileInputStream fin = new FileInputStream("test.out");
//            int n = 0, c;
//            while((c=fin.read())!=-1)
//                b2[n+1] = (byte)c;
//       ð     fin.close();xd
//            for (int i=0;i<b2.length;i++)
//                System.out.println(b2[i]+ " ");
//            System.out.println();
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//}

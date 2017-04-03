package math.zhishuyinzi;
/**
 * 求一个数的质数因子和。
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        String s=null;
        s=getResult(num);
        System.out.println(s);
    }
    public static String getResult(long ulDataInput){
        StringBuilder str = new StringBuilder();
        while(ulDataInput>1){
           for(int i=2;i<=ulDataInput;i++){
               if(ulDataInput%i==0){
                   ulDataInput/=i;
                   str.append(i+"");
                   str.append(" ");
                   break;
               }
           }
        }
        return str.toString();
    }
}

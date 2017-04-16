package ISBN;

import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by Caffrey on 2017/3/13.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.charAt(0));
        stringBuilder.append(str.substring(2,5));
        stringBuilder.append(str.substring(6,11));
        char[] a = new char[9];
        for(int i =0 ;i<=8;i++)
        {
            a[i] = stringBuilder.charAt(i);
        }
        char ch = str.charAt(12);
        int result=0;
        //System.out.print(stringBuilder);
        //System.out.print(ch);
       // System.out.print("              ");
        for(int i =0 ;i<=8;i++)
        {
         //   System.out.print(a[i]);
            result = (i+1) * (a[i]-48)+result;
        }
       // System.out.print("              ");
        result = result%11;
     //   System.out.print(result);
        if (result==10 )
        {
            if( ch=='X') {
                System.out.print("Right");
            }
            else{
                ch = 'X';
                stringBuilder.insert(1,'-');
                stringBuilder.insert(5,'-');
                stringBuilder.insert(11,'-');
                System.out.print(stringBuilder);
                System.out.print(ch);
            }
        }
        else if(result==ch-'0')
        {
            System.out.print("Right");
        }
        else
        {
            stringBuilder.insert(1,'-');
            stringBuilder.insert(5,'-');
            stringBuilder.insert(11,'-');
            System.out.print(stringBuilder);
            System.out.print(result);
        }
    }
}

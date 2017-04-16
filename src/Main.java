import java.util.*;
/**
 * Created by Caffrey on 2017/3/13.
 */
public class Main {
    public static void main( String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] count = new int[10001];
        for(int i = 0;i < N; ++i )
        {
            ++count[scanner.nextInt()];
        }

        int maxCount = -1;
        int result = 0;
        for(int i = 1; i<=N;i++)
        {
            if(count[i]>maxCount)
            {
                maxCount = count[i];
                result = i;
            }
        }

        System.out.print(result);
    }
}

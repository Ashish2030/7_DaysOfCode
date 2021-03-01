import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static int pageCount(int n, int p) 
    {
        int min=0;
        int start=1;
        int count=0;
        int count1=0;
            while(start<p)
            {
                start=start+1;
                if(start==p)
                {
                    count++;
                    break;
                }
                start=start+1;
                count++; 
            }
          start=1;
        if(n%2==0)
        {
          while(n>p)
          {
               n=n-1;
                if(n==p)
                {
                    count1++;
                    break;
                }
                n=n-1;
                count1++;  
          }
        }
        else
        {
            while(n>p)
          {
               n=n-1;
                if(n==p)
                {
                    break;
                }
                n=n-1;
                count1++;   
              
          } 
        }
            return Math.min(count,count1);
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) 
    {
        int count=0;
        int half=s.length()/2;
        int last=s.length()-1;
        for(int i=0;i<half;i++)
        {
            if(s.charAt(i)<s.charAt(last))
            {
                if(s.charAt(i)!=s.charAt(last))
                  {
                
                          int diff=s.charAt(last)-s.charAt(i);
                           char temp=(char)((int)s.charAt(last)-diff);
                           s = s.substring(0, last) + temp + s.substring(last + 1); 
                          count=count+diff;
                          last--;
                  }
            }
            else if(s.charAt(i)>s.charAt(last))
            {
               if(s.charAt(i)!=s.charAt(last))
              {
                 int diff=s.charAt(i)-s.charAt(last);
                  char temp=(char)((int)s.charAt(i)-diff);
                  s = s.substring(0, i) + temp + s.substring(i + 1); 
                  count=count+diff;
                  last--;
              }
           }
           else
           {
            last--;
           }
    }
     return count;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = theLoveLetterMystery(s);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

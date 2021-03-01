














/*
A teacher asks the class to open their books to a page number. A student can either start turning pages from the front of the book or from the back of the book. They always turn pages one at a time. When they open the book, page  is always on the right side:

image

When they flip page , they see pages  and . Each page except the last page will always be printed on both sides. The last page may only be printed on the front, given the length of the book. If the book is  pages long, and a student wants to turn to page , what is the minimum number of pages to turn? They can start at the beginning or the end of the book.

Given  and , find and print the minimum number of pages that must be turned in order to arrive at page .
*/





















import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class Solution {
    static int pageCount(int n, int p) 
    {
           int diff=n-p;
           if(diff<p)
        {
            if(n==p)
            {
                return 0;
            }
            else
            {
                if(n%2==0)
                {
                    return 1+(diff-1)/2;
                }
                else
                {
                    return diff/2;
               }
           }
        }
        else
        {
            return p/2;
       }  
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

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

 static int surfaceArea(int[][] A) 
      {
          int surface=2*A.length*A[0].length;
         for(int i=0;i<A.length;i++)
         {
             for(int j=0;j<A[0].length;j++)
             {
                 int flag=0;
                 int flag1=0;
                 int flag2=0;
                 int flag3=0;
                 if(i==0)
                 {
                     flag=1;
                    surface=surface+A[i][j]; 
                 }
                 if(j==0)
                 {
                     flag1=1;
                     surface=surface+A[i][j];  
                 }
                 if(i==A.length-1)
                 {
                     flag2=1;
                      surface=surface+A[i][j];  
                 }
                  if(j==A[0].length-1)
                 {
                     flag3=1;
                      surface=surface+A[i][j];  
                 }
                   if((flag!=1)&&(A[i-1][j]<A[i][j]))
                 {
                     surface=surface+A[i][j]-A[i-1][j];
                 }
                 if((flag2!=1)&&(A[i+1][j]<A[i][j]))
                 {
                      surface=surface+A[i][j]-A[i+1][j];
                 }
                 if((flag1!=1)&&(A[i][j-1]<A[i][j]))
                 {
                      surface=surface+A[i][j]-A[i][j-1];
                 }
                 if((flag3!=1)&&(A[i][j+1]<A[i][j]))
                 {
                      surface=surface+A[i][j]-A[i][j+1];
                 }
               
                 }
             }
             return surface;
         }     


    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] HW = scanner.nextLine().split(" ");

        int H = Integer.parseInt(HW[0]);

        int W = Integer.parseInt(HW[1]);

        int[][] A = new int[H][W];

        for (int i = 0; i < H; i++) {
            String[] ARowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < W; j++) {
                int AItem = Integer.parseInt(ARowItems[j]);
                A[i][j] = AItem;
            }
        }

        int result = surfaceArea(A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

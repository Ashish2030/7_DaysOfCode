import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the surfaceArea function below.
    static int surfaceArea(int[][] A) 
      {
        
          int surface=2*A.length*A[0].length;
          int arr[][]=new int[A.length+2][A[0].length+2];
          for(int i=0;i<arr.length;i++)
          {
              for(int j=0;j<arr[0].length;j++)
              {
                  arr[i][j]=0;
              }
          }
          for(int i=0;i<A.length;i++)
          {
              for(int j=0;j<A[0].length;j++)
              {
                  arr[i+1][j+1]=A[i][j];
              }
          }
          int count=0;
           for(int i=1;i<arr.length-1;i++)
          {
              
              for(int j=1;j<arr[0].length-1;j++)
              {
                  if(arr[i-1][j]<arr[i][j])
                  {
                      count=count+arr[i][j]-arr[i-1][j];
                  }
                  if(arr[i][j-1]<arr[i][j])
                  {
                      count=count+arr[i][j]-arr[i][j-1];
                  }
                  if(arr[i+1][j]<arr[i][j])
                  {
                      count=count+arr[i][j]-arr[i+1][j];
                  }
                  if(arr[i][j+1]<arr[i][j])
                  {
                      count=count+arr[i][j]-arr[i][j+1];
                  }
                 
              }
          }
           surface=surface+count;
         
           
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

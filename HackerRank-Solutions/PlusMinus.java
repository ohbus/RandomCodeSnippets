import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int i, neg=0, pos=0, zer=0 ;
        for(i=0; i<arr.length; i++) {
            if(arr[i]==0)
                zer++;
            else if(arr[i]<0)
                neg++;
            else
                pos++;
        }

        double tot = arr.length;

        System.out.println(pos/tot);
        System.out.println(neg/tot);
        System.out.println(zer/tot);

    }

    static byte state(int n)    {
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        return 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

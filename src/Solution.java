import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in) ;
        int x=sc.nextInt();
        sc.nextLine();
        int n=0;
        for (int i=0;i<x;i++)
        {
            String s=sc.nextLine();
            if(s.contains("++"))
                n++;
            else
                n--;
        }
        System.out.println(n);
    }
}
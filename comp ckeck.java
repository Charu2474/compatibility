import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int n=e.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        int i,c=0;
        for(i=0;i<n;i++)
        {
            x[i]=e.nextInt();
        }
        for(i=0;i<n;i++)
        {
            y[i]=e.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]==y[i]||x[i]>y[i])
            {
                c++;
            }
        }
        if(c==n)
        {
            System.out.println("Compatibility Achieved!");
        }
        else
        {
            System.out.println("Incompatibility Detected!");
        }
    }
}

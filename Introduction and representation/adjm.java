import java.util.*;
import java.lang.*;
import java.io.*;

public class adjm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int n=sc.nextInt();
        int a[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            int u,v;
            System.out.println("Enter the vertices");
            u=sc.nextInt();
            v=sc.nextInt();
            a[u][v]=1;
            a[v][u]=1;

        }
        System.out.println("The adjacency matrix is");
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(a[i][j]==1)
                {
                    System.out.print(a[i][j]+" ");
                }
                else
                {
                    System.out.print("0"+" ");
                }
                
            }
            System.out.println();
        }

    }
}
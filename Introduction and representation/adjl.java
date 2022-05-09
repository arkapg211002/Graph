import java.util.*;
import java.lang.*;
import java.io.*;

public class adjl 
{
    public static void add(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void print(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(i+" ");
                System.out.print(adj.get(i).get(j));
                System.out.println();
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        add(adj,0,1);
        add(adj,0,2);
        add(adj,1,2);
        add(adj,2,3);
        add(adj,3,4);
        add(adj,4,5);
        add(adj,5,6);
        print(adj);
    }
}
   
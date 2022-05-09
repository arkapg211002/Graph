import java.util.*;
import java.lang.*;
import java.io.*;
public class bfs
{
    int v;
    LinkedList<Integer> adj[];
    bfs(int v)
    {
        this.v = v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<Integer>();

        }
    }
    void addEdge(int u,int v)
    {
        adj[u].add(v);
    }
    void BFS(int s)
    {
        boolean vis[]=new boolean[v];
        LinkedList<Integer> q=new LinkedList<Integer>();
        q.add(s);
        vis[s]=true;
        while(q.size()!=0)
        {
            s=q.poll();
            System.out.print(s+" ");
            Iterator<Integer> i=adj[s].listIterator();
            while(i.hasNext())
            {
                int n=i.next();
                if(!vis[n])
                {
                    q.add(n);
                    vis[n]=true;
                }
            }
        }


    }
    public static void main(String args[])
    {
        bfs g=new bfs(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        g.BFS(2);
        
    }
}
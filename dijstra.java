import java.util.Scanner;
public class dijstra
{
	static int n;
    static int MAX=100;
    static int a[][];
    static int infinity=999;
    static Scanner in = new Scanner(System.in);
    public static void main(String args[])
    {   
        a=new int[MAX][MAX];
        System.out.println("enter vertices number");
        n=in.nextInt();
        System.out.println("enter elements");
        for(int k=1;k<=n;k++)
        {
          for(int l=1;l<=n;l++)
          {
              a[k][l]=in.nextInt();
          }
        }
        System.out.println("enter the starting vertex");
        int s=0;
        s=in.nextInt();
        
        dijstraalgo(s);
    }
    static void dijstraalgo(int s)
    {int u,c;
        int S[]=new int[MAX];
        int d[]=new int[MAX];
    
        for(int m=1;m<=n;m++)
        {
            S[m]=0;
            d[m]=a[s][m];
        }
        S[s]=1;
        d[s]=1;
        c=2;
        while(c<=n)
        {
            u=extract(S,d);
            S[u]=1;
            c++;
            for(int i=1;i<=n;i++)
            {
                if((d[u]+a[u][i]<d[i])&&(S[i]==0))
                {
                    d[i]=d[u]+a[u][i];
                }
            }
        }
        for(int v=1;v<=n;v++)
        {
            if(v!=s)
            {
                System.out.println(v+" "+d[v]);
            }
        }
    }
    static int extract(int S[],int d[])
    {int j=1;
       int min=infinity;
      for(int a=1;a<=n;a++)
      {
          if((d[a]<min)&&(S[a]==0))
          {
              min=d[a];
              j=a;
          }
      }
      return j;
    }
}

import java.util.Scanner;
class PriorityP
{
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no. of process : ");
    int n = sc.nextInt();
    int pid[] = new int[n]; 
    int at[] = new int[n];
    int bt[] = new int[n];
    int ct[] = new int[n];
    int tat[] = new int[n];
    int wt[] = new int[n];
    int f[] = new int[n];
    int btt[] = new int[n];
    int prio[] = new int[n];
    for(int i=0; i<n; i++)
    {
      System.out.println("Enter process id: ");
      pid[i] = sc.nextInt();

      System.out.println("Enter Arrival time: ");
      at[i] = sc.nextInt();

      System.out.println("Enter Burst time: ");
      bt[i] = sc.nextInt();
      btt[i] = bt[i];

      System.out.println("Enter priority time: ");
      prio[i] = sc.nextInt();
     f[i] = 0;
    }
    sc.close();
    int BT[]=new int[n];
    for(int k=0;k<n;k++){
       BT[k]=bt[k];
    }

    int st = 0;
    int total = 0;
    int i = 0;
    

    while(true)
    {
       if(total == n)
            break;
        int c = n;
        int min = 99;
        for( i = 0;i < n; i++)
        {
            if(at[i] <= st && f[i] == 0 && prio[i] < min)
            {
                c = i;
                min = prio[i];
            }
        }

        if(c == n)
        {
            st += 1;
        }
        else
        {
            bt[c]=bt[c]-1;
            st=st+1;
            if(bt[c]==0)
            {
            ct[c]=st;
            f[c]=1;
            total++;
            }
        }     
    }

    for(int k = 0; k<n; k++)
        {
            tat[k] = ct[k] - at[k];
            wt[k] = tat[k] - btt[k];
        }
        System.out.println("Process\tAT\tBT\tPRIORITY\tCT\tTAT\tWT");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        
    for(int j = 0; j<n; j++)
    {
        System.out.println(pid[j]+"\t"+at[j]+"\t"+BT[j]+"\t"+ prio[j]+"\t"+ct[j]+"\t"+tat[j]+"\t"+wt[j]);
    }

   }
}

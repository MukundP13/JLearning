import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] pid= new int[n];
		int[] at= new int[n];
		int[] bt= new int[n];
		int[] ct= new int[n];
        int[] tat= new int[n];
        int[] wt= new int[n];
		
		for(int i=0;i<n;i++){
		    pid[i]=i+1;
		    System.out.println("Enter for AT for process "+(i+1)+" : ");
		    at[i]=sc.nextInt();
		    System.out.println("Enter for BT for process "+(i+1)+" : ");
		    bt[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++){
		    for(int j=i+1;j<n;j++){
		        if (at[i]>at[j]){
		            int t=at[j];
		            at[j]=at[i];
		            at[i]=t;
		            
		            t=bt[j];
		            bt[j]=bt[i];
		            bt[i]=t;
		            
		        }
		    }
		}
		
		int crt=0;
		for(int i=0;i<n;i++){
		    if(at[i]>crt){
		        crt=at[i];
		    }ct[i]=crt+bt[i];
		    crt=ct[i];
            tat[i]=ct[i]-at[i];
            wt[i]=tat[i]-bt[i];
		}
		System.out.println("Process\tAT\tBT\tCT\tTAT\tWT");
		for(int i=0;i<n;i++){
            System.out.println(pid[i]+"\t"+at[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+tat[i]+"\t"+wt[i]);
        }
		
		sc.close();
	}
}
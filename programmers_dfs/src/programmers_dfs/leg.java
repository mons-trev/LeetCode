package programmers_dfs;

import java.util.Scanner;

public class leg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		long leg[]= new long[n];
		for(int i=0; i<n; i++) {
			int west=sc.nextInt();
			int east=sc.nextInt();
			long result=1;
			
			int count=0;
			for(int j=0; j<west; j++) {
				result=result*(east-j);
			}
			
			long divide=1;
			
			for(int k=1; k<=west; k++) {
				divide=divide*k;
			}
			if(east==0||west==0) {
				leg[i]=0;
				}
			else {
				leg[i]=result/divide;
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(leg[i]);
		}
		sc.close();
	}

}

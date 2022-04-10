package programmers_dfs;

import java.util.Arrays;
import java.util.Scanner;

public class divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++){
            b[i]=scanner.nextInt();
        }
        Arrays.sort(b);
        System.out.println(b[0]*b[b.length-1]);
            scanner.close();
	}

}

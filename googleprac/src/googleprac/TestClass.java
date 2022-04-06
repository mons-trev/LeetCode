package googleprac;

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        String[] arr_A = br.readLine().split(" ");
        for(int i_A = 0; i_A < N; i_A++) {
        	A[i_A] = Integer.parseInt(arr_A[i_A]);
        }
        int out_ = Solve(N, A);
        System.out.println(out_);

         wr.close();
         br.close();
    }
    static int Solve(int N, int[] A){//배열 크기하고 배열이 주어짐
        // Write your code here
        if(A[0]<0) A[0]=A[0]*(-1);
        int min= A[0];
        for(int i=1; i<N; i++) {
            if(A[i]<0) A[i]= A[i]*(-1);
            if(A[i]<min) min=A[i];
        }
        return min;
    }
}
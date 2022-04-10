package programmers_dfs;

import java.util.Arrays;

class Solution {
	static boolean[] checked;
	static int[][] computer;
	public void show() {
		for(int i=0; i<this.computer.length; i++) {
        	for(int j=0; j<this.computer.length; j++) {
        		System.out.print(this.computer[i][j]);
        	}
        	System.out.println();
        }
		for(int i=0; i<checked.length; i++) {
			System.out.print(checked[i]);
		}
		System.out.println();
	}
    public int solution(int n, int[][] computers) {
        int answer = 0;
        checked= new boolean[computers.length];
        Arrays.fill(checked, true);
        this.computer= computers;
        for(int i=0; i<this.computer.length; i++) {
        	this.computer[i][i]=0;
        }
        show();
        for(int j=0; j<computer.length; j++) {
        	if(checked[j]==true) {
        		dfs(j); }
        }
        show();
        for(int i=0; i<checked.length; i++) {
        	if(checked[i]==true) {
        		answer++;
        	}
        }
        return answer;
    }
    void dfs(int start) {
    	for(int i=0; i<this.computer.length; i++) {
    		if(this.computer[start][i]==1&&checked[i]==false) {
    			this.computer[start][i]=0;
    			this.computer[i][start]=0;
    			//System.out.println(i);
    			this.checked[i]=false;
    			show();
    			dfs(i);
    			
    		}
    		
    	}
    }
}
public class networking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int [][] r= {{1,1,1}, {1,1,1}, {1,1,1}};
		Solution s= new Solution();
		System.out.println(s.solution(n, r));
	}

}

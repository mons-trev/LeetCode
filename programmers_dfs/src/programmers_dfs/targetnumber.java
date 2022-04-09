package programmers_dfs;


public class targetnumber {

	static class Solution {
		int answer;
		int [] numbers;
		int target;
	    public int solution(int[] numbers, int target) {
	    	this.numbers=numbers;
	    	this.target=target;
	    	
	    	dfs(0,0);
	    	
	    	return answer;
	    }
	    
	    void dfs(int index, int sum) {
	    	//¸ØÃãÁ¶°Ç
	    	if(index==numbers.length) {
	    		if(sum==this.target) {
	    			answer++;
	    		}
	    		return;
	    	}
	    	//¼öÇàÁ¶°Ç
	    	dfs(index+1, sum+numbers[index]);
	    	dfs(index+1, sum-numbers[index]);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1, 1, 1};
		int target=1;
		Solution s= new Solution();
		System.out.println(s.solution(numbers, target));
		
	}

}

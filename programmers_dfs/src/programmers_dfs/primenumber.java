package programmers_dfs;

import java.util.HashSet;

class solution {
	
	HashSet<Integer> hash= new HashSet<>(); 
	
	public void recursive(String comb, String others) {
		if (!comb.equals("")) {
		hash.add(Integer.valueOf(comb));
		}
		if(others.equals("")) return;
		for(int i=0; i<others.length(); i++) {
			recursive(comb+others.charAt(i), others.substring(0, i)+others.substring(i+1));
		}
	}
	
	public void print(String sample) {
		recursive("", sample);
		System.out.println(hash);
	}
}
public class primenumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution sol= new solution();
		sol.print("17");
		
	}

}

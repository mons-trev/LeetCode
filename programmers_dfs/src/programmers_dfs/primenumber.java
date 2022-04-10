package programmers_dfs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

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
	boolean prime []= new boolean[10000000];
	int answer=0;
	public int solution(String sample) {
		recursive("", sample);
		System.out.println(hash);
		Iterator<Integer> it= hash.iterator();
		makeprime(this.prime);
		while(it.hasNext()) {
			if(isprime(it.next())) {
				answer++;
			}
		}
		return answer;
	}
	void makeprime(boolean[] b) {
		Arrays.fill(b,true);
		b[0]=false;
		b[1]=false;
		for(int i=2; i<b.length; i++) {
			if(b[i]==true) {		
			for(int j=2; j*i<b.length; j++) {
				b[i*j]=false;
			 }
			}
		}
	}
	boolean isprime(int compare) {
		return prime[compare];
	}
}
public class primenumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution sol= new solution();
		System.out.println(sol.solution("011"));
		
	}

}

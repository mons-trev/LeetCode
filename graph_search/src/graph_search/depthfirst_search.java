package graph_search;

import java.util.Arrays;
import java.util.Vector;

class graph {
	int n;
	int graph [][];
	boolean check[];
	
	public void init(int max) {
		this.n=0;
		this.graph= new int[max][max];
	}
	public void make_node(int n) {
		this.n=n;
		this.check= new boolean[n];
	}
	public void insert_node(int start, int finish) {
		this.graph[start][finish]=1;
		this.graph[finish][start]=1;
	}
	public void print() {
		for(int i=0; i <this.n; i++) {
			for(int j=0; j<this.n; j++) {
				System.out.print(this.graph[i][j]);
			}
			System.out.println();
		}
	}
	static int count=0;
	public void dfs(int start) {
		check[start]=true;
		System.out.print(start);
		for(int i=0; i<n; i++) {
			if(graph[start][i]==1&&!check[i]) {
				dfs(i);
			}
		}
		count++;
		System.out.println(start+" "+count);
		if(count==4) {
			Arrays.fill(check, false); 
			System.out.println("check배열 초기화");
		}
	}
	int [] bfsqueue = new int[this.graph.length];
	public void bfs(int start) {
		System.out.print(start);
		check[start]=true;
		for(int i=0; i<n; i++) {
			if(check[start]==false) {}	
		}
		
	}
}
public class depthfirst_search {

	static int Maxelement= 50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph fordfs= new graph();
		fordfs.init(Maxelement);
		fordfs.make_node(4);
		fordfs.insert_node(0, 1);
		fordfs.insert_node(1, 2);
		fordfs.insert_node(2, 3);
		fordfs.insert_node(1, 3);
		fordfs.print();
		fordfs.dfs(0);
		Vector<Integer> a= new 
	}

}

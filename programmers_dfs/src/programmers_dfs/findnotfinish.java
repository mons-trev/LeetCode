package programmers_dfs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class findnotfinish {
	static HashMap<String, Integer> map= new HashMap<>();
	static String answer;
	public static String mapfinding(String[] list, String[] finished) {
		
		for(int i=0; i<list.length; i++) {
			map.put(list[i], map.getOrDefault(list[i],0)+1);
		}
		for(int i=0; i<finished.length; i++) {
			map.put(finished[i], map.get(finished[i])-1);
		}
		
		Iterator<Map.Entry<String, Integer>> it= map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> ex= it.next();
			if(ex.getValue()!=0) {
				answer= ex.getKey();
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Boolean, String> list= new HashMap<>();
		String [] participate= {"mislav", "stanko", "mislav", "ana"};
		
		String [] finishedlist= {"stanko", "ana", "mislav"};
		
		System.out.println(mapfinding(participate, finishedlist));
		
	}

}

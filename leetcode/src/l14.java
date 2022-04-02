import java.util.Scanner;

public class l14 {

    public static String longestCommonPrefix(String[] strs) {
    	String output = "";
    	/*int minlength= strs[0].length();
    	for(int i=1; i<strs.length; i++) {
    		if(strs[i].length()<minlength) minlength=strs[i].length();
    	}
    	int j=0;
    	*/
    	while(true) {
    		//for(int i=0; i<strs.length)
    	}
    	return output;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();		
		String strs []= new String[n];
		for(int i=0; i<n; i++) {
			strs[i]=sc.next();
		}
		System.out.println(longestCommonPrefix(strs));
	}

}

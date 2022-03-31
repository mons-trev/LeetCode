import java.util.Scanner;

/*
 * I             1
V             5
X             10
L             50
C             100
D             500
M             1000

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900. 
 */
public class l13 {
	public static int romanToInt(String s) {
		int sum = 0;
		for(int i=0; i<s.length(); i++) { //012
			if(s.charAt(i)=='I') {
				//System.out.println("this");
				if((i+1)<s.length()&&s.charAt(i+1)=='V') {
					sum+=4;
					i=i+1;
					
				}
				else if((i+1)<s.length()&&(i+1)<s.length()&&s.charAt(i+1)=='X') {
					sum+=9;
					i=i+1;
					
				}
				else {
					sum+=1;
				}
			
			}
			else if(s.charAt(i)=='V') {
				
					sum+=5;
					
				
			}
			else if(s.charAt(i)=='X') {
				if((i+1)<s.length()&&s.charAt(i+1)=='L') {
					sum+=40;
					i=i+1;
				}
				else if((i+1)<s.length()&&s.charAt(i+1)=='C') {
					sum+=90;
					i=i+1;
				}
				else {
					sum+=10;
				}
				
			}
			else if(s.charAt(i)=='L') {
				
					sum+=50;
					
				
			}
			else if(s.charAt(i)=='C') {
				if((i+1)<s.length()&&s.charAt(i+1)=='D') {
					sum+=400;
					i=i+1;
				}
				else if((i+1)<s.length()&&s.charAt(i+1)=='M') {
					sum+=900;
					i=i+1;
				}
				else {
					sum+=100;
				}
			}
			else if(s.charAt(i)=='D') {
				
					sum+=500;
				
			}
			else if(s.charAt(i)=='M') {
				
					sum+=1000;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String sample= sc.next();
		System.out.println(romanToInt(sample));
		sc.close();
	}
}

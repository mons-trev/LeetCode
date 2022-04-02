import java.util.Scanner;

class Stack {
	int size;
	char [] stack;
	int pointer= -1;
	
	public void create(int size) {
		this.size=size;
		stack= new char[size];
	}
	public boolean is_full() {
		return this.pointer==this.size-1;
	}
	public boolean is_empty() {
		return this.pointer==-1;
	}
	public void push( char item) {
		if(is_full()) {
			System.out.println("������ �� ���� �� �־��");
		}
		else {
			this.pointer++;
			this.stack[this.pointer]=item;
			System.out.println(this.pointer+"�ε�����"+item+"�� �־����ϴ�");
		}
	}
	public char pop() {
		if(is_empty()) {
			System.out.println("�E�� �����"); return 0;
		}
		else {
			System.out.println(this.pointer+"�ε����� "+this.stack[this.pointer]+"�� �����ϴ�!!");
			return this.stack[this.pointer--];
		}
	}
	public char peek() {
		return this.stack[this.pointer];
	}
}
public class stackex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s= new Stack();
		Scanner sc= new Scanner(System.in);
		String sample= sc.next();
		s.create(sample.length());
		for(int i=0; i<sample.length(); i++) {
			switch(sample.charAt(i)) {
			case ')':
				if(s.peek()=='(') s.pop();
				break;
			case '}':
				if(s.peek()=='{') s.pop();
				break;
			default :
				s.push(sample.charAt(i));
			}
		}
		if(s.pointer==-1) {
			System.out.println("����");
		}
		else System.out.println("�����");
	}

}

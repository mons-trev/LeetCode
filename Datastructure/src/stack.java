class stackinfo {
	int pointer=-1;
	int stack[];
	static int size=2;
}
public class stack {		
	
	
	
	public static int[] create(int size) {
		int [] createdstack= new int[size];
		return createdstack;
	}
	public static boolean is_full(stackinfo s) {
		return s.pointer==s.size-1;
	}
	public static boolean is_empty(stackinfo s) {
		return s.pointer==-1;
	}
	public static void push(stackinfo s, int item) {
		if(is_full(s)) {
			System.out.println("������ �� ���� �� �־��");
		}
		else {
			s.pointer++;
			s.stack[s.pointer]=item;
			System.out.println(s.pointer+"�ε�����"+item+"�� �־����ϴ�");
		}
	}
	public static int pop(stackinfo s) {
		if(is_empty(s)) {
			System.out.println("�E�� �����"); return -1;
		}
		else {
			System.out.println(s.pointer+"�ε����� "+s.stack[s.pointer]+"�� �����ϴ�!!");
			return s.stack[s.pointer--];
		}
	}
	public static void peek(stackinfo s) {
		System.out.println(s.stack[s.pointer]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackinfo s= new stackinfo();
		s.stack=create(s.size);
		push(s, 1);
		push(s, 2);
		push(s, 3);
		peek(s);
		pop(s);
		pop(s);
		pop(s);
		pop(s);
	}

}

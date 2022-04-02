package queue;

class dequeinfo {
	int front;
	int rear;
	int [] queue;
	public void create(int size) {
		this.queue= new int[size];
	}
	public void init() {
		this.front=0;
		this.rear=0;
	}
	public boolean is_empty() {
		return this.front==this.rear;
	}
	public boolean is_full() {
		return this.front==(this.rear+1)%this.queue.length;
	}
	public void add_front(int item) {
		if(is_full()) System.out.println("다 찼어요ㅠㅠ");
		else {
			this.queue[this.front]=item;
			front=(front-1+this.queue.length)%this.queue.length;
		}
	}
	public void add_rear(int item) {
		if(is_full()) System.out.println("다 찼어요ㅠㅠㅠㅠ");
		else {
			rear= (rear+1)%this.queue.length;
			this.queue[this.rear]=item;
		}
		
	}
	public void delete_front() {
		if(is_empty()) System.out.println("뺄게 없어요ㅜㅜ");
		else {
			front= (front+1)%this.queue.length;
			System.out.println(this.queue[front]+"을 앞에서부터 뺐습니다");
		}
	}
	public void delete_rear() {
		if(is_empty()) System.out.println("뺄게 없어요ㅜㅜㅜㅜㅜ");
		else {
			System.out.println(this.queue[(this.rear--+this.queue.length)%this.queue.length]);
		}
	}
	public int get_front() {
		if(is_empty()) {
			System.out.println("보여줄 게 없습니다");
			return -1;
		}
		else {
			
			return this.queue[(this.front+1)%this.queue.length];
		}
	}
		
	public void get_rear() {
		if(is_empty()) {
			System.out.println("보여줄 게 없스비다");
		}
		else {
			System.out.println(this.queue[this.rear]);
		}
	}
}
public class deque {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dequeinfo deque= new dequeinfo();
		deque.create(4);//3개
		deque.init();
		deque.add_rear(1);
		deque.add_rear(2);
		deque.add_rear(3);
		deque.get_rear();//3
		deque.add_front(4);//다 찼어요
		deque.delete_rear();//3
		deque.delete_rear();//2
		deque.delete_rear();//1
		deque.delete_rear();//뺄게 없어요
		deque.add_front(1);
		deque.add_front(2);
		deque.add_front(3);
		deque.add_front(4);//다 찼어요
		System.out.println(deque.get_front());
		deque.delete_front();//3
		deque.delete_front();//2
		deque.delete_front();//1
		deque.get_rear();//보여줄 게 업습니다
	}

}

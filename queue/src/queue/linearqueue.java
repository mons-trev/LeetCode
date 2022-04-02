package queue;

class Queueinfo {
	int front;
	int rear;
	int[] queue;
	
	public void create(int max_size) {
		this.queue= new int[max_size];
	}
	public void init() {
		this.front=this.rear=-1;
	}
	public boolean is_empty() {
		return front==rear;
	}
	public boolean is_full() {
		return rear==this.queue.length-1;
	}
	public void enqueue(int item) {
		if(is_full()) System.out.println("ť�� �� á���ϴ�");
		else {
			++this.rear;
			this.queue[rear]=item;
			System.out.println(this.rear+"��"+this.queue[this.rear]+"�� �־����ϴ�");

		}
	}
	public int dequeue() {
		if(is_empty()) {
			System.out.println("ť���� ���� �����ϴ�");
			return 0;
		}
		else {
			System.out.println(++this.front+"��"+this.queue[this.front]+"�� �����ϴ�");
			return this.queue[this.front];
		}
	}
	public void peek() {
		if(is_empty()) {
			System.out.println("�� �� ������");
		}
		else {
			front++;
			System.out.println(this.queue[this.front--]); 
		}
	}
}
public class linearqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queueinfo queue= new Queueinfo();
		queue.create(3);
		queue.init();
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.peek();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.peek();
		
	}

}

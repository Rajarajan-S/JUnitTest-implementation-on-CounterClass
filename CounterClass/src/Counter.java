public class Counter {
	
	int count; // Initially Count = 0
	
	public int Increment() {
		this.count++;
		return this.count;		
	}
	
	public int Decrement() {
		this.count--;
		return this.count;		
	}
	
	public int GetCount() {
		return this.count;
	}
}
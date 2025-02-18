package pertemuan2;

public class Node {
	private int nilai;
	private Node next;
	
	public Node(int nilai) {
		this.nilai = nilai;
	}
	
	public void setNilai (int nilai) {
		this.nilai=nilai;
		
	}
	
	public int getnilai() {
		return nilai;
	}
	
	public void setnext (Node next) {
		this.next = next;
		
	}
	
	public Node getnext() {
		return next;
	}
	
}
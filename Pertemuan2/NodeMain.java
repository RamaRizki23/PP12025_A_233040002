package pertemuan2;

public class NodeMain {
	public static void main (String[] args) {
		
		// Membuat 5 buah node
		Node n1 = new Node (5);
		Node n2 = new Node (7);
		Node n3 = new Node (9);
		Node n4 = new Node (2);
		Node n5 = new Node (3);

		
		// Membuat relasi antar Node 
		n4.setnext(n5);
		n5.setnext(n1);
		n1.setnext(n2);
		n2.setnext(n3);
		
		// Menampilkan Node dengan Pointer p
		Node p = n4;
		while(p != null)
		{
			System.out.printf("%d ", p.getnilai());
			p = p.getnext();
		}
	}
}
public class Lista <T>{
	private Node no_inicio = null;
	private Node no_final = null;
	
	
	class Node <T>{
		private Node anterior;
		private Node proximo;
		private T data;
		
		public Node(Node anterior, Node proximo, T data) {
			this.anterior = anterior;
			this.proximo = proximo;
			this.data = data;
			
		}
	}
	
	public void add(T data) {
		
	}
	

}

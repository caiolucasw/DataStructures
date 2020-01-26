public class Lista <T>{
	private Node no_inicio = null;
	private Node no_final = null;
	private int tamanho = 0;
	
	
	class Node <T>{
		private Node proximo;
		private T data;
		
		public Node(Node proximo, T data) {
			this.proximo = proximo;
			this.data = data;
			
		}
	}
	
	public boolean estaVazia() {
		if(no_final == null && no_final == null) 
			return true;
		
		return false;
	}
	
	public boolean procuraData(T data) {
		
		return true;
	}
	
	public void addInicio(T data) {
		
		if (estaVazia()) {
			Node novo = new Node(null, data);
			this.no_inicio = novo;
			this.no_final = novo;	
			
		}else {
			Node novo = new Node(this.no_inicio, data);
			this.no_inicio = novo;
			
		}
		
		this.tamanho++;
		
	}
	
	public void addFinal(T data) {
		
		if(this.estaVazia()) {
			this.addInicio(data);
		}else {
			Node novo = new Node(null, data);
			this.no_final.proximo = novo;
			this.no_final = novo;		
		}
		
		this.tamanho++;
		
	}
	
	public void addIndex(int index, T data) {
		
		Node aux = null;
		Node aux_anterior = null;
		int i=0;
		boolean flag = false;
		
		if(estaVazia()) {
			System.out.println("Não existe esse index na lista.");
		}else{
			
			if(index == 0) {
				this.addInicio(data);
			}else {
				aux = this.no_inicio;
				while(i != index && aux.proximo != null) {	
					aux_anterior = aux;
					aux = aux.proximo;
					i++;
					if(i == index)
						flag = true;

					
				 }
				
				if(flag) {
					Node novo = new Node(aux, data);
					aux_anterior.proximo = novo;
				}
			
			}
		
			this.tamanho++;
		}	
		
	}
	
	public Node removeInicio() {
		Node aux;
		Node excluido = this.no_inicio;
		
		if(estaVazia()) {
			System.out.println("Lista vazia!");
		}else {
			aux = this.no_inicio;
			this.no_inicio = this.no_inicio.proximo;
			aux = null;
			this.tamanho--;
		}
		
		return excluido;
	}
	
	public Node removeFinal() {
		
		Node aux;
		Node excluido = this.no_final;
		
		if(estaVazia()) {
			System.out.println("Lista está vazia.");
			return null;
		}else {
			aux = this.no_inicio;
			while(aux.proximo != this.no_final) {
				aux = aux.proximo;
			}
			
			if(aux.proximo == this.no_final) {
				aux.proximo = null;
				this.no_final = aux;
			}
		
			this.tamanho--;
		}
		
		return excluido;
		
		
	}
	
	public Node removeIndex(int index) { 	
		
		Node excluido = null; 
		Node aux;
		Node anterior = null;
		int i = 0;
		boolean flag = false;
		
		
		if(estaVazia()) {
			System.out.println("Lista está vazia!");
			return null;
		}else {
			
			if(index == 0) {
				excluido = this.removeInicio();
			}else {
			
				aux = this.no_inicio;
				while(i < index && aux.proximo != null) {	
					anterior = aux;
					aux = aux.proximo;
					i++;
					if(i == index)
						flag = true;
				}
				
				if(flag) {
					if (index == this.tamanho - 1) {
						excluido = this.removeFinal();
					}else {
						excluido = aux;
						anterior.proximo = aux.proximo;	
					}
				}
			}	
		}
		
		return excluido;
		
	}
	
	public void imprime() {
		Node aux = this.no_inicio;
		
		if(estaVazia()) {
			System.out.println("Lista vazia!");
		}else {
			while(aux != null) {
				System.out.print(aux.data + " ");
				aux = aux.proximo;
			}
			System.out.println();
		}
	}

	public int getTamanho() {
		return this.tamanho;
	}

}

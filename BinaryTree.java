

public class BinaryTree{
	
	private int tamanho;
	private No raiz;
	private int flag = 0;
	
	public BinaryTree() {
		this.raiz = null;
		this.tamanho = 0;
	}
	
	class No{
		private No dir;
		private No esq;
		private int data;
		
		private No(No dir, No esq, int data) {
			this.dir = dir;
			this.esq = esq;
			this.data = data;
		}

	}
	
	public int compara(int d1, int d2) {
	
		if(d1 > d2)
			return 1;
		else if (d2 > d1)
			return -1;
		
		return 0;
	}
	
	
	
	public boolean procuraItem(int data) {
		No flag = procura(this.raiz, data);
		
		if(this.flag == 1) {
			this.flag = 0;
			return true;
		}
		
		return false;
	}
	
	private No procura(No no, int data) {
		
		if(no == null || no.data == data) {
			if(no != null && no.data == data)
				this.flag = 1;
			return no;
		}
			
			
		if(no.data < data) {
			no.dir = procura(no.dir,data);
			
		}if(no.data > data) {
			no.esq =  procura(no.esq, data);
		}
		
		return no;
	
		
	}
	
	public void adicionaItem(int data) {
		
		int comparacao;
		
		if(this.procuraItem(data)) 
			System.out.println("Item já existe!");
		else 
			this.raiz = add(this.raiz, data);
		
	}
	
	private No add(No no, int data) {
		
		int comparacao;
		
		if(no == null) {
			no = new No(null, null, data);
			return no;
		
		}else {
			comparacao = compara(data, no.data);
			
			if (comparacao == 1)
				no.dir = add(no.dir, data);
			if(comparacao == -1)
				no.esq = add(no.esq, data);
		
		}
	
		return no;
			
	}
	
	
	public void removeItem(int data) {
		
		if(this.procuraItem(data)){
			this.raiz = this.remove(this.raiz, data);
		}else {
			System.out.println("Item inexistente.");
		}
				

	}
	
	public No procuraMaior(No no) {
		No aux = no.esq;
		
		while(aux.dir != null) { aux = aux.dir; }
		
		return aux;
			
	}
	
	public No procuraMenor(No no) {
		No aux = no.dir;
		
		while(aux.esq.esq != null) { aux = aux.esq; }
		
		return aux;
			
	}
	
	private No remove(No no, int data) {
		
		No aux = null;
		int comparacao;
		
		if(no.data == data) {
			if(no.esq == null && no.dir == null) {
				no = null;
						
			}else if(no.esq != null && no.dir == null)
				return no.esq;
			else if(no.esq == null && no.dir != null)
				return no.dir;
			else {
				aux = procuraMenor(no);
				no.data = aux.esq.data;
				aux.esq = null;
			}
				
			
		}else{
			
			comparacao = this.compara(data, no.data);
			
			if(comparacao == 1)
				no.dir = remove(no.dir, data);
			else if(comparacao == -1)
				no.esq = remove(no.esq, data);
		}
		
		
		return no;
		
	}
	
	
	public void imprimePreOrdem() {
		preOrdem(this.raiz);
	}
	private void preOrdem(No no) {
		
		if(no != null) {
			System.out.println(no.data);
			preOrdem(no.esq);
			preOrdem(no.dir);
		}
	}
	
	public void imprimeInOrdem() {
		inOrdem(this.raiz);
	}
	private void inOrdem(No no) {
		
		if(no != null) {
			inOrdem(no.esq);
			System.out.println(no.data);
			inOrdem(no.dir);
		}
	}
	
	public void imprimePosOrdem() {
		this.posOrdem(this.raiz);
	}
	
	private void posOrdem(No no) {
		
		if(no != null) {
			posOrdem(no.esq);
			posOrdem(no.dir);
			System.out.println(no.data);
		}
	}
	
}
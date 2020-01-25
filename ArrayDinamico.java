
public class ArrayDinamico <T>{
	private int tamanho = 0;
	private int tamanhoTotal;
	private T vetor[];
	
	
	public ArrayDinamico(int tamanhoTotal) {
		this.tamanhoTotal = tamanhoTotal;
		this.vetor = inicializa();
	}
	
	public T[] inicializa() {
		
		T[] vetor = (T[]) new Object[this.tamanhoTotal];
		return vetor;
	
	}
	
	public void append(T data) {
		T dado[];	
		int i = 0;
		if(this.tamanho + 1 >= this.tamanhoTotal) {
			int aux = this.tamanhoTotal;
			this.tamanhoTotal *= 2;
			if(this.tamanhoTotal == 0)
				this.tamanhoTotal = 1;
			dado = inicializa();		
			for(i = 0; i < this.tamanho; i++) {
				dado[i] = this.vetor[i];
			}
			dado[this.tamanho] = data;
			this.vetor = dado;
					
		}else
			this.vetor[this.tamanho] = data;
		
		this.tamanho++;
		
	}
	
	public void adicionaAtIndex(T data, int index) throws Exception {
		T[] dados;
		int i,j;
		
		if (index < 0 || index >= this.tamanho) 
				throw new Exception("Index não encontrado.");
				
		if(this.tamanho + 1 >= this.tamanhoTotal) {
			this.tamanhoTotal *=2;
			if (this.tamanhoTotal == 0)
				this.tamanhoTotal = 1;
		}
		
		dados = inicializa();
		
		j = 0;
		for(i = 0; i < this.tamanho + 1; i++) {
			
			if (i == index)
				dados[i] = data;
			else {
				dados[i] = this.vetor[j];
				j++;
				
			}
			
		}
		
		this.vetor = dados;
		this.tamanho++;
	
	}
	
	public void removeFinal() {
		T[] dado = (T[]) new Object[this.tamanho-1];
		int i;
		
		if(this.tamanho > 0) {
			this.tamanho--;
			
			for(i = 0; i<this.tamanho; i++) {
				dado[i] = this.vetor[i];
			}
			
			this.vetor = dado;
		}
	}
	
	public void removeValor(T data) {
		boolean flag = false;
		int i,j;
		int index = -1;
		T array[];
		
		for(i=0; i < this.tamanho; i++) {
			if (this.vetor[i].equals(data)) {
				index = i;
				flag = true;
				break;
			}
		}
		
		if(flag == true) {
			array = (T[]) new Object[this.tamanho - 1];
			j = 0;
			
			for(i = 0; i< this.tamanho; i++) {
				if (i != index) {
					array[j] = this.vetor[i];
					j++;
				}
			}
			
			this.tamanho--;
			this.vetor = array;
			
		}else 
			System.out.println("O vetor não contém esse elemento!");
	
	}
	
	public void imprime() {
		
		System.out.println("Valores do vetor: ");
		for(int i = 0; i< this.tamanho; i++)
			System.out.print(this.vetor[i] + " ");
		
		System.out.println();
	}	
	
}

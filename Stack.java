
public class Stack <T> {

	Lista<T> lista = new Lista<>();
	
	public Stack() {}
	
	
	public Lista<T>.Node pop() {
		Lista<T>.Node no = lista.removeFinal();
		return no;
	}
	
	public void push(T data) {
		lista.addFinal(data);
	}
	
	public T peek() {
		return lista.getDataFinal();
	}
	
	public int getTamanho() {
		return lista.getTamanho();
	
	}
	
	public void imprime() {	
		lista.imprime();
	}
	
	public boolean estaVazia() {
		return lista.estaVazia();
	}
	

}


public class StackPrincipal {
	
	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<>();
		pilha.push(3);
		pilha.push(20);
		pilha.push(30);
		pilha.push(0);
		Integer topo = pilha.peek();
		pilha.imprime();
		System.out.println(topo);
		pilha.pop();
		pilha.imprime();
		pilha.pop();
		pilha.imprime();
		
		
		
		
	}

}

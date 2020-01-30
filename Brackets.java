import java.lang.RuntimeException;
import java.util.Scanner;


public class Brackets {
	
	public static void main(String[] args) {
		
		Stack<Character> pilha = new Stack<>();
		boolean flag = false;
		Scanner leitura = new Scanner(System.in);
		System.out.print("Digite a sequência de parênteses: ");
		String brackets = leitura.nextLine();
		System.out.println(brackets);
	
		for(int i=0; i < brackets.length(); i++) {
			char caracter = brackets.charAt(i);
		
			 if(isReversed(caracter)) {
				if(!(pilha.estaVazia()) && pilha.peek() == Brackets.reverseSymbol(caracter)) {
					pilha.pop();			
				}else {
					System.out.println("Entrada inválida!");
					flag = true;
					break;
				}
				
			}else {		
				pilha.push(caracter);
				
			}	
		}
		
		if(!flag) 
			System.out.println("Entrada válida!");
	}
	
	public static char reverseSymbol(char simbolo) {
		
		switch(simbolo) {
			case ']':
				return '[';
				
			case ')':
				return '(';
			case '}':
				return '{';	
			
			default:
				return 'N';
		}
	}
	
	public static boolean isReversed(char simbolo) {
		
		if(simbolo == ')' || simbolo == '}' || simbolo == ']')
			return true;
		
		return false;
	}
		
}

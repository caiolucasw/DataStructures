
public class principalLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista<Integer> lista = new Lista<>();
		lista.addFinal(5);
		lista.addFinal(7);
		lista.addFinal(12);
		lista.addFinal(22);
		lista.imprime();
		lista.addInicio(666);
		lista.imprime();
		lista.addIndex(8, 122);
		lista.addFinal(555);
		lista.imprime();
		lista.removeFinal();
		lista.removeInicio();
		lista.imprime();
		lista.removeIndex(1);
		lista.removeFinal();
		lista.imprime();
			
	}

}

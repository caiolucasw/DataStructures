
public class PrincipalArray {

	public static void main(String[] args) throws Exception {
		ArrayDinamico<Integer> array = new ArrayDinamico<>(4);
		array.append(17);
		array.append(70);
		array.append(99);
		array.append(100);
		array.append(110);
		array.append(5);
		array.append(3);
		array.append(201);
		array.adicionaAtIndex(505, 4);
		array.adicionaAtIndex(1001, 2);
		array.adicionaAtIndex(666, 7);
		array.removeValor(99);
		array.removeValor(201);
		array.removeValor(17);
		array.removeValor(5);
		array.removeValor(3);
		array.imprime();

	}

}

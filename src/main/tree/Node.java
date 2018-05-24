package main.tree;

/**
 * Klasa implementuje w�ze� drzewa binarnego, przechowuj�cy warto�� typu String.
 * 
 * 
 * @author ckjulinek
 */
public class Node {

	/**
	 * Konstruktor
	 * @param value warto�� w�z�a
	 */
	public Node(String value) {
		// TODO
	}
	
	/**
	 * Dodaje warto�� do drzewa binarnego, 
	 * Je�eli jeszcze nie ma takiej warto�ci - dodaje nowy w�ze� {@code Node}
	 * Je��li ju� istnieje taka warto�� w drzewie - zwraca ten w�ze�
	 * @param value warto�� dodana do drzewa
	 * 
	 * @return w�ze� drzewa zawieraj�cy warto��
	 */
	public Node addValue(String Value) {
		// TODO
		return null;
	}

	/**
	 * Zwraca {@code Node} o warto�ci value, lub null je�li w drzewie nie ma takiej warto�ci.
	 */
	public Node getNode(String Value) {
		// TODO
		return null;
	}
	
	/**
	 * @return true, dany obiekt node jest cz�ci� drzewa, w przeciwnym razie false;
	 */
	public boolean hasNode(Node node) {
		return false;
	}

	/**
	 * @return true, je�li w drzewie wyst�puje dana warto��, w przeciwnym razie false;
	 */
	public boolean hasValue(String value) {
		return false;
	}
}

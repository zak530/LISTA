public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserimento("A", 0);
        lista.inserimento("B", 1);
        lista.inserimento("C", 2);
        lista.inserimento("D",3);


        lista.eliminazione(1);

        Nodo current = lista.getHead();
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

}
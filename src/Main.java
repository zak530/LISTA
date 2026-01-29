public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserimentoordinato(0);
        lista.inserimentoordinato(1);
        lista.inserimentoordinato(2);


        //lista.inserimento("ciao",0);
        //lista.inserimento("ciao1",1);
        //lista.inserimento("ciao4",2);
        //lista.inserimento("ciao2",3);

        
        Nodo current = lista.getHead();
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

}
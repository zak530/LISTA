public class Lista {
    private int size;
    private Nodo head;
    private Nodo cursor;

    public Lista() {
        this.size = 0;
        this.head = null;
        this.cursor = null;
    }

    public int getSize() {
        return size;
    }

    public Nodo getHead() {
        return head;
    }

    public Nodo getCursor() {
        return cursor;
    }

    public void setCursor(Nodo cursor) {
        this.cursor = cursor;
    }





    public void inserimentoordinato(int valueint) {
        Nodo newNode = new Nodo();
        newNode.setValueint(valueint);
        if (head == null || valueint < head.getValueint()) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Nodo current = head;
            while (current.getNext() != null && current.getNext().getValueint() < valueint) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }

        size++;
    }



    public void eliminazione(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            Nodo current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        size--;
    }


    public void inserimento(String value, int index) {
        Nodo newNode = new Nodo();
        newNode.setValue(value);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Nodo current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }



    public void accoda(int value) {
        Nodo newNode = new Nodo();
        newNode.setValue(String.valueOf(value));
        if (head == null) {
            head = newNode;
        } else {
            Nodo current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }


    public void eliminazionecompleta(){
        head = null;
        size = 0;
    }




    public String visita() {
        if (cursor == null) {
            cursor = head;
        }
        if (cursor == null) {
            return null;
        }
        String valore = cursor.getValue();
        cursor = cursor.getNext();
        return valore;
    }




    public String lettura(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Nodo current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }



    public int ricerca(String valore) {
        Nodo current = head;
        int index = 0;
        while (current != null) {
            if (current.getValue().equals(valore)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }


    @Override
    public String toString() {
        return "Lista{" +
                "size=" + size +
                ", head=" + head +
                ", cursor=" + cursor +
                '}';
    }
}




public class Nodo {
        private String value;
        private Nodo next;
        private int valueint;

        public Nodo(String value) {
            this.value = value;
            this.next = null;
        }

        public Nodo(int valueint) {
        this.valueint = valueint;
        this.next = null;
        }

        public Nodo() {
            this.value = null;
            this.next = null;
        }

        public String getValue() {
            return value;
        }

        public Nodo getNext() {
            return next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setValueint(int valueint) {
        this.valueint = valueint;
        }

    @Override
        public String toString() {
            return "Nodo{" +
                    "value='" + value +", next=" + next + '}';
        }
}

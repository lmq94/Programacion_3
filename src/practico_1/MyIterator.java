package practico_1;


import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private Node<T> pointer;

        public MyIterator(Node<T> cursor) {
            this.pointer = cursor;
        }

        public boolean hasNext() {
            return this.pointer != null;
        }
        public T next() {
            T element = pointer.getElement();
            pointer = pointer.getNext();
            return element;
        }



    }


package practico_1;

import java.util.Iterator;


public class List<T> implements Iterable<T> {
    private Node<T> first;
    private int size;

    public List() {
        this.first = null;
        this.size = 0;
    }

    public void insertFront(T element){
        Node<T> node = new Node<T>(element);
        node.setNext(this.first);
        this.first = node;
        this.size++;
    }
    public boolean isEmpty() {
        return (this.first == null);
    }

    public int getSize(){
        return this.size;
    }

    public Node<T> getFirst() {
        return first;
    }

    //Devuelve el elemento de una posicion, si no esta esa posicion, devuelve null
    public T get(int index){
        Node<T> aux = this.first;
        int count = 0;
        while(aux != null && count < index)
            aux = aux.getNext();
        return aux.getElement();
    }

    public int indexOf(T element){
        Node<T> aux = this.first;
        int count = 0;
        while(aux != null && aux.getElement() != element) {
            aux = aux.getNext();
            count++;
        }
        if(aux != null)
            return count;
        else
            return -1;
    }

    
    public void insertOrd(T element){

    }


    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this.first);
    }



}

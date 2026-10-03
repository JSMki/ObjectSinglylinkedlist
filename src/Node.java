public class Node<T> {
    //el dato o datos que guarda el nodo
    private T data;

    //referencia al nodo siguiente (empieza en null por defeccto)
    private  Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "data: " + data;
    }

}

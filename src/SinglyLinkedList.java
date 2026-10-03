public class SinglyLinkedList <T>{
    //Es el inicio de la lista
    private Node<T> head;

    //Cantidad de nodos en la lista
    private int size;

    public  SinglyLinkedList(){
        //Como es una lista vacia, no hay primer nodo
        head = null;
        size = 0;

    }
    public boolean isEmpty(){
        return head == null;
    }

    public int getSize() {
        return size;
    }

    //REcorre toda la lista y muestra sus datos
    public void traverse(){
        //Variable de trabajo LOCAL para empezar en el primer nodo
        Node<T> current = head;

        //recorremos hsta pasar el útlimoo nodo
        while (current != null){
            //obtenemos el dato y l mostramos
            System.out.println(current + ", ");

            //Avanzamos current al sisguiente nodo
            current = current.getNext();
        }
        System.out.println();
    }

    //insertar un nodo al inicio
    public void insertFirst(T data){
        Node<T> newNode = new Node(data);

        //El nuevo nodo apunta al que antes era el primermo
        newNode.setNext(head);

        //ahora el nuevo nodo es el pirmeor
        head = newNode;
        size++;
    }

    //insertar un nodo fial
    public void insertLast (T data){
        Node<T> newNode = new Node(data);

        //si la lista esta vacía el nuevo Nodo es el head
        if (isEmpty()) {
            head = newNode;
        }
        else {
            //buscamos el último nodo coon la variable de trabajo
            Node<T> current = head;
            while (current.getNext() != null ){
                current = current.getNext();

            }
            //el úlimo nodo ahora aputa al nuevo
            current.setNext((newNode));
        }
        size++;
    }

    //busca un dato en la lista
    public boolean contains (T data){
        Node<T> current = head;

        while (current != null){
            if (current.getData().equals(data)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    //elikmiamos la primera aparición del dato y regresa true si lo encuentra

    public boolean remove(T data){
        //lista vacía: no hay nda que borrar
        if (isEmpty()){
            return false;
        }

        //Si el dato está en el primer nodo
        if (head.getData() == data) {
            head = head.getNext();
            size--;
            return true;

        }

        //buscmaos en el resto de la lista
        Node<T> previous = head;
        Node<T> current = head.getNext();

        //Avanzamos los dos juntos hsta enocntrar el dato o llegar la final
        while (current != null && !current.getData().equals(data)){
            previous = current;
            current = current.getNext();

        }
        // Si current llegó a null signidica que recorrimos todo y no estaba el dato
        if (current == null){
            return false;
        }

        //Saltamos a current<: el anterior ahora apunta al que veía después
        previous.setNext(current.getNext());
        size--;
        return true;


    }
    //vacia lista
    public void clear() {
        head = null;
        size = 0;
    }
}

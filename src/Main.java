public class Main {
    public static void main(String[] args) {
        // Lista de libros
        SinglyLinkedList<Book> books = new SinglyLinkedList<>();
        books.insertLast(new Book("Clean Code", "Robert C. Martin"));
        books.insertLast(new Book("Effective Java", "Joshua Bloch"));
        books.insertFirst(new Book("Refactoring", "Martin Fowler"));
        books.traverse();
        System.out.println("Existe Clean Code: " + books.contains(new Book("Clean Code", "Robert C. Martin")));
        books.remove(new Book("Clean Code", "Robert C. Martin"));
        books.traverse();


        //crear una lista de stringgs
        //Añadir 3 strings
        //mostrar los 3 strings
        //borrar uno
        //Volver a mostrar
        SinglyLinkedList<String> juegos = new SinglyLinkedList<>();
        juegos.insertFirst(new String("COD"));
        juegos.insertFirst(new String("CUPHEAD"));
        juegos.insertLast(new String("Spelunky"));
        juegos.traverse();
        System.out.println("Existe: cuphead" + juegos.contains("CUPHEAD"));
        juegos.remove("COD");
        juegos.traverse();




    }
}
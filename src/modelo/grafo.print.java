package modelo;

public class PruebasGrafo {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        // Agregar nodos (usuarios y libros)
        grafo.agregarNodo("Usuario1");
        grafo.agregarNodo("Libro1");
        grafo.agregarNodo("Usuario2");
        grafo.agregarNodo("Libro2");
        
        // Agregar aristas (préstamos y devoluciones)
        grafo.agregarArista("Usuario1", "Libro1", 1);
        grafo.agregarArista("Usuario1", "Libro2", 2);
        grafo.agregarArista("Usuario2", "Libro1", 1);
        
        // Imprimir el grafo
        grafo.imprimirGrafo();
    }
}
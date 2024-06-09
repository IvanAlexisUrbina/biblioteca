package modelo;

import java.util.*;

public class Grafo {
    private Map<String, List<Arista>> adjList;

    public Grafo() {
        adjList = new HashMap<>();
    }

    public void agregarNodo(String id) {
        adjList.putIfAbsent(id, new ArrayList<>());
    }

    public void agregarArista(String origen, String destino, int peso) {
        adjList.get(origen).add(new Arista(destino, peso));
    }

    public List<Arista> obtenerAdyacentes(String id) {
        return adjList.get(id);
    }

    public void imprimirGrafo() {
        for (String nodo : adjList.keySet()) {
            System.out.print("Nodo " + nodo + " está conectado a: ");
            for (Arista arista : adjList.get(nodo)) {
                System.out.print(arista.destino + "(" + arista.peso + ") ");
            }
            System.out.println();
        }
    }

    private class Arista {
        String destino;
        int peso;

        public Arista(String destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }
}
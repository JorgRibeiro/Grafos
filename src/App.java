
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Vertice A = new Vertice("A");
        Vertice B = new Vertice("B");
        Vertice C = new Vertice("C");
        Vertice D = new Vertice("D");

        Aresta BC = new Aresta(B, C);
        Aresta AD = new Aresta(A, D);
        Aresta AB = new Aresta(A, B);
        Aresta AC = new Aresta(A, C);

        List<Vertice> listaVertices = new ArrayList<>();
        List<Aresta> listaArestas = new ArrayList<>();

        listaArestas.add(BC);
        listaArestas.add(AB);
        listaArestas.add(AC);
        listaArestas.add(AD);

        listaVertices.add(A);
        listaVertices.add(B);
        listaVertices.add(C);
        listaVertices.add(D);

        Matriz matriz = new Matriz(4, 2, listaArestas, listaVertices);

        matriz.ImprimirMatriz();

    }
}

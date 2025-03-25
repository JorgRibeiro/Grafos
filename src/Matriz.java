import java.util.List;

public class Matriz {

    public int vertices_total;
    public int arestas_total;
    public int[][] matriz;
    public List<Aresta> arestas;
    public List<Vertice> vertices;

    public Matriz(int v, int a, List<Aresta> listaArestas, List<Vertice> Listavertices) {
        this.vertices_total = v;
        this.arestas_total = a;
        this.matriz = new int[v][v];
        this.arestas = listaArestas;
        this.vertices = Listavertices;
        this.fazerMatriz();
    }

    private void fazerMatriz() {
        int linha = 0;
        int coluna = 0;

        for (Vertice vertice_a : vertices) {
            for (Vertice vertice_b : vertices) {
                if (vertice_a.valor.equals(vertice_b.valor)) {
                    matriz[linha][coluna] = 1;
                } else if (vertice_a.Adjacentes.contains(vertice_b)) {
                    matriz[linha][coluna] = 1;
                } else {
                    matriz[linha][coluna] = 0;
                }
                coluna++;
            }
            linha++;
            coluna = 0;
        }
    }

    public void ImprimirMatriz() {
        for (int linha = 0; linha < vertices_total; linha++) {
            for (int coluna = 0; coluna < vertices_total; coluna++) {
                System.out.printf("[%d]", matriz[linha][coluna]);
            }
            System.out.println();
        }
    }

}

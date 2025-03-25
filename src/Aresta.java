public class Aresta {
    public Vertice primeiro;
    public Vertice segundo;
    public String aresta;

    public Aresta(Vertice A, Vertice B) {
        this.primeiro = A;
        this.segundo = B;
        this.aresta = primeiro.valor + segundo.valor;
        primeiro.adicionar_adj(segundo);
        segundo.adicionar_adj(primeiro);
    }

}

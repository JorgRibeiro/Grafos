import java.util.ArrayList;
import java.util.List;

public class Vertice {
    public String v;
    public List<Vertice> Adjacentes;

    public Vertice(String V) {
        this.v = V;
        this.Adjacentes = new ArrayList<>();
    }

    public void adicionar_adj(Vertice novo) {
        Adjacentes.add(novo);
    }

}

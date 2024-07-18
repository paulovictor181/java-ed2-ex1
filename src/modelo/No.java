package modelo;

public class No {

    public int chave;
    public No esq, dir;

    public No(int k) {
        chave = k;
        esq = null;
        dir = null;
    }

    public No(int chave, No esq, No dir) {
        this.chave = chave;
        this.esq = esq;
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "No [chave=" + chave + "]";
    }

    

}

package modelo;

public class ABB {

    No raiz;

    public ABB(){}

    public ABB(No r){
        raiz = r;
    }

    public void ordem(){
        this.ordem(raiz);
    }

    private void ordem(No arv) {
        if(arv != null) {
            this.ordem(arv.esq);
            System.out.print(arv.chave + " ");
            this.ordem(arv.dir);

        }
    } 

    public int altura(No arv) {

        int a, b;
        if(arv == null) {
            return -1;
        }

        a = altura(arv.esq);
        b = altura(arv.dir);

        if(a > b) { 
            return a + 1;
        } else {
            return b + 1;
        }
    }

    public No buscar(int x){
        return this.buscar(raiz, x);
    }

    public No buscar(No arv, int x) {

        if(arv == null) {
            return null;
        }

        if(x < arv.chave){
            return this.buscar(arv.esq, x);
        } else if (x > arv.chave){
            return this.buscar(arv.dir, x);
        } else {
            return arv;
        }
            
    }

    public void inserir(int x){
        this.raiz = this.inserir(raiz, x);
    }

    private No inserir(No arv, int x) {

        if(arv == null) {
            arv = new No(x);
        }

        if(x < arv.chave){
            arv.esq = this.inserir(arv.esq, x);
        } else if (x > arv.chave){
            arv.dir = this.inserir(arv.dir, x);
        }
        
        return arv;
            
    }

}

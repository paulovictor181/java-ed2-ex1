package modelo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArvoreBinaria {

    private No raiz;

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz){
        this.raiz = raiz;
    }

    public void preOrdem(){
        this.preOrdem(getRaiz());
    }

    private void preOrdem(No arv){

        if(arv != null){
            System.out.print(arv.chave + " ");
            preOrdem(arv.esq);
            preOrdem(arv.dir);
        }
    }

    public void Ordem(){
        this.Ordem(getRaiz());
    }

    private void Ordem(No arv){

        if(arv != null){
            Ordem(arv.esq);
            System.out.print(arv.chave + " ");
            Ordem(arv.dir);
        }
    }

    public void posOrdem(){
        this.posOrdem(getRaiz());
    }

    private void posOrdem(No arv){

        if(arv != null){
            posOrdem(arv.esq);
            posOrdem(arv.dir);
            System.out.print(arv.chave + " ");
        }
    }

    public void porNivel(){
        this.porNivel(getRaiz());
    }

    private void porNivel(No arv) {
        No atual = null;
        if(arv != null) {
            Queue<No> fila = new LinkedList<No>();
            fila.add(arv);

            while(fila.isEmpty() == false) {
                atual = fila.remove();
                System.out.println(atual.chave);

                if(atual.esq != null){
                    fila.add(atual.esq);
                } 
                if(atual.dir != null){
                    fila.add(atual.dir);
                } 
            }
        }
    }

    void emOrdemIterativo(){
        if(raiz == null) {
            return;
        }

        Stack<No> pilha = new Stack<>();

        No atual = raiz;

        while (atual != null || !pilha.isEmpty()) {
            while (atual != null) {
                pilha.push(atual);
                atual = atual.esq;
            }
            // Atual é null nesse ponto
            atual = pilha.pop();
            // Visita o nó
            System.out.println(atual.chave + " ");
            // Agora, visita a subárvore direita
            atual = atual.dir;
        }
    }

}

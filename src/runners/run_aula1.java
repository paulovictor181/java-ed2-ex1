package runners;

import modelo.ArvoreBinaria;
import modelo.No;

public class run_aula1 {

    public void run(){
        
          // Criando Nós do nivel 3

        No no7 = new No(7);
        No no10 = new No(10);
        No no16 = new No(16);

        // Criando Nós do nivel 2

        No no4 = new No(4);
        No no9 = new No(9, no7, no10);
        No no17 = new No(17,no16,null);

        // Criando Nós do nivel 1

        No no6 = new No(6, no4, no9);
        No no13 = new No(13, null ,no17);

        // Criando Nós do nivel 0

        No no11 = new No(11, no6 ,no13);
        
        ArvoreBinaria arv = new ArvoreBinaria();

        arv.setRaiz(no11);

        System.out.println("\n Percurso Árvore Pre-Ordem");
        arv.preOrdem();
        System.out.println("\n Percurso Árvore Ordem");
        arv.Ordem();    
        System.out.println("\n Percurso Árvore Pós-Ordem");
        arv.posOrdem();
        System.out.println();
        System.out.println("\n Percurso Árvore Por Nivel");
        arv.porNivel();
        System.out.println();
    }
}

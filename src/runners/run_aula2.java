package runners;

import modelo.ABB;
import modelo.No;

public class run_aula2 {

    public void run(){
                // ABB

        No no4b = new No(4);
        No no9b = new No(9);
        No no6b = new No(6, no4b, no9b);
        No no13b = new No(13);
        No no11b = new No(11, no6b, no13b);

        ABB abb = new ABB();
        System.out.println("Altura da Árvore");
        System.out.println(abb.altura(no11b));
    
        System.out.println();

        System.out.println("Busca do elemento 9: ");
        run_aula2.buscar(abb, 9);
    
    }

    private static void buscar(ABB a, int x){
        No r = a.buscar(x);
        if(r != null){
            System.out.println(r.chave + "Valor encontrado");
        } 
    }
}

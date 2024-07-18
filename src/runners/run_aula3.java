package runners;

import modelo.ABB;

public class run_aula3 {

    public void run() {
        ABB abb = new ABB();
        abb.inserir(11);
        abb.inserir(6);
        abb.inserir(4);
        abb.inserir(9);
        abb.inserir(17);
        abb.inserir(7);
        abb.inserir(10);
        abb.inserir(16);

        System.out.println(abb.buscar(11).toString());
        abb.ordem();
        System.out.println();
        System.out.println("TESTE SEGUNDA ARVORE:");
        abb.inserir(8);
        abb.ordem();
    }
    
}

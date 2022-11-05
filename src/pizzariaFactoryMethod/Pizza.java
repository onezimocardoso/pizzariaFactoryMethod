package pizzariaFactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String nome;
    String massa;
    String molho;
    List<String> ingredientes = new ArrayList<String>();

    public String getNome(){
        return nome;
    }

    public void preparar(){
        System.out.println("Preparando "+nome);
        System.out.println("Abrindo a massa "+massa);
        System.out.println("Adicionando o molho"+molho);
        System.out.println("Ingredientes: ");
        for(String ingrediente : ingredientes){
            System.out.println(ingrediente+", ");
        }
    }

    public void assar(){
        System.out.println("Assando a pizza.");
    }

    public void cortar(){
        System.out.println("Cortando a pizza.");
    }

    public void colocarNaCaixa(){
        System.out.println("Colocando a pizza na caixa.");
    }

}

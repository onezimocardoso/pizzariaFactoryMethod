package pizzariaFactoryMethod;

public abstract class Pizzaria {

    public Pizza pedirPizza(String tipo){
        Pizza pizza;
        pizza = criarPizza(tipo);
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.colocarNaCaixa();
        return pizza;
    }

    abstract Pizza criarPizza(String tipo);
}

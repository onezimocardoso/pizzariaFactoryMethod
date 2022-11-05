package pizzariaFactoryMethod;

public class CheeseCrust extends Pizzaria{

    public Pizza pizza;

    Pizza criarPizza(String tipo){
        if (tipo.equals("Cheese Lovers"))
            pizza = new CheezyCrustCheeseLovers();
        //implementes os outros ifs com
        //os outros sabores
        return pizza;
    }

}

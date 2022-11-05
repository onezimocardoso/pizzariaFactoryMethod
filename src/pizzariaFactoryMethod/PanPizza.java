package pizzariaFactoryMethod;

public class PanPizza extends Pizzaria{

    public Pizza pizza;

    Pizza criarPizza(String tipo){
        if(tipo.equals("Barbecue"))
            pizza = new PanBarbecue();
        //implementes os outros ifs com
        //os outros sabores

        return pizza;
    }

}

package pizzariaFactoryMethod;

public class Loja {
    public static void main(String[] args) {
       Pizzaria panpizza = new PanPizza();
       Pizza pizza = panpizza.pedirPizza("Barbecue");
        System.out.println("Joao pediu uma pizza "+pizza.getNome());
    }
}

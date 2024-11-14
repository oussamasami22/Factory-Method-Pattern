
public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.useProduct(); // Utilisation du produit A

        Creator creatorB = new ConcreteCreatorB();
        creatorB.useProduct(); // Utilisation du produit B
    }
}

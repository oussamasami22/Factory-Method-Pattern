public abstract class Creator {
    public abstract Product createProduct();

    public void useProduct(){
        Product product = createProduct();
        product.use();

    }
    
}

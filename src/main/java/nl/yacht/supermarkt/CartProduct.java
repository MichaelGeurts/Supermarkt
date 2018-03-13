package nl.yacht.supermarkt;

public class CartProduct {
    private Product product;
    private int numberOfProductsInCart;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumberOfProducts() {
        return numberOfProductsInCart;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProductsInCart = numberOfProducts;
    }

    public CartProduct(Product product, int numberOfProducts) {
        this.product = product;
        this.numberOfProductsInCart = numberOfProducts;
    }

    @Override
    public String toString() {
        return "CartProduct{" +
                "product=" + product +
                ", numberOfProductsInCart=" + numberOfProductsInCart +
                '}';
    }
}

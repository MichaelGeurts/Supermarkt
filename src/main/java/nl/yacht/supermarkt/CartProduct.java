package nl.yacht.supermarkt;

public class CartProduct {
    private Product product;
    private int numberOfProducts;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public CartProduct(Product product, int numberOfProducts) {
        this.product = product;
        this.numberOfProducts = numberOfProducts;
    }
}

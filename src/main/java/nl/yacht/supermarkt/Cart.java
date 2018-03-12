package nl.yacht.supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    public List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void Cart(){
        productList = new ArrayList<Product>();
    }

    public void addProductToCart(Product p){
     productList.add(p);
    }

    public void removeProductFromCart(Product p){
        int index = 0;
        for(Product prod : productList){
            if (prod.name.equals(p.name)){
                productList.remove(index);
            }
            index ++;
        }
    }
}

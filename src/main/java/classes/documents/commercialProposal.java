package classes.documents;

import classes.Product;

public class commercialProposal extends Document{
    private int price;
    private Product product;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public commercialProposal(int price, Product product) {
        super("commercialProposal");
        this.price = price;
        this.product = product;
    }
}

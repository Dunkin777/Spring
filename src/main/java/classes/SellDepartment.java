package classes;

public class SellDepartment {
    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
    public void sellProduct(){
        seller.sell();
    }
}

package classes;

import classes.documents.Document;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Seller {
    private int rating;
    List<Product> products;
    Map<String, Integer> prices;
    Properties mood;
    Set<Document> documents;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Map<String, Integer> getPrices() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : prices.entrySet()){
            sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append(" ; ");
        }
        System.out.println(sb.toString());
        return prices;
    }

    public void setPrices(Map<String, Integer> prices) {
        this.prices = prices;
    }

    public Properties getMood() {
        System.out.println(mood);
        return mood;
    }

    public void setMood(Properties mood) {
        this.mood = mood;
    }

    public Set<Document> getDocuments() {
        StringBuilder sb = new StringBuilder();
        for (Document document : documents){
            sb.append(document.getName()).append(" ; ");
        }
        System.out.println(sb.toString());
        return documents;
    }

    public void setDocuments(Set<Document> documents) {
        this.documents = documents;
    }

    public int getRating() {
        System.out.println("Rating is " + rating);
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Seller() {
        System.out.println("Seller is here");
    }

    public void sell() {
        System.out.println("Seller is working");
    }

    private void startWork(){
        System.out.println("Starting to sell");
    }
}

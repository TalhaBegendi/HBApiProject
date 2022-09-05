package model;

import java.util.List;

public class RequestModel {

    Integer id;
    String title;
    String description;
    float price;
    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setBasketDiscount(Boolean basketDiscount) {
        isBasketDiscount = basketDiscount;
    }

    public void setBasketDiscountPercentage(Integer basketDiscountPercentage) {
        this.basketDiscountPercentage = basketDiscountPercentage;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    Boolean isBasketDiscount;
    Integer basketDiscountPercentage;
    Double rating;
    Integer stock;
    Boolean isActive;
    String brand;
    String category;

    public void setImages(List<String> images) {
        this.images = images;
    }
    List<String> images;
    public RequestModel(){}
}

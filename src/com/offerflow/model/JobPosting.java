package com.offerflow.model;

public class JobPosting implements IStatusUpdate {

    private static int counter = 0;
    private int adId;
    private String title;
    private String category;
    private String description;
    private double price;
    private Provider provider;
    private int deliveryTime;
    private boolean isActive;

    public JobPosting(String title, String category, String description, double price, int deliveryTime, Provider provider) {
        this.adId = ++counter;
        this.title = title;
        this.category = category;
        this.description = description;
        this.price = price;
        this.deliveryTime = deliveryTime;
        this.provider = provider;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public Provider getProvider() {
        return provider;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public int getAdId() {
        return adId;
    }

    @Override
    public void updateStatus(String status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getStatus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

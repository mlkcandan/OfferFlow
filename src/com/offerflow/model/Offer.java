package com.offerflow.model;

public class Offer implements IStatusUpdate {

    private int offerId;
    private double amount;
    private String message;
    private int delTime;
    private OfferStatus status;
    JobPosting jobPosting;
    Customer customer;
    Provider provider;

    public Offer(double amount, String message, int delTime, JobPosting jobPosting, Customer customer, Provider provider) {
        this.amount = amount;
        this.message = message;
        this.delTime = delTime;
        this.jobPosting = jobPosting;
        this.customer = customer;
        this.provider = provider;
        this.status = OfferStatus.PENDING;
    }

    public int getOfferId() {
        return offerId;
    }

    public double getAmount() {
        return amount;
    }

    public String getMessage() {
        return message;
    }

    public int getDelTime() {
        return delTime;
    }

    public JobPosting getJobPosting() {
        return jobPosting;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Provider getProvider() {
        return provider;
    }

    @Override
    public void updateStatus(String status) {
        switch (status) {
            case "ACCEPTED":
                this.status = OfferStatus.ACCEPTED;
                break;
            case "CANCELLED":
                this.status = OfferStatus.CANCELLED;
                break;
            case "PENDING":
                this.status = OfferStatus.PENDING;
                break;
            case "REJECTED":
                this.status = OfferStatus.REJECTED;
                break;
            default:
                throw new AssertionError();
        }

    }

    @Override
    public String getStatus() {
        return status.toString();
    }

}

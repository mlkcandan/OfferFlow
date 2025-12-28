package com.offerflow.model;

import java.util.ArrayList;

public class Provider extends User {

    private ArrayList<JobPosting> providerPosts;
    private ArrayList<Offer> offers;
    private double gain = 0.0;

    public Provider(String email, String pasword, UserProfile profile) {
        super(email, pasword, profile);
        providerPosts = new ArrayList<>();
        offers = new ArrayList<>();
    }

    public ArrayList<JobPosting> getProviderPosts() {
        return providerPosts;
    }

    public int postNumber() {
        return providerPosts.size();
    }

    public void createJobPosting(JobPosting jobPost) {
        providerPosts.add(jobPost);
    }

    public void removeJobPosting(int id) {
        for (JobPosting element : providerPosts) {
            if (element.getAdId() == id) {
                providerPosts.remove(element);
            }
        }
    }

    public void comeOffer(Offer o) {
        if (o != null) {
            offers.add(o);
        }
    }

    public void acceptOffer(Offer o) {
        o.updateStatus("ACCEPTED");
        gain += o.getAmount() * o.getDelTime();
        System.out.println("Eklendi: " + o.getAmount() * o.getDelTime());
        System.out.println("Gain: " + gain);
    }

    public void rejectOffer(Offer o) {
        o.updateStatus("REJECTED");
    }

    public double getGain() {
        return gain;
    }

    public int getPendingOffers() {
        int counter = 0;
        for (Offer offer : offers) {
            if (offer.getStatus().equals("PENDING")) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String getRol() {
        return "Provider";
    }

    @Override
    public ArrayList<Offer> getOffers() {
        return offers;
    }

}

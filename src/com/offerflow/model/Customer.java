package com.offerflow.model;

import com.offerflow.manager.DataManager;
import java.util.ArrayList;

public class Customer extends User {

    private ArrayList<Offer> offers;

    public Customer(String email, String pasword, UserProfile profile) {
        super(email, pasword, profile);
        offers = new ArrayList<>();
    }

    public void makeOffer(double amount, String message, int delTime, JobPosting job) {

        Offer offer = new Offer(amount, message, delTime, job, this, job.getProvider());
        DataManager.addOfferGlobal(offer);
        job.getProvider().comeOffer(offer);
        offers.add(offer);

    }

    public boolean cancelOffer(Offer offer) {

        if (offer != null) {
            for (Offer off : offers) {
                if (offer == off) {
                    offer.updateStatus("CANCELLED");
                    //offers.remove(offer);
                    DataManager.offers.remove(offer);
                    return true;
                }
            }
        }
        return false;

    }

    @Override
    public String getRol() {
        return "Customer";
    }

    @Override
    public ArrayList<Offer> getOffers() {
        return offers;
    }

}

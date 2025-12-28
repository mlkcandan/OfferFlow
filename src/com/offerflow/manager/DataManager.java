package com.offerflow.manager;

import com.offerflow.model.JobPosting;
import com.offerflow.model.Offer;
import com.offerflow.model.Provider;
import com.offerflow.model.User;
import java.util.ArrayList;

public class DataManager {

    public static ArrayList<User> users = new ArrayList<>();
    public static final ArrayList<JobPosting> jobPostings = new ArrayList<>();
    public static ArrayList<Offer> offers = new ArrayList<>();

    public static void registerUser(User user) {

        if (user != null) {
            users.add(user);
        }
    }

    public static User loginUser(String email, String pasword) {

        for (User user : users) {
            if (user.login(email, pasword)) {
                return user;
            }
        }
        return null;
    }

    public static void addJobGlobal(JobPosting job) {

        if (job != null) {
            jobPostings.add(job);
        }
    }

    public static boolean deleteJobGlobal(int id) {

        Provider provider = (Provider) User.currentUser;
        for (JobPosting jobPosting : jobPostings) {
            if (jobPosting.getAdId() == id) {
                jobPostings.remove(jobPosting);
                provider.getProviderPosts().remove(jobPosting);
                return true;
            }
        }
        return false;
    }

    static ArrayList<JobPosting> filterPosts = new ArrayList<>();

    public static ArrayList<JobPosting> displayJobRecursive(String category) {
        filterPosts.clear();
        return displayJobRecursive(category, 0);
    }

    public static ArrayList<JobPosting> displayJobRecursive(String category, int index) {

        if (index == jobPostings.size()) {
            return filterPosts;
        }

        if (jobPostings.get(index).getCategory().equalsIgnoreCase(category)) {
            filterPosts.add(jobPostings.get(index));
        }

        return displayJobRecursive(category, ++index);
    }

    static ArrayList<JobPosting> searchPosts = new ArrayList<>();

    public static ArrayList<JobPosting> searchJobRecursive(String keyword) {
        searchPosts.clear();
        return searchJobRecursive(keyword, 0);
    }

    public static ArrayList<JobPosting> searchJobRecursive(String keyword, int index) {

        if (index == jobPostings.size()) {
            return searchPosts;
        }

        if (jobPostings.get(index).getTitle().toLowerCase().contains(keyword.toLowerCase())) {
            searchPosts.add(jobPostings.get(index));
        }

        return searchJobRecursive(keyword, ++index);
    }

    public static void addOfferGlobal(Offer offer) {

        if (offer != null) {
            offers.add(offer);
        }
    }

}

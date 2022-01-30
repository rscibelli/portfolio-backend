package com.rob.robsPortfolio.services;

import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    public String getFeedback() {
        System.out.println("good app");
        return "good app";
    }

    public void createFeedback(String feedback) {
        System.out.println(feedback);
    }
}

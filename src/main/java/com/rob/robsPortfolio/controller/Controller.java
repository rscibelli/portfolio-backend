package com.rob.robsPortfolio.controller;

import com.rob.robsPortfolio.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    FeedbackService feedbackService;

    @GetMapping("/feedback")
    public String getFeedback() {
        return feedbackService.getFeedback();
    }

    @PostMapping("/feedback")
    public void createFeedback(@RequestBody String feedback) {
        feedbackService.createFeedback(feedback);
    }

}

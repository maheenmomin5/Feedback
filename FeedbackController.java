package com.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.model.Feedback;
import com.feedback.repository.FeedbackRepository;

@RestController
@RequestMapping("feedback")
public class FeedbackController {
	
	@Autowired
	private FeedbackRepository repo;
	
	@GetMapping("/")
	public String showServiceName() {
		return "Feedback";
	}
	@GetMapping("/feedback/{id}")
	public Feedback showFeedbackById(@PathVariable Integer id) {
		return repo.findById(id).get();
	}
	@PostMapping("/submitfeedback")
	public String addFeedback(Feedback newFeedback) {
		return "Feedback Saved to database" + repo.save(newFeedback);
			
	}
}

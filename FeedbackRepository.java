package com.feedback.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.feedback.model.*;

@Repository
public interface FeedbackRepository extends CrudRepository <Feedback, Integer> {

}

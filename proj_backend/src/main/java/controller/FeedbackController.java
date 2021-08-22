package controller;

import dao.FeedbackDAO;
import dao.impl.FeedbackDAOImpl;
import model.Feedback;

public class FeedbackController {

	public static void main(String[] args) {
		
		FeedbackDAO fdao= new FeedbackDAOImpl();
		
		Feedback feedback=new Feedback(106,"Karthik","kart@gmail.com","bad");
		
		fdao.saveFeedback(feedback);
		System.out.println("Inserted Successfully");

	}

}

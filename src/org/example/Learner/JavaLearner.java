package org.example.Learner;

public class JavaLearner extends Learner{

    public boolean doesKnowOOPs;

    public JavaLearner(String learnerId, String learnerName, String learnerPhoneNo, String learnerEmail, boolean b) {
        super(learnerId, learnerName, learnerPhoneNo, learnerEmail);
        this.doesKnowOOPs = doesKnowOOPs;
    }

    @Override
    public void displayLearnerDetails() {
        System.out.println("Learner Name: "+ LearnerName);
        System.out.println("Learner Id: "+ LearnerId);
        System.out.println("Learner Phone: "+ LearnerPhoneNo);
        System.out.println("Learner Mail Id: "+ LearnerEmail);
        System.out.println("doesKnowOOPs? : "+doesKnowOOPs);
    }
}

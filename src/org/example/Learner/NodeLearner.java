package org.example.Learner;

public class NodeLearner extends Learner{

    public boolean doesKnowJS;

    public NodeLearner(String learnerId, String learnerName, String learnerPhoneNo, String learnerEmail, boolean doesKnowJS) {
        super(learnerId, learnerName, learnerPhoneNo, learnerEmail);
        this.doesKnowJS = doesKnowJS;
    }

    @Override
    public void displayLearnerDetails() {
        System.out.println("Learner Name: "+ LearnerName);
        System.out.println("Learner Id: "+ LearnerId);
        System.out.println("Learner Phone: "+ LearnerPhoneNo);
        System.out.println("Learner Mail Id: "+ LearnerEmail);
        System.out.println("doesKnowJS? : "+doesKnowJS);
    }
}

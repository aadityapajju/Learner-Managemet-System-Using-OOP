package org.example.Learner;

public abstract class Learner {
    public String LearnerId;
    public String LearnerName;
    public String LearnerPhoneNo;
    public String LearnerEmail;

    public Learner(String learnerId, String learnerName, String learnerPhoneNo, String learnerEmail) {
        LearnerId = learnerId;
        LearnerName = learnerName;
        LearnerPhoneNo = learnerPhoneNo;
        LearnerEmail = learnerEmail;
    }

    public String getLearnerId() {
        return LearnerId;
    }

    public void setLearnerId(String learnerId) {
        LearnerId = learnerId;
    }

    public String getLearnerName() {
        return LearnerName;
    }

    public void setLearnerName(String learnerName) {
        LearnerName = learnerName;
    }

    public String getLearnerPhoneNo() {
        return LearnerPhoneNo;
    }

    public void setLearnerPhoneNo(String learnerPhoneNo) {
        LearnerPhoneNo = learnerPhoneNo;
    }

    public String getLearnerEmail() {
        return LearnerEmail;
    }

    public void setLearnerEmail(String learnerEmail) {
        LearnerEmail = learnerEmail;
    }

    public abstract void displayLearnerDetails();
}

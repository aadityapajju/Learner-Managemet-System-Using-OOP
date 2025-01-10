package org.example.Cohort;

import org.example.Instructor.Instructor;
import org.example.Learner.Learner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cohort {

    public String cohortId;
    public String cohortName;
    public Date startDate;
    public Date endDate;
    public List<Learner> _learnerList;
    public List<Instructor> _instructorList;

    public Cohort(String cohortId, String cohortName, Date startDate, Date endDate) {
        this.cohortId = cohortId;
        this.cohortName = cohortName;
        this.startDate = startDate;
        this.endDate = endDate;
        this._learnerList = new ArrayList<>();
        this._instructorList = new ArrayList<>();
    }

    public String getCohortId() {
        return cohortId;
    }

    public void setCohortId(String cohortId) {
        this.cohortId = cohortId;
    }

    public String getCohortName() {
        return cohortName;
    }

    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void addLearner(Learner learner){
        _learnerList.add(learner);
    }

    public void addInstructor(Instructor instructor){
        _instructorList.add(instructor);
    }

    public void displayCohortDetails(){
        System.out.println("Cohort Id"+cohortId);
        System.out.println("Cohort name"+cohortName);
        System.out.println("Cohort start date"+startDate);
        System.out.println("Cohort end date"+endDate);
        for(int i=0;i<_learnerList.size();i++){
            System.out.println("Learner Id: "+_learnerList.get(i).getLearnerId());
            System.out.println("Learner Name: "+_learnerList.get(i).getLearnerName());
            System.out.println("Learner Ph no: "+_learnerList.get(i).getLearnerPhoneNo());
            System.out.println("Learner Mail Id: "+_learnerList.get(i).getLearnerEmail());
        }
        for(int i=0;i<_instructorList.size();i++){
            System.out.println("Instructor Id: "+_instructorList.get(i).getInstructorId());
            System.out.println("Instructor Name: "+_instructorList.get(i).getInstructorName());
            System.out.println("Instructor Ph no: "+_instructorList.get(i).getInstructorPhoneNo());
            System.out.println("Instructor Mail Id: "+_instructorList.get(i).getInstructorEmail());
        }
    }
}

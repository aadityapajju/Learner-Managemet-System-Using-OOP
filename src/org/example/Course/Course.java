package org.example.Course;

import org.example.Cohort.Cohort;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {

    public String courseId;
    public String courseName;
    public String courseDesc;
    public String courseLanguage;  //java, node
    public List<Cohort> _cohortList;

    public Course(String courseId, String courseName, String courseDesc, String courseLanguage) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDesc = courseDesc;
        this.courseLanguage = courseLanguage;
        this._cohortList = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public List<Cohort> get_cohortList() {
        return _cohortList;
    }

    public void addCohortToList(Cohort cohort) {
        _cohortList.add(cohort);
    }

    public abstract void displayCourseDetails();
}

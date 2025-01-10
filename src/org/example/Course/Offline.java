package org.example.Course;

public class Offline extends Course{

    public String location;

    public Offline(String courseId, String courseName, String courseDesc, String courseLanguage, String location) {
        super(courseId, courseName, courseDesc, courseLanguage);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void displayCourseDetails() {
        System.out.println("CourseId: "+courseId);
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Description: "+courseDesc);
        System.out.println("Course language: "+courseLanguage);
        System.out.println("Location: "+location);
        for(int i=0;i<_cohortList.size();i++){
            _cohortList.get(i).displayCohortDetails();

        }
    }
}

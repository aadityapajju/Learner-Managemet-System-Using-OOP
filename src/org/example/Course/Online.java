package org.example.Course;

public class Online extends Course {

    public String zoomUrl;

    public Online(String courseId, String courseName, String courseDesc, String courseLanguage, String zoomUrl) {
        super(courseId, courseName, courseDesc, courseLanguage);
        this.zoomUrl = zoomUrl;
    }

    public String getZoomUrl() {
        return zoomUrl;
    }

    public void setZoomUrl(String zoomUrl) {
        this.zoomUrl = zoomUrl;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("CourseId: "+courseId);
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Description: "+courseDesc);
        System.out.println("Course language: "+courseLanguage);
        System.out.println("zoom Url: "+zoomUrl);
        for(int i=0;i<_cohortList.size();i++){
            _cohortList.get(i).displayCohortDetails();

        }
    }
}

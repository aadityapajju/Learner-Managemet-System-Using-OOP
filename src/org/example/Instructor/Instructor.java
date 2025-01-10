package org.example.Instructor;

public class Instructor {
    public String InstructorId;
    public String InstructorName;
    public String InstructorPhoneNo;
    public String InstructorEmail;

    public Instructor(String instructorId, String instructorEmail, String instructorPhoneNo, String instructorName) {
        InstructorId = instructorId;
        InstructorEmail = instructorEmail;
        InstructorPhoneNo = instructorPhoneNo;
        InstructorName = instructorName;
    }

    public String getInstructorId() {
        return InstructorId;
    }

    public void setInstructorId(String instructorId) {
        InstructorId = instructorId;
    }

    public String getInstructorName() {
        return InstructorName;
    }

    public void setInstructorName(String instructorName) {
        InstructorName = instructorName;
    }

    public String getInstructorPhoneNo() {
        return InstructorPhoneNo;
    }

    public void setInstructorPhoneNo(String instructorPhoneNo) {
        InstructorPhoneNo = instructorPhoneNo;
    }

    public String getInstructorEmail() {
        return InstructorEmail;
    }

    public void setInstructorEmail(String instructorEmail) {
        InstructorEmail = instructorEmail;
    }

    public void displayInstructorDetails() {
        System.out.println("Instructor Name: "+ InstructorName);
        System.out.println("Instructor Id: "+ InstructorId);
        System.out.println("Instructor Phone: "+ InstructorPhoneNo);
        System.out.println("Instructor Mail Id: "+ InstructorEmail);
    }
}

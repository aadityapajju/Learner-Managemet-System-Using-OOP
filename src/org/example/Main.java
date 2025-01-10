package org.example;

import org.example.Cohort.Cohort;
import org.example.Course.Course;
import org.example.Course.Offline;
import org.example.Course.Online;
import org.example.Instructor.Instructor;
import org.example.Learner.JavaLearner;
import org.example.Learner.Learner;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Airtribe!");
        System.out.println("------------------------------");

        Course javaOffline = new Offline("1","Java-Of","BEL-Java-Offline","Java","Blr");
        Course javaOnline = new Online("2","Java-On", "BEL-Java-Online","Java","https://www.youtube.com/");
        Course nodeOffline = new Offline("3","Node-Of","BEL-Node-Offline","Node","Hyd");
        Course nodeOnline = new Online("4","Node-On", "BEL-Node-Online","Node","https://www.youtube.com/");

        Cohort c1 = new Cohort("c1","jc1",new Date(), new Date());
        Cohort c2 = new Cohort("c2","jc2",new Date(), new Date());
        javaOnline.addCohortToList(c1);
        javaOnline.addCohortToList(c2);

        Cohort n1 = new Cohort("c1","nc1",new Date(), new Date());
        Cohort n2 = new Cohort("c2","nc2",new Date(), new Date());
        nodeOnline.addCohortToList(n1);
        nodeOffline.addCohortToList(n2);

        Learner l1 = new JavaLearner("j1","jvaLearner","39487","jv@g.c",true);
        Learner l2 = new JavaLearner("j2","jvaLearner2","394872","jv2@g.c", true);
        c1.addLearner(l1);
        c2.addLearner(l2);

        Instructor i1 = new Instructor("j1","jvaInstructor","39487","jv@g.c");
        c1.addInstructor(i1);
        c2.addInstructor(i1);

        javaOnline.displayCourseDetails();


    }
}
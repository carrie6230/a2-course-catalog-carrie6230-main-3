package ui;

import model.Course;
import model.CourseCatalog;
//import model.Department;

public class Main {
    public static void main(String[] args) throws Exception {
    

    Course course1= new Course("math", "applied math", "required", "business", "Baker",4);
    Course course2= new Course("physics", "atomic physics", "required", "science", "Nelson", 4);
    Course course3= new Course("chemistry", "organic chemistry", "required", "science", "Reich", 4);
    Course course4= new Course("literature", "english literature", "elective", "linguistics", "Lindsey", 3);
    Course course5= new Course("geography", "world geography", "elective", "humanity", "Johnson", 2);
    Course course6= new Course("history", "american history", "elective", "humanity", "Howard", 2);

    // Department business= new Department("business");
    // Department science=  new Department("science");
    // Department linguistics= new Department("linguistics");
    // Department humanity= new Department("humanity");

    CourseCatalog courseCatalog = new CourseCatalog();
    courseCatalog.addCourse(course1);
    courseCatalog.addCourse(course2);
    courseCatalog.addCourse(course3);
    courseCatalog.addCourse(course4);
    courseCatalog.addCourse(course5);
    courseCatalog.addCourse(course6);

    Course course7 = courseCatalog.findCourseByCoursename("math");
    System.out.println(course7);

    Course course8 = courseCatalog.findCourseByDescription("atomic physics");
    System.out.println(course8);


    java.util.ArrayList<Course> list1 = courseCatalog.findCourseByCoursetype("required");
    System.out.println(list1);

    java.util.ArrayList<Course> list2 = courseCatalog.findCourseByDepartment("science");
    System.out.println(list2);

    java.util.ArrayList<Course> list3 = courseCatalog.findCourseByProfessor("Baker");
    System.out.println(list3);

    java.util.ArrayList<Course> list4 = courseCatalog.findCourseByCredit(4);
    System.out.println(list4);



    
    
    

    






   
}
}

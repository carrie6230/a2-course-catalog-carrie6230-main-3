package model;

import java.util.ArrayList;

public class CourseCatalog {
    ArrayList<Course> courselist;

    public CourseCatalog() {
        courselist = new ArrayList<Course>();
    }

    public CourseCatalog(ArrayList<Course> courselist) {
        this.courselist = courselist;
    }

    public Course addCourse(String coursename, String description, String coursetype, String department,
            String professor, int credit) {
        Course newCourse = new Course();
        newCourse.setCoursename(coursename);
        newCourse.setDescription(description);
        newCourse.setCoursetype(coursetype);
        newCourse.setDepartment(department);
        newCourse.setProfessor(professor);
        newCourse.setCredit(credit);
        courselist.add(newCourse);
        return newCourse;

    }

    public Course findCourseByCoursename(String coursename) {
        for (Course c : courselist) {
            if (c.getCoursename() == coursename)
                return c;
        }
        return null;
    }

    public Course findCourseByDescription(String description) {
        for (Course c : courselist) {
            if (c.getDescription() == description)
                return c;
        }
        return null;

    }

    public ArrayList<Course> findCourseByCoursetype(String coursetype) {
        ArrayList<Course> list = new ArrayList<>();
        for (Course c : courselist) {
            if (c.getCoursetype() == coursetype) {
                list.add(c);
            }
        }
        return list;
    }

    public ArrayList<Course> findCourseByDepartment(String department) {
        ArrayList<Course> list = new ArrayList<>();
        for (Course c : courselist) {
            if (c.getDepartment() == department) {
                list.add(c);
            }
        }
        return list;
    }

    public ArrayList<Course> findCourseByProfessor(String professor) {
        ArrayList<Course> list = new ArrayList<>();
        for (Course c : courselist) {
            if (c.getProfessor() == professor) {
                list.add(c);
            }
        }
        return list;
    }

    public ArrayList<Course> findCourseByCredit(int credit) {
        ArrayList<Course> list = new ArrayList<>();
        for (Course c : courselist) {
            if (c.getCredit() == credit) {
                list.add(c);
            }
        }
        return list;
    }

    public void addCourse(Course course2) {
        this.courselist.add(course2);
    }

}

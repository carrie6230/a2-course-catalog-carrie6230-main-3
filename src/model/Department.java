package model;

import java.util.List;

public class Department {
    String departmentName;
    List<Course> course;


    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department(String string, Object object) {
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

}

    


    









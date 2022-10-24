package model;

public class Course {
    String coursename;
    String description;
    String coursetype;
    String department;
    String professor;
    int credit;



    public Course(String coursename, String description, String coursetype, String department, String professor,
            int credit) {
        this.coursename = coursename;
        this.description = description;
        this.coursetype = coursetype;
        this.department = department;
        this.professor = professor;
        this.credit = credit;
    }

    
    public Course() {
    }


    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }



    @Override
    public String toString() {
        return "Course [coursename=" + coursename + ", description=" + description + ", coursetype=" + coursetype
                + ", department=" + department + ", professor=" + professor + ", credit=" + credit + ", coursecode="
             + "]";
    }

    
}

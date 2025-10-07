package ua.opnu;

public class Student {
    private String fullName;
    private int studyYear;
    private String[] courses = new String[50];
    private int courseCount = 0;

    public Student(String name, int year) {
        this.fullName = name;
        if (year >= 1 && year <= 4) {
            this.studyYear = year;
        } else {
            this.studyYear = 1;
        }
    }

    public void addCourse(String courseName) {
        if (courseName != null && !courseName.isEmpty() && courseCount < courses.length) {
            courses[courseCount++] = courseName;
        }
    }

    public void dropAll() {
        courseCount = 0;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public String getName() {
        return fullName;
    }

    public int getYear() {
        return studyYear;
    }

    public int getTuition() {
        return studyYear * 20000;
    }
}

package FirstTask;

import java.util.Iterator;
import java.util.List;

public class Student {
    public String name;
    public int numberOfGroup;
    public int numberOfCourse;
    public List<Integer> grades;

    public Student(String name, int numberOfGroup, int numberOfCourse, List<Integer> grades) {
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        this.numberOfCourse = numberOfCourse;
        this.grades = grades;
    }


    public int getNumberOfCourse() {
        return numberOfCourse;
    }
    public String getName() {
        return name;
    }

    public int promote(){
        this.numberOfCourse ++;
        return 0;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    private int countGrades;
    public double averageOfGrades(List<Integer> grades){
        Iterator<Integer> iterator = grades.iterator();
        while(iterator.hasNext()){
            int student = iterator.next();
            countGrades += student;
        }
        return (double) countGrades /grades.size();
    }
}

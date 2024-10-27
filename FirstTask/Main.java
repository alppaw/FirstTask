package FirstTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void filterAndPromoteStudents(List<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            double averageGrade =student.averageOfGrades(student.getGrades()) ;
            //System.out.printf(averageGrade+" ");
            if(averageGrade < 3){
                iterator.remove();
            }
            else{
                student.promote();
            }
        }
    }
    public static void printStudents(List<Student> students, int course){
        for(Student student : students){
            if(student.getNumberOfCourse() == course){
                System.out.printf(student.getName()+" ");
            }
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Danil",433,2, List.of(4,3,5,4,4)));
        students.add(new Student("Artur",104,2, List.of(5,4,4,3,5)));
        students.add(new Student("Aleksei",423,2, List.of(3,3,3,2,3)));
        students.add(new Student("Gosha",411,1, List.of(5,5,5,5,5)));

        filterAndPromoteStudents(students);
        printStudents(students, 3);

    }
}
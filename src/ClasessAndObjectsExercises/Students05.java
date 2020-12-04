package ClasessAndObjectsExercises;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Students05 {

    static class Students{
        String firstName;
        String lastName;
        double grade;

        public  Students (String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName (){
            return firstName;
        }

        public String getLastName (){
            return lastName;
        }

        public double getGrade (){
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f",this.firstName,this.lastName,this.grade);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        List<Students> students = new ArrayList<>();
        for (int i = 0; i < count; i++  ){
            String[] line = scan.nextLine().split("\\s+");
            Students student = new Students(line[0],line[1],Double.parseDouble(line[2]));
            students.add(student);
        }
        students.sort(Comparator.comparingDouble(Students::getGrade).reversed());
        students.forEach(System.out::println);
    }
}

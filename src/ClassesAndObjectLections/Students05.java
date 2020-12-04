package ClassesAndObjectLections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String line = scan.nextLine();

        while (!line.equals("end")) {
            String[] parameters = line.split(" ");

            Student s = new Student(parameters[0], parameters[1], Integer.parseInt(parameters[2]), parameters[3]);
          // todo: overwrite if matching firs and last name

            int existIndex = findStudentIndex(students,s.getFirstName(),s.getLastName());
            if (existIndex != -1){
                students.get(existIndex).setHometown(s.hometown);
                students.get(existIndex).setAge(s.age);
            }else {
                students.add(s);
            }

            line = scan.nextLine();

        }

        String searchTownName = scan.nextLine();
        for (Student student : students) {
            if (student.getHometown().equals(searchTownName)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName()
                        , student.getAge());
            }

        }
    }

    static  int findStudentIndex (List<Student> students, String firstName, String lastName){
        for (int i = 0; i <students.size() ; i++) {
            if (students.get(i).getFirstName().equals(firstName)
                    && (students.get(i).getLastName().equals(lastName) )) {
                return i;
            }
        }
        return -1;
    }

    static class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;


        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getHometown() {
            return hometown;
        }
    }
}

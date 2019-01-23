import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();



            students.add(new Student("Gates", "Bill", "Petrovich", 1987, "Yunnosti 36", "0987876765", 1, Faculty.FITKI, Course.C_1, Group.B1A));
            students.add(new Student("Jobs", "Steve", "Ivanovich", 1990, "Kosmonavtiv 4", "0874635463", 2, Faculty.IIM, Course.C_2, Group.A2A));
            students.add(new Student("Dobkin", "Richard", "Semenovich", 1995, "Komsomolska 11", "0473625364", 3, Faculty.FITKI, Course.C_1, Group.B1A));


        University university = new University();
        university.getStudentsByFaculty(students);
        university.getStudentsByCourse(students);
        university.getStudentsByYear(students);
        System.out.println(students);
    }

}









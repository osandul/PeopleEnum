import java.util.ArrayList;

public class University {
    public void getStudentsByFaculty(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.faculty.equals(Faculty.FITKI)) {
                System.out.println(student.toString());
            }
        }
    }

    public void getStudentsByCourse(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
           // for (int j = 0; j < students.size(); j++) {
                Student student = students.get(i);
                if (student.course.equals(Course.C_2)) {
                    System.out.println(student.toString());
                }
            }
        }


    public void getStudentsByYear(ArrayList<Student> students) {
        for (int j = 0; j < students.size(); j++) {
            Student student = students.get(j);
            if (student.birthDate >= 1990)
                System.out.println(student.toString());
        }
    }

    static {
        System.out.println(Faculty.values());
      System.out.println(Course.values());
      System.out.println(Group.values());
    }

}







public class Student extends Person {
    public int id;
    Faculty faculty;
    Course course;
    Group group;


    public Student(String lastName, String name, String parentName, int birthDate, String adress, String phone,
                   int id, Faculty faculty, Course course, Group group) {
        super(lastName, name, parentName, birthDate, adress, phone);
        this.id = id;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.lastName = lastName;
        this.name = name;
        this.parentName = parentName;
        this.birthDate = birthDate;
        this.adress = adress;
        this.phone = phone;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", course=" + course +
                ", group=" + group +
                ", faculty=" + faculty +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", parentName='" + parentName + '\'' +
                ", birthDate=" + birthDate +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}



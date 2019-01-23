public class Person {

    public String lastName;
    public String name;
    public String parentName;
    public int birthDate;
    public String adress;
    public String phone;


    public Person(String lastName, String name, String parentName, int birthDate, String adress, String phone) {
        this.lastName = lastName;
        this.name = name;
        this.parentName = parentName;
        this.birthDate = birthDate;
        this.adress = adress;
        this.phone = phone;

    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", parentName='" + parentName + '\'' +
                ", birthDate=" + birthDate +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }



}






/* Т.к. впереди выходные, то заданий будет два :)

 ЗАДАНИЕ 1
 Создать класс Person: Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон.
 переопределить метод toString()
 Класс Student унаследовать класса Person: id, Адрес, Телефон, Факультет, Курс, Группа.
 переопределить метод toString()
 Создать класс University с полями Название, Список студентов переопределить метод toString()
 В классе University создать методы для получения:
 a) списка студентов заданного факультета;
 b) списка студентов для каждого факультета и курса;
 c) списка студентов, родившихся после заданного года;
 d) списка учебной группы.

 ЗАДАНИЕ 2
 2. Задана строка с текстом.
 Используя HashMap создать мапу символов и их количества в данной строке.
 Например: Мама мыла раму
 М, 1
 а, 4
 м, 3
 , 2
 ы, 1
 л, 1
 р, 1
 у, 1*/
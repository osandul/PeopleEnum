public enum Course {
    C_1(1),
    C_2(2),
    C_3(3),
    C_4(4);

    int number;

    Course(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Course{" +
                "number=" + number +
                '}';
    }
}

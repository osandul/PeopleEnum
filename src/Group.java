public enum Group {
    A1A("A1A"),
    A2A("A2A"),
    B1A("B1A"),
    B1B(" B1B");

    String groupName;

    Group(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}

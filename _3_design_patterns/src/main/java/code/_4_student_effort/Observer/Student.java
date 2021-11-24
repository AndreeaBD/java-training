package Observer;

public class Student implements ObserverStudents{
    private String name;

    public Student (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void listenTo (Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update (String message) {
        System.out.println("Student " + name + " learned about " + message);
    }
}

//iqra cabdisalaan cabdullahi
//c6240231
public class Student {
    private int id;
    private String name;
    private int age;
    private String department;
    private double gpa;

    static String university = "Mogadishu University";

    public Student(int id, String name, int age, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;

        if (gpa >= 0 && gpa <= 4)
            this.gpa = gpa;
        else
            this.gpa = 0;
    }

    public boolean hasPassed() {
        return gpa >= 2.0;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age + " "
                + department + " " + gpa);
        System.out.println("University: " + university);
        System.out.println("Passed: " + hasPassed());
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "ikhlaas", 20, "IT", 3.2);
        Student s2 = new Student(102, "asma", 21, "CS", 2.8);
        Student s3 = new Student(103, "nacima", 19, "Business", 1.7);
        Student s4 = new Student(104, "ifraax", 22, "Software", 3.5);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }


}

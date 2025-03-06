import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;
    private int mob;

    public Student(String name, int age, int mob) {
        this.name = name;
        this.age = age;
        this.mob = mob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mob=" + mob +
                '}';
    }
}


public class lec_1_example2 {

    public static void main(String[] args) {

        Student prayansh=new Student("payansh",21,9056);
        Student ram=new Student("ram",18,84622);
        Student shyam=new Student("shyam",33,19472);

        List<Student> Students=Arrays.asList(prayansh,ram,shyam);
        Students.stream().forEach(student-> System.out.println(student));
    }


}

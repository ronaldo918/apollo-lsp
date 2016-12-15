/**
 * Created by liushanping on 15/8/8.
 */
public class Student {
    private int number;
    private String name;
    private int age;
    private int sex;

    public Student() {
    }

    public Student(int number, String name, int age, int sex) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}

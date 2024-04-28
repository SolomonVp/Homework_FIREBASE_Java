package r.d.homeworkfirebase;

public class User {
    private String Name;
    private String lasName;
    private int age;
    private String sex;

    public User(String name, String lasName, int age, String sex) {
        Name = name;
        this.lasName = lasName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

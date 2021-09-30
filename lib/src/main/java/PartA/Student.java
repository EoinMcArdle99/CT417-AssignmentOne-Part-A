package PartA;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String dob;
    private long id;
    private String username;
    private ArrayList<Module> modules;
    private ArrayList<Course> course;

    public Student() {
        
    }

    public Student(String name, int age, String dob, long id, ArrayList<Module> modules, ArrayList<Course> course) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.modules = modules;
        this.course = course;
        this.username = getUsername();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.name + this.dob;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Module> getModules() {
        return this.modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Course> getCourse() {
        return this.course;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }
}

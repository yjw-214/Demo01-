package cn.yxw.demo.springdatedemo.pojo;

public class Student {
    private  Integer id;
    private String name;
    private String password;

    public Student(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    public Student( String name, String password) {
        this.name = name;
        this.password = password;
    }
    public Student() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}

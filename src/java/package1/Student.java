package package1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agali
 */

public class Student {
    int id;
    int age;
    String name;
    String surname;
    String email;
    String password;
    String country;
    String faculty;
    String university;
    String[] courses;
    
    public  Student() {
        
    }
    

    public Student(int id, int age, String name, String surname, String email, String password, String country, String faculty, String university, String courses[]) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.country = country;
        this.faculty = faculty;
        this.university = university;
        this.courses = courses;
    }

    public Student(String email, String password) {
        this.email = email;
        this.password = password;
    }

//    public Student(String email, String password) {
//        this.email = email;
//        this.password = password;
//    }

    public int getId() {
        return id;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
    
    
}


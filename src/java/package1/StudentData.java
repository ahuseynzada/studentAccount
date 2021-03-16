/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;
import java.sql.*;
/**
 *
 * @author agali
 */
public class StudentData {
    Connection con ;

    public StudentData(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveStudent(Student student){
        boolean set = false;
        try{ 
           //Insert register data to database
           String query = "insert into student(email,password) values(?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, student.getEmail());
           pt.setString(2, student.getPassword());
           
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    
    public Student loginStudent(String email, String password) {
        Student student = null;
        try{
            String query = "select * from student where email=? and password=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                student = new Student();
                student.setId(rs.getInt("id"));
                student.setEmail(rs.getString("email"));
                student.setPassword(rs.getString("password"));
                student.setSurname(rs.getString("surname"));
                student.setName(rs.getString("name"));
                student.setUniversity(rs.getString("university"));
                student.setFaculty(rs.getString("faculty"));
                student.setAge(rs.getInt("age"));
                student.setCountry(rs.getString("country"));
            } else {
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
        
}

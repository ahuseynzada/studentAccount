/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author agali
 */
public class CoursesData {
    Connection con ;

    public CoursesData(Connection con) {
        this.con = con;
    }
    
    //for register user 
    
    
    public Student enrollCourse(int cid) {
        Student student = null;
        try{
            String query = "enroll * from student where cid=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setInt(1, cid);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                student = new Student();
//                student.setCourses(rs.getArray("id"));
            } else {
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

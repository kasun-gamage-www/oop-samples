/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataacess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

/**
 *
 * @author userB12
 */
public class StudentDAO {

    public static void insertStudent(Student std) {
        DBConnection.execute("INSERT INTO student VALUES (" + std.getRegNum() + ", " + std.getName() + ", " + std.getTma1() + ", " + std.getTma2() + ", " + std.getTma3() + ")");
    }

    public static void editStudent(int id, Student std) {

    }

    public static void deleteStudent(int id) {

    }

    public static Student findStudent(int id) {
        ResultSet rs = DBConnection.executeQuery("SELECT * FROM student WHERE regNum=" + id);
        Student s = null;
        try {
            rs.next();
            /*Assuming there is only one record matching the ID*/
            s = new Student(rs.getInt("regNum"));
            s.setName(rs.getString("name"));
            s.setTma1(rs.getInt("tma1"));
            s.setTma2(rs.getInt("tma2"));
            s.setTma3(rs.getInt("tma3"));

        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

}

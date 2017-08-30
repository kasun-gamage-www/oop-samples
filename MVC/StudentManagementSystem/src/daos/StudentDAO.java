/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

/**
 *
 * @author Kasun Gamage
 */
public class StudentDAO {

    public static int insertStudent(Student std) throws ClassNotFoundException, SQLException {
        return DBConnection.executeUpdate("INSERT INTO student VALUES(" + std.getRegistrationNumber() + ", '" + std.getName() + "'," + std.getTma1() + "," + std.getTma2() + ", " + std.getTma3() + ")");
    }

    public static int updateStudent(long id, Student std) throws ClassNotFoundException, SQLException {
        return DBConnection.executeUpdate("UPDATE student SET name = '" + std.getName() + "', tma1 = " + std.getTma1() + ", tma2 = " + std.getTma2() + " , tma3 = " + std.getTma3() + " WHERE reg_num = " + id);
    }

    public static int deleteStudent(long id) throws ClassNotFoundException, SQLException, SQLException {
        return DBConnection.executeUpdate("DELETE FROM student WHERE reg_num = " + id);
    }

    public static Student findStudent(long id) throws ClassNotFoundException, SQLException {
        Student s = null;
        ResultSet results = DBConnection.executeQuery("SELECT * FROM student WHERE reg_num = " + id);

        if (results.next()) {
            s = new Student(results.getInt("reg_num"));
            s.setName(results.getString("name"));
            s.setTma1(results.getInt("tma1"));
            s.setTma2(results.getInt("tma2"));
            s.setTma3(results.getInt("tma3"));
        }
        /*If no matching records were found the method returns the initial value of 's' which is null*/
        return s;
    }
}

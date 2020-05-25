/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Account;
import Entity.Course;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luuka
 */
public class DataProcess {

    private Connection conn;
    private PreparedStatement prst;
    private ResultSet rs;
    private Statement st;

    public DataProcess() {
        conn = getConnection();
    }

    public Connection getConnection() {
        conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=WEB";
            String user = "sa";
            String pass = "191020";
            try {
                conn = DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public boolean CheckLogin(String user, String pass) {
        int count = 0;
        String sql = "SELECT * FROM tblAccount WHERE _user=? and _pass=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, user);
            prst.setString(2, pass);
            rs = prst.executeQuery();
            while (rs.next()) {
                count++;
            }
            if (count == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<Account> getAcData() {
        ArrayList<Account> accounts = new ArrayList<Account>();
        String sql = "SELECT * FROM tblAccount";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Account ac = new Account();
                ac.setUser(rs.getString(1));
                ac.setPass(rs.getString(2));
                accounts.add(ac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accounts;
    }

    public List<Course> getCourseList() {
        String sql = "SELECT * FROM tblCourse";
        List<Course> list = new ArrayList();
        try {
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            while (rs.next()) {
                Course c = new Course();
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setLocation(rs.getString(7));
                c.setDes(rs.getString(9));
                list.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Course> getAllCourseList(String id) {
        String sql = "SELECT * FROM tblCourse WHERE _courId=?";
        Course c = null;
        List<Course> list = new ArrayList();
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            rs = prst.executeQuery();
            while (rs.next()) {
                c = new Course();
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setStart(rs.getString(3));
                c.setEnd(rs.getString(4));
                c.setFee(rs.getString(5));
                c.setCont(rs.getString(6));
                c.setLocation(rs.getString(7));
                c.setTopic(rs.getString(8));
                c.setDes(rs.getString(9));
                list.add(c);
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean addCourse(String id, String name, String start, String end,
            String fee, String cont, String location, String topic, String des) {
        int result = 0;
        String sql = "INSERT INTO tblCourse VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            prst.setString(2, name);
            prst.setString(3, start);
            prst.setString(4, end);
            prst.setString(5, fee);
            prst.setString(6, cont);
            prst.setString(7, location);
            prst.setString(8, topic);
            prst.setString(9, des);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean addTopic(String topId, String topName, String topDes, String assigned, String status) {
        int result = 0;
        String sql = "INSERT INTO tblTopic VALUES(?,?,?,?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, topId);
            prst.setString(2, topName);
            prst.setString(3, topDes);
            prst.setString(4, assigned);
            prst.setString(5, status);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean addCate(String cateId, String cateName, String cateDes) {
        int result = 0;
        String sql = "INSERT INTO tblCategory VALUES(?,?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, cateId);
            prst.setString(2, cateName);
            prst.setString(3, cateDes);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
//    public static void main(String[] args) {
//        DataProcess dt = new DataProcess();
//        System.out.println(dt.addTopic("T06", "Ruby", "Hello ruby"));
//    }
}

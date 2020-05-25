/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Category;
import Entity.Course;
import Entity.Topic;
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
public class UpdateProcess {

    private Connection conn;
    private PreparedStatement prst;
    private ResultSet rs;
    private Statement st;

    public UpdateProcess() {
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

    public boolean editCourse(String id, String name, String des, String end, String start, String fee, String cont, String location, String topic) {
        int result = 0;
        String sql = "UPDATE tblCourse  SET _courName=?, _courStart=?, _courEnd=?, _courFee=?, _courCont=?, _location=?, _topId=?, _courDes=? WHERE _courId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, name);
            prst.setString(2, start);
            prst.setString(3, end);
            prst.setString(4, fee);
            prst.setString(5, cont);
            prst.setString(6, location);
            prst.setString(7, topic);
            prst.setString(8, des);
            prst.setString(9, id);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public Course getById(String id) {
        Course c = null;
        String sql = "SELECT * FROM tblCourse WHERE _courId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            rs = prst.executeQuery();
            while (rs.next()) {
                c = new Course(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
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

    public Category getCateById(String id) {
        Category cate = null;
        String sql = "SELECT * FROM tblCategory WHERE _cateId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            rs = prst.executeQuery();
            while (rs.next()) {
                cate = new Category(rs.getString(1), rs.getString(2), rs.getString(3));
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cate;
    }
    
    public boolean updateCate(String cateId, String cateName, String cateDes) {
        int result = 0;
        String sql = "UPDATE tblCategory SET _cateName=?, _cateDes=? WHERE _cateId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, cateName);
            prst.setString(2, cateDes);
            prst.setString(3, cateId);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public Topic getTopById(String id) {
        Topic top = null;
        String sql = "SELECT * FROM tblTopic WHERE _topId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            rs = prst.executeQuery();
            while (rs.next()) {
                top = new Topic(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5));
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return top;
    }

    public ArrayList<Topic> getTopic() {
        ArrayList<Topic> topic = new ArrayList<>();
        String sql = "SELECT * FROM tblTopic";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Topic t = new Topic();
                t.setTopId(rs.getString(1));
                t.setTopName(rs.getString(2));
                t.setTopDes(rs.getString(3));
                t.setAssigned(rs.getString(4));
                t.setStatus(rs.getString(5));
                topic.add(t);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topic;
    }
    
    public boolean updateTopic(String topId, String topName, String topDes, String assigned, String status) {
        int result = 0;
        String sql = "UPDATE tblTopic SET _topName=?, _topDes=?, _date=?, _status=? WHERE _topId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, topName);
            prst.setString(2, topDes);
            prst.setString(3, assigned);
            prst.setString(4, status);
            prst.setString(5, topId);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    public ArrayList<Category> getCategory() {
        ArrayList<Category> cate = new ArrayList<>();
        String sql = "SELECT * FROM tblCategory";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Category c = new Category();
                c.setCateId(rs.getString(1));
                c.setCateName(rs.getString(2));
                c.setCateDes(rs.getString(3));
                cate.add(c);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cate;
    }
    
    public ArrayList<Category> getCategory2(String id) {
        ArrayList<Category> cate2 = new ArrayList<>();
        String sql = "SELECT * FROM tblCategory WHERE _cateId=?";
        try {
            prst =conn.prepareStatement(sql);
            prst.setString(1, id);
            rs = prst.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setCateId(rs.getString(1));
                c.setCateName(rs.getString(2));
                c.setCateDes(rs.getString(3));
                cate2.add(c);
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cate2;
    }
}

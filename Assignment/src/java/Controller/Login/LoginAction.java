/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Login;

import Entity.Course;
import Model.DataProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author luuka
 */
public class LoginAction extends ActionSupport {

    private String user;
    private String pass;
    private List<Course> list;

    public LoginAction(String user, String pass, List<Course> list) {
        this.user = user;
        this.pass = pass;
        this.list = list;
    }
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<Course> getList() {
        return list;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }    

    public LoginAction() {
    }

    public String execute() throws Exception {
        DataProcess dp = new DataProcess();
        if (dp.CheckLogin(user, pass)) {
            list = dp.getCourseList();
            return "success";
        }
        return "fail";
    }

}

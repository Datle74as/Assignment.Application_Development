/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.View;

import Entity.Course;
import Model.DataProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author luuka
 */
public class ViewCourseAction extends ActionSupport {
    private List<Course> list;
    public ViewCourseAction() {
        
    }

    public List<Course> getList() {
        return list;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }
    
    
    public String execute() throws Exception {
        DataProcess dp = new DataProcess();
        list = dp.getCourseList();
        return "success";
    }
    
}

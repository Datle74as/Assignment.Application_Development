/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Delete;

import Entity.Course;
import Model.DataProcess;
import Model.DeleteProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author luuka
 */
public class DeleteCourseAction extends ActionSupport {

    private String id;
    private String name;
    private String sDate;
    private String eDate;
    private String fee;
    private String cont;
    private String location;
    private String topic;
    private String des;
    private List<Course> list;

    public DeleteCourseAction(String id, String name, String sDate, String eDate, String fee, String cont, String location, String topic, String des, List<Course> list) {
        this.id = id;
        this.name = name;
        this.sDate = sDate;
        this.eDate = eDate;
        this.fee = fee;
        this.cont = cont;
        this.location = location;
        this.topic = topic;
        this.des = des;
        this.list = list;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public String geteDate() {
        return eDate;
    }

    public void seteDate(String eDate) {
        this.eDate = eDate;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public List<Course> getList() {
        return list;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }        
    public DeleteCourseAction() {
    }

    public String execute() throws Exception {
        DataProcess dp = new DataProcess();
        DeleteProcess delProcess = new DeleteProcess();
        if (delProcess.delCourse(id)) {
            list= dp.getCourseList();
            return "success";
        }
        return "fail";
    }

}

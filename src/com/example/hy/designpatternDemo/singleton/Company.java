package com.example.hy.designpatternDemo.singleton;


import java.util.ArrayList;
import java.util.List;

/**
 * 公司类
 * Created by 陈健宇 at 2018/10/1
 */
public class Company {

    private List<Staff> staffs = new ArrayList<>();

    public void addStaff(Staff staff){
        this.staffs.add(staff);
    }

    public void showStaffs(){
        for(Staff staff : staffs){
            System.out.println("showStaffs: " + staff.toString());
        }
    }

}

package com.example.hy.designpatternDemo.singleton;

/**
 * Created by 陈健宇 at 2018/10/1
 */
public class Test {

    public static void main(String[] args){
        //创建一个公司
        Company company = new Company();
        //创建CEO
        Staff ceo1 = CEO1.getInstance();
        Staff ceo2 = CEO1.getInstance();
        //创建员工
        Staff staff1 = new Employee();
        Staff staff2 = new Employee();
        Staff staff3 = new Employee();
        //进入公司
        company.addStaff(ceo1);
        company.addStaff(ceo2);
        company.addStaff(staff1);
        company.addStaff(staff2);
        company.addStaff(staff3);
        //show staffs
        company.showStaffs();
    }

}

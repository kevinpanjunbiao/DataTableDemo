package com.pjb.model;

import com.pjb.model.DataTable.DtSentParam;

/**
 * 用户信息参数类
 * @author pan_junbiao
 **/
public class UserParam extends DtSentParam
{
    private String userName; //用户名称
    private int sex; //性别（1：男；2：女；）
    private String departmentName; //部门名称
    private String orderBy; //排序

    //省略getter与setter方法...

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public String getOrderBy()
    {
        return orderBy;
    }

    public void setOrderBy(String orderBy)
    {
        this.orderBy = orderBy;
    }
}
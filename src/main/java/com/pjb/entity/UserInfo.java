package com.pjb.entity;

/**
 * 用户信息的持久化类
 * @author pan_junbiao
 **/
public class UserInfo
{
    private int userId; //用户编号
    private String userName; //用户名称
    private int sex; //性别（1：男；2：女；）
    private String departmentName; //部门名称
    private String blogRemark; //博客信息

    //省略getter与setter方法...

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

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

    public String getBlogRemark()
    {
        return blogRemark;
    }

    public void setBlogRemark(String blogRemark)
    {
        this.blogRemark = blogRemark;
    }
}
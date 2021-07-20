package com.pjb.controller;

import com.pjb.entity.UserInfo;
import com.pjb.mapper.UserMapper;
import com.pjb.model.DataTable.DtReturnData;
import com.pjb.model.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户信息控制器
 * @author pan_junbiao
 **/
@Controller
@RequestMapping("user")
public class UserController
{
    @Autowired
    private UserMapper userMapper;

    /**
     * 分页查询员工列表
     */
    @ResponseBody
    @RequestMapping("/searchUserPage")
    public DtReturnData<UserInfo> searchUserPage(UserParam param)
    {
        DtReturnData<UserInfo> dtReturnData = new DtReturnData<UserInfo>();

        //分页查询员工列表
        List<UserInfo> userList = userMapper.searchUserList(param);

        //查询员工列表总数
        int total = userMapper.searchUserCount(param);

        //封装成DataTable所需的数据类型
        dtReturnData.setDraw(param.getDraw());
        dtReturnData.setData(userList);
        dtReturnData.setRecordsTotal(total);
        dtReturnData.setRecordsFiltered(total);

        //返回结果
        return dtReturnData;
    }

    /**
     * 用户列表页面
     */
    @RequestMapping("/toUserList")
    public String toUserList()
    {
        return "user-list.html";
    }
}

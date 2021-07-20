package com.pjb.mapper;

import com.pjb.entity.UserInfo;
import com.pjb.model.UserParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户信息Mapper动态代理接口
 * @author pan_junbiao
 **/
@Mapper
@Repository
public interface UserMapper
{
    /**
     * 分页查询员工列表
     */
    @SelectProvider(type = UserSqlBuilder.class, method = "searchUserList")
    public List<UserInfo> searchUserList(UserParam userParam);

    /**
     * 查询员工列表总数
     */
    @SelectProvider(type = UserSqlBuilder.class, method = "searchUserCount")
    public int searchUserCount(UserParam param);

    //建议将SQL Builder以映射器接口内部类的形式进行定义
    public class UserSqlBuilder
    {
        /**
         * 分页查询员工列表
         */
        public String searchUserList(UserParam param)
        {
            StringBuffer sql = new StringBuffer("SELECT * FROM tb_user WHERE 1=1");

            //用户名称
            if(param.getUserName()!=null && param.getUserName().length()>0)
            {
                sql.append(" AND user_name LIKE '%${userName}%'");
            }

            //性别（1：男；2：女；）
            if(param.getSex()>0)
            {
                sql.append(" AND sex = #{sex}");
            }

            //部门名称
            if(param.getDepartmentName()!=null && param.getDepartmentName().length()>0)
            {
                sql.append(" AND department_name = #{departmentName}");
            }

            //排序信息
            if(param.getOrderBy()!=null && param.getOrderBy().length()>0)
            {
                sql.append(" ORDER BY #{orderBy}");
            }

            //分页信息
            sql.append(" LIMIT #{start}, #{length}");

            return sql.toString();
        }

        /**
         * 查询员工列表总数
         */
        public String searchUserCount(UserParam param)
        {
            StringBuffer sql = new StringBuffer("SELECT COUNT(1) FROM tb_user WHERE 1=1");

            //用户名称
            if(param.getUserName()!=null && param.getUserName().length()>0)
            {
                sql.append(" AND user_name LIKE '%${userName}%'");
            }

            //性别（1：男；2：女；）
            if(param.getSex()>0)
            {
                sql.append(" AND sex = #{sex}");
            }

            //部门名称
            if(param.getDepartmentName()!=null && param.getDepartmentName().length()>0)
            {
                sql.append(" AND department_name = #{departmentName}");
            }

            return sql.toString();
        }
    }
}

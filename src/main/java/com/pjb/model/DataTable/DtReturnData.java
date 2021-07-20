package com.pjb.model.DataTable;

import java.util.List;

/**
 * DataTables接收服务器返回的数据类
 * @author pan_junbiao
 **/
public class DtReturnData<T>
{
    /**
     * 必要。上面提到了，Datatables发送的draw是多少那么服务器就返回多少。
     * 这里注意，出于安全的考虑，强烈要求把这个转换为整形，即数字后再返回，而不是纯粹的接受然后返回，
     * 这是 为了防止跨站脚本（XSS）攻击。
     */
    private int draw;

    /**
     * 必要。即没有过滤的记录数（数据库里总共记录数）
     */
    private int recordsTotal;

    /**
     * 必要。过滤后的记录数（如果有接收到前台的过滤条件，则返回的是过滤后的记录数）
     */
    private int recordsFiltered;

    /**
     * 必要。表中中需要显示的数据。
     */
    private List<T> data;

    //省略getter与setter方法...

    public int getDraw()
    {
        return draw;
    }

    public void setDraw(int draw)
    {
        this.draw = draw;
    }

    public int getRecordsTotal()
    {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal)
    {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered()
    {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered)
    {
        this.recordsFiltered = recordsFiltered;
    }

    public List<T> getData()
    {
        return data;
    }

    public void setData(List<T> data)
    {
        this.data = data;
    }
}

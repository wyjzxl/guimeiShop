package cn.com.guimei.dao;

import cn.com.guimei.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {
    int getTotalRecode();

    List<Customer> queryAll(@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize);
}

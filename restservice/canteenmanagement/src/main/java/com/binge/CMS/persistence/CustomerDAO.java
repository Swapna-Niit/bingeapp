package com.binge.CMS.persistence;

import java.util.Date;
import java.util.List;

import com.binge.CMS.model.Customer;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface CustomerDAO {

    @SqlQuery("select * from Customer")
    @Mapper(CustomerMapper.class)
    List<Customer> showCustomers();

    @SqlQuery("select * from Customer where CUS_ID = : pcusid")
    @Mapper(CustomerMapper.class)
    Customer showCustomerById(@Bind("pcusid") String cusid);

    @SqlQuery("select * from Customer where CUS_EMAIL = :pcusemail and CURR_PASS = :pcuspwd")
    @Mapper(CustomerMapper.class)
    Customer customerLogin(@Bind("pcusemail") String cusemail,@Bind("pcuspwd") String cuspwd);

    @SqlUpdate("insert into customer (CUS_NAME,CUS_PHONE,CUS_DOB,CUS_ADDR,CUS_EMAIL,CURR_PASS,CUS_WALLET) values (:pcusname,:pcusphno,:pcusdob,:pcusaddr,:pcusemail,:pcurrpass,:pcuswallet)")
    int registerNewCustomer(@Bind("pcusname") String cusname,@Bind("pcusphno") Long cusphno,@Bind("pcusdob") Date cusdob,@Bind("pcusaddr") String cusaddr,@Bind("pcusemail") String cusemail,@Bind("pcurrpass") String currpass,@Bind("pcuswallet") float cuswallet); 

    @SqlUpdate("update Customer set CURR_PASS = (:pcpass) WHERE CUS_ID = (:pcusid)")
    int updateCustomer(@Bind("pcuspass") String cuspass,
    @Bind("pcusid") int cusid);

    @SqlUpdate("delete from Customer WHERE CUS_ID = (:pcusid)")
    int deleteCustomer(@Bind("pcusid") int cusid);
    
}

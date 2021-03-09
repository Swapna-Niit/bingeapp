package com.binge.CMS.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.binge.CMS.model.Customer;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class CustomerMapper implements ResultSetMapper<Customer> {

    public Customer map(final int idx,final ResultSet rs, final StatementContext cxt) throws SQLException {
        return new Customer(rs.getInt("CUS_ID"),
        rs.getString("CUS_NAME"),
        rs.getLong("CUS_PHONE"),
        rs.getDate("CUS_DOB"),
        rs.getString("CUS_ADDR"),
        rs.getString("CUS_EMAIL"),
        rs.getString("CURR_PASS"),
        rs.getFloat("CURR_AMT"));
    }
    
}

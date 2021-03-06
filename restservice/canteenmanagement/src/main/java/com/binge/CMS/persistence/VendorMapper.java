package com.binge.CMS.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.binge.CMS.model.Vendor;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * VendorMapper class used to fetch vendor data from database.
 * @author hexware
 */
public class VendorMapper implements ResultSetMapper<Vendor> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Vendor map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Vendor
       */
    return new Vendor(rs.getInt("VEN_ID"), rs.getString("VEN_NAME"), rs.getString("VEN_PASS"),
        rs.getFloat("VEN_WALLET"), rs.getInt("CUS_ID"), rs.getString("VEN_STATUS"));
  }
}

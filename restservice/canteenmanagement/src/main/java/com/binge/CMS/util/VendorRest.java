package com.binge.CMS.util;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.binge.CMS.factory.VendorFactory;
import com.binge.CMS.model.Vendor;

@Path("/vendor")
public class VendorRest {

    @GET //retrieve the resources from the server
    @Produces(MediaType.APPLICATION_JSON) //type of the output
    public final Vendor[] listVendor() {
        final Vendor[] vendorList = VendorFactory.showVendors();
        return vendorList;
    }        
    
}

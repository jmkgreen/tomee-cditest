package com.github.jmkgreen.tomee;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.ws.WebServiceContext;

/**
 * Created with IntelliJ IDEA.
 * User: jamesgreen
 * Date: 23/02/2013
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
@RequestScoped
// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class Person {

//    @Resource
//    private WebServiceContext context;
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
//        if (context == null) {
//            return "No WebServiceContext found";
//        }

        return "Hello World";
    }
}
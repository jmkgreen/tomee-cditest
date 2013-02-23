package com.github.jmkgreen.tomee;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService(portName = "Person", serviceName = "Person", targetNamespace = "http://www.github.com/jmkgreen/tomee/cdi")
public class PersonSoap {

    @WebMethod
    public String hello() {
        return "Hello";
    }

}

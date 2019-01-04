
package com.server.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BaseicQuery", targetNamespace = "http://service.server.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BaseicQuery {


    /**
     * 
     * @param queryCondition
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryPeopleInfo", targetNamespace = "http://service.server.com/", className = "com.server.service.QueryPeopleInfo")
    @ResponseWrapper(localName = "queryPeopleInfoResponse", targetNamespace = "http://service.server.com/", className = "com.server.service.QueryPeopleInfoResponse")
    public String queryPeopleInfo(
        @WebParam(name = "queryCondition", targetNamespace = "")
        String queryCondition);

}
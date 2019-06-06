//package com.augo.base.controller;
//
//import com.augo.base.dto.UserDto;
//import com.augo.base.interfaces.DemoService;
//import org.apache.dubbo.rpc.protocol.rest.support.ContentType;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.MediaType;
//
///**
// * @author machunlin
// * @date 2019/6/6
// */
//@Path("demo")
//@Consumes({MediaType.TEXT_PLAIN})
//@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
////@Service
////@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML, MediaType.TEXT_PLAIN})
//
//public class DemoController {
//    @Autowired
//    private DemoService demoService;
//
//    @GET
//    @Path("hello/{name}")
//    public UserDto hello(@PathParam("name") String name, @Context HttpServletRequest request) {
//        System.out.println("Client address is " + request.getRemoteAddr());
//        return demoService.sayHello(name);
//    }
//
//    @GET
//    @Path("haha")
//    public String haha() {
//        return "hahahah";
//    }
//}

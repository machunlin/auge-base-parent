package com.augo.base.service;

import com.augo.base.dto.UserDto;
import com.augo.base.interfaces.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.protocol.rest.support.ContentType;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Size;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * @author machunlin
 * @date 2019/6/6
 */
@Service//(protocol = {"rest"}, validation = "true")
@Path("demo")
public class DemoServiceImpl implements DemoService {
    @Override
    @GET
    @Path("hello/{name}")
//    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML, MediaType.TEXT_PLAIN})
    @Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
    @Transactional(rollbackFor = Exception.class, timeout = 5000)
    public UserDto sayHello(@Size(min = 3, max = 20) @PathParam("name") String name) {
        return new UserDto().setName(name).setAge(22);
    }

    @POST
    @Path("haha")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({ContentType.APPLICATION_JSON_UTF_8})
    public UserDto haha(UserDto userDto,@Context HttpServletRequest request) {
        System.out.println("Client address from @Context injection: " + (request != null ? request.getRemoteAddr() : ""));
        return userDto;
    }
}

package com.auge.base.api;

import com.auge.base.dto.UserDto;
import org.apache.dubbo.rpc.protocol.rest.support.ContentType;

import javax.validation.constraints.Size;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author machunlin
 * @date 2019/6/6
 */
@Path("demo")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
public interface DemoService {
    @GET
    @Path("hello/{name}")
    UserDto sayHello(@Size(min = 3, max = 20) @PathParam("name") String name);

    @POST
    @Path("haha")
    UserDto haha(UserDto userDto);


    @GET
    @Path("test")
    @Consumes({MediaType.TEXT_PLAIN})
    @Produces({ContentType.TEXT_PLAIN_UTF_8})
    String test(@QueryParam("name") String name);
}

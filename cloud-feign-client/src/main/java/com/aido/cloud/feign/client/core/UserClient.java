package com.aido.cloud.feign.client.core;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: UserClient  
 * (TODO:简述该类作用)
 * @author DOUBLE
 * @version
 */
@FeignClient(name = "cloud-service")
public interface UserClient {

    @RequestMapping(value = "/user")
    String username();

    @GetMapping(value = "/user/error")
    String error();

    @GetMapping(value = "/user/error2")
    String error2();
}

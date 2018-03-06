package cloud.feign.client.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: FeignController  
 * (TODO:简述该类作用)
 * @author DOUBLE
 * @version
 */
@RestController
@RequestMapping(value = "feign")
public class FeignController {

    @Autowired
    private UserClient userClient;

    @GetMapping(value = "test")
    public String test(){
        return "test";
    }

    @GetMapping(value = "user")
    public String user(){
        return userClient.username();
    }

    @GetMapping(value = "error")
    public String error(){
        return userClient.error();
    }

    @GetMapping(value = "error2")
    public String error2(){
        return userClient.error2();
    }

}

package cloud.sleuth.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: TestController  
 * (TODO:简述该类作用)
 * @author DOUBLE
 * @version
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping
    public String index(){
        return "sleuth-service-test";
    }

}

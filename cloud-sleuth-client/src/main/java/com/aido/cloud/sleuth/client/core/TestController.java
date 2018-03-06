package com.aido.cloud.sleuth.client.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import rx.Single;

/**
 * ClassName: TestController  
 * (TODO:简述该类作用)
 * @author DOUBLE
 * @version
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String index(){
        logger.info("-----------start-------------");
        return restTemplate.getForObject("http://localhost:9121/test",String.class);
    }

    @GetMapping(value = "single")
    public Single<String> stringSingle(){
        return Single.just("single value");
    }
}

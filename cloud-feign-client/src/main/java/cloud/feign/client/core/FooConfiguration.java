package cloud.feign.client.core;

import com.alibaba.fastjson.JSON;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * ClassName: FooConfiguration  
 * (TODO:简述该类作用)
 * @author DOUBLE
 * @version
 */
@Configuration
public class FooConfiguration {

    @Bean
    public ErrorDecoder errorDecoder(){
        return new ErrorDecoder() {
            public Exception decode(String s, Response response) {
                if(response.status()==500){

                }
                String body = "";
                try {
                    BufferedReader bufferedReader = new BufferedReader(response.body().asReader());
                    StringBuffer buffer=new StringBuffer();
                    String line = "";
                    while ( (line= bufferedReader.readLine()) != null){
                        buffer.append(line);
                    }
                    body = buffer.toString();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(!StringUtils.isBlank(body)){
                    try{
                        ResponseError responseError = JSON.parseObject(body,ResponseError.class);
                        throw new RuntimeException(responseError.getMessage());
                    }catch (Exception e){
                        throw new RuntimeException(body);
                    }
                }
                throw new RuntimeException("s");
            }
        };
    }

}

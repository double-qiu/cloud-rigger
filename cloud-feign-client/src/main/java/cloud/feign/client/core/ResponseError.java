package cloud.feign.client.core;

/**
 * ClassName: ResponseError  
 * (TODO:简述该类作用)
 * @author DOUBLE
 * @version
 */
public class ResponseError {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

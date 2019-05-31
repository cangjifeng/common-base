package org.jerfan.common.base.response;

import org.jerfan.common.base.CommonVO;

import java.util.List;

/**
 * Description：here you can write some desc info
 * Author: 仓纪峰
 * Date:2019/5/31
 * Time:11:35
 */
public class ResponseVO<T> extends CommonVO {

    /**
     * code '00000' means success
     */
    private String code;

    private String message;

    private List<String> errorList;

    private T data;

    private Throwable throwable;


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

    public List<String> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    public ResponseVO() {
    }

    public ResponseVO(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseVO(String requestId,String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.requestId = requestId;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVO{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", errorList=" + errorList +
                ", data=" + data +
                ", throwable=" + throwable +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}

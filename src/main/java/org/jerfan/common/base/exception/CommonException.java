package org.jerfan.common.base.exception;

/**
 * Description：here you can write some desc info
 * Author: 仓纪峰
 * Date:2019/5/31
 * Time:13:28
 */
public class CommonException extends RuntimeException {

    private String code;

    private String message;

    private Throwable e;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getE() {
        return e;
    }

    public void setE(Throwable e) {
        this.e = e;
    }

    public CommonException(){

    }


}

package org.jerfan.common.base.enums;

/**
 * Description：here you can write some desc info
 * Author: 仓纪峰
 * Date:2019/5/31
 * Time:11:37
 */
public enum ResultEnum {

     ENUM_SUCCESS("00000","success"),
     PARAM_IS_NULL("00001","request param is null"),
     HAD_RECEIVED_REQUEST("00002","had received request info"),
     HAD_RECEIVED_REQUEST_BUT_HANDLE_FAIL("00003","had received request info , but fail to handle it"),




     ENUM_FAIL("-1","fail");


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

    ResultEnum(String code,String message){
        this.code=code;
        this.message=message;
    }
}

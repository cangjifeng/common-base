package org.jerfan.common.base;

/**
 * Description：CommonVo is top level ,
 * all the child class that may be request or response need to extends CommonVo
 * Author: 仓纪峰
 * Date:2019/5/31
 * Time:11:27
 */
public class CommonVO {

    /**
     * request id  that means who submit this request
     */
    protected String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}

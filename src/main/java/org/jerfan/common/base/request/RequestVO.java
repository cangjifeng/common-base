package org.jerfan.common.base.request;

import org.jerfan.common.base.CommonVO;

/**
 * Description：RequestVo  extends CommonVo and sport T type
 * Author: 仓纪峰
 * Date:2019/5/31
 * Time:11:26
 */
public class RequestVO<T> extends CommonVO {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "RequestVO{" +
                "data=" + data +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}

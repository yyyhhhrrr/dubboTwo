package com.yhr.dubbo.two.server.request;/**
 * Created by Administrator on 2019/1/20.
 */

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author:debug (SteadyJack)
 * @Date: 2019/1/20 17:22
 **/
@Data
@ToString
public class RecordPushRequest implements Serializable{

//    private Integer itemId;
//
//    private Integer itemTotal;
//
//    private String customerName;


    //商品id
    private Integer itemId;

    //下单数量
    private Integer total;

    //客户姓名
    private String customerName;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
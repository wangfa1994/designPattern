package com.wf.charpter04.book.idcard;

import com.wf.charpter04.book.framework.Product;

/**
 * @Author: wangfa
 * @Date: 2019/10/9 19:15
 * @Description: 实现了use方法的类
 *
 * IDCard是产品Product类的子类
 */
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("制作"+owner+"的ID卡。");
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }




    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡");
    }
}

package com.wf.charpter09.bjsxt;

/**
 * @Author: wangfa
 * @Date: 2019/5/12 15:53
 * @Description:   桥接模式 -bridge
 *
 *
 * 电脑    类型        品牌
 *    | --台式机
 *             | -- 联想台式机
 *             | -- 神舟台式机
 *             | -- 戴尔台式机
 *    |
 *    | --笔记本
 *             | -- 联想笔记本
 *             | -- 神舟笔记本
 *             | -- 戴尔笔记本
 *    |
 *    | -- 平板
 *             | -- 联想平板
 *             | -- 神舟平板
 *             | -- 戴尔平板
 *
 *
 *
 * 扩展性问题(类个数膨胀)：
 * 如果要增加一个新的电脑类型，则要增加各个品牌下的类
 * 如果要增加一个新的电脑品牌，则需要增加各个电脑类型
 *
 * 违反了单一职责 一个类联想笔记本，有两个引起这个类的变化的原因
 *
 *
 *
 *
 * 桥接模式：处理多层次继承结构，处理多维度变换的场景，将各个维度(类型维度和品牌维度)设计成独立的继承结构，
 * 使各个维度可以独立的扩展，在抽象层建立关联(可以代替多重继承)
 *
 *
 * 桥接模式可以取代多层继承关系，多层继承违背了单一职责原则，复用性较差，类的个数也是很多，桥接模式可以大大
 * 减少子类的个数，从而降低管理和维护的成本。
 *
 * 桥接模式极大的提高了系统的可扩展性，在至少两个维度中任意扩展一个维度，都不需要修改原有的系统，符合开闭原则。
 *
 *
 * 场景：
 *  JDBC 驱动程序
 *  OA系统消息类型处理：
 *      业务类型： 普通消息，加急消息，特急消息
 *      消息方式： 系统内消息，手机短信，邮件
 *
 *
 */
public class Client {


    public static void main(String[] args) {


        Computer computer = new Desktop(new DellBrand());
        computer.sale();
    }
}


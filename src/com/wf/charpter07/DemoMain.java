package com.wf.charpter07;

/**
 * @Author: wangfa
 * @Date: 2019/4/21 15:14
 * @Description: 生成实例---->Builder模式(组装复杂的实例)
 *
 *
 */
public class DemoMain {

    /**
     *Builder模式角色
     *
     * Builder(建造者)
     * Builder角色负责定义用于生成实例接口(API),Builder角色中准备了用于生成实例的方法。
     * 示例中的Builder类扮演此角色。
     *
     * ConcreteBuilder(具体的建造者)
     * ConcreteBuilder角色是负责实现Builder角色的接口的类(API)。这里定义了在生成实例时实际被调用的方法，
     * 此外，在ConcreteBuilder角色中还定义了获取最终生成结果的方法。
     * 示例中的TextBuilder和HTMLBuilder类扮演此角色
     *
     * Director(监工)
     * Director角色负责使用Builder角色的接口(API)来生成实例，他并不依赖于ConcreteBuilder角色,
     * 为了确保不论ConcreteBuilder角色是如何被定义的，Director角色都能正常工作，它只调用在Builder角色中被定义的方法。
     * 示例中的Director类扮演此角色。
     *
     *
     * Client(使用者)
     * 该角色使用了Builder模式，(Builder模式并不包含Client角色)。
     * 示例中的Main类扮演此角色
     */


}

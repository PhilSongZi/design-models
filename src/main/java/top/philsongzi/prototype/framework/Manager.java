package top.philsongzi.prototype.framework;

import java.util.HashMap;

/**
 * @author 小子松
 * @since 2023/7/4
 */
public class Manager {

    // 保存实例的“名字”和“实例”之间的对应关系
    private HashMap showcase = new HashMap();
    // register方法将接收到的一组“名字”和“Product接口”注册到showcase中
    public void register(String name, Product proto){
        showcase.put(name, proto);
    }
    // create方法根据接收到的“名字”从showcase中复制出对应实例并返回
    public Product create(String protoname){
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}

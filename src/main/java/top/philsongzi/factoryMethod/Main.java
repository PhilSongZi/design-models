package top.philsongzi.factoryMethod;

import top.philsongzi.factoryMethod.framework.Factory;
import top.philsongzi.factoryMethod.framework.Product;
import top.philsongzi.factoryMethod.idcard.IdCardFactory;

/**
 * @author 小子松
 * @version 1.0
 * @description 主类，测试行为是否符合预期。
 * @since 2023/6/1
 */
public class Main {

    public static void main(String[] args) {
        // 创建工厂
        Factory factory = new IdCardFactory();
        // 车卡。
        Product card1 = factory.create("张三");
        Product card2 = factory.create("李四");
        Product card3 = factory.create("王五");
        // 撕卡（bushi
        card1.use();
        card2.use();
        card3.use();
    }
}

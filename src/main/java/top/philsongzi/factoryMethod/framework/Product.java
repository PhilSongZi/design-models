package top.philsongzi.factoryMethod.framework;

/**
 * @author 小子松
 * @version 1.0
 * @description 表示“产品”的类。声明抽象方法，实现交给子类。
 * @since 2023/6/1
 */
public abstract class Product {

    // 定义产品是任何可以“use”的东西
    public abstract void use();
}

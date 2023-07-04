package top.philsongzi.prototype.framework;

/**
 * @author 小子松
 * @since 2023/7/4
 */
public interface Product extends Cloneable{

    // 使用,但是具体实现交给子类
    public abstract void use(String s);
    // 创建实例
    public abstract Product createClone();
}

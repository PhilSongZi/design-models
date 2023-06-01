package top.philsongzi.factoryMethod.framework;

/**
 * @author 小子松
 * @version 1.0
 * @description 模板类，定义了“工厂”是调用“create方法生成product实例”的。
 * @since 2023/6/1
 */
public abstract class Factory {

    // 生产产品、注册产品
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product p);

    // 工厂的流程：先生产再注册，最后返回产品
    public final Product create(String owners) {
        Product p = createProduct(owners);
        registerProduct(p);
        return p;
    }
}

package top.philsongzi.singleton;

/**
 * @author 小子松
 * @since 2023/6/9
 */
public class Singleton {
    /**
     * 只存在一个实例的类。
     */
    // 初始化静态成员变量 singleton 只在类加载时进行一次
    private static Singleton singleton = new Singleton();
    private Singleton() {       // 构造为 private 确保不会被外部调用生成新实例
        System.out.println("生成一个实例。。。");
    }
    // getInstance() 通常命名方式。
    public static Singleton getInstance() {
        return singleton;
    }
}

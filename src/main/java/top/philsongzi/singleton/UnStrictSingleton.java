package top.philsongzi.singleton;

/**
 * @author 小子松
 * @since 2023/6/9
 */
public class UnStrictSingleton {

    private static UnStrictSingleton unStrictSingleton = null;
    private UnStrictSingleton() {       // 构造为 private 确保不会被外部调用生成新实例
        System.out.println("生成一个实例。。。");
    }
    // 先建对象赋空值，再 new 一个对象赋值给它，这样在多线程下是会出问题的
//    public static synchronized UnStrictSingleton getInstance() {
    public static UnStrictSingleton getInstance() {
        // unStrictSingleton == null 这个判断条件是线程不安全的
        // 因为，此处判断之后 执行 new 赋值，但在赋值之前可能别的线程会对 unStrictSingleton == null 进行判断。
        // 所以，方法必须加上 synchronized
        if(unStrictSingleton == null) {
            unStrictSingleton = new UnStrictSingleton();
        }
        return unStrictSingleton;
    }
}

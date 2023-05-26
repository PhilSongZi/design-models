package top.philsongzi.templateMethod;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/26
 * @description 只实现了display方法的抽象类。
 */
public abstract class AbstractDisplay {

    // 三个抽象方法，打开/关闭/打印，皆交给子类实现
    public abstract void open();
    public abstract void close();
    public abstract void print();
    // 实现了display方法，注意这个final修饰！不希望更改此方法
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}

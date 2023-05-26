package top.philsongzi.templateMethod;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/26
 * @description AbstractDisplay抽象类的实现类，重复打印字符 ch.
 */
public class CharDisplay extends AbstractDisplay{
    /**
     * 字段： char ch
     * 方法： 有参构造，抽象类方法的实现。
     */

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }
}

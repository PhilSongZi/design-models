package top.philsongzi.adapter.inherit;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/16 18:17
 * @description 通过适配器PrintBanner 弱化或强调显示 hello world.
 */
public class Main {

    public static void main(String[] args) {
        // 将PrintBanner类的实例保存在了 Print类型变量中。
        Print p = new PrintBanner("hello world");
        p.printWeak();
        p.printStrong();
    }
}

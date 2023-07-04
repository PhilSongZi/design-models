package top.philsongzi.prototype;

import top.philsongzi.prototype.framework.Manager;
import top.philsongzi.prototype.framework.Product;
import top.philsongzi.prototype.impl.MessageBox;
import top.philsongzi.prototype.impl.UnderlinePen;

/**
 * @author 小子松
 * @since 2023/7/4
 */
public class Main {

        public static void main(String[] args) {
            // 准备
            Manager manager = new Manager();
            UnderlinePen upen = new UnderlinePen('~');
            MessageBox mbox = new MessageBox('*');
            MessageBox sbox = new MessageBox('/');
            manager.register("strong message", upen);
            manager.register("warning box", mbox);
            manager.register("slash box", sbox);
            // 生成
            Product p1 = manager.create("strong message");
            p1.use("Hello, world.");
            Product p2 = manager.create("warning box");
            p2.use("Hello, world.");
            Product p3 = manager.create("slash box");
            p3.use("Hello, world.");
        }
}

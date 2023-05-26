package top.philsongzi.templateMethod;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/26
 * @description 主类，测试行为。
 */
public class Main {

    public static void main(String[] args) {
        // 生成类的实例
        AbstractDisplay abstractDisplay = new CharDisplay('H');
        AbstractDisplay abstractDisplay1 = new StringDisplay("hello,world.");
        // 好的，确实是大笨蛋，用自带换行的 println 来输出本该在一行呈现的内容，精彩。。。
        AbstractDisplay abstractDisplay2 = new StringDisplay("你好，小子松大笨蛋。");
        // 调用display方法
        abstractDisplay.display();
        abstractDisplay1.display();
        abstractDisplay2.display();
    }
}

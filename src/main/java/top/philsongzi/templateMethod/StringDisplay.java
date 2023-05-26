package top.philsongzi.templateMethod;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/26
 * @description
 */
public class StringDisplay extends AbstractDisplay{

    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }
    @Override
    public void open() {
        printLine();
    }

    @Override
    public void close() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }
    // 根据传入的字符串长度来控制输出首末两行的字符数量
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}

package top.philsongzi.adapter.inherit;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/1618:04
 * @description 适配器.继承了Banner类，实现了Print接口 。
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printStrong() {
        showWithAster();
    }

    @Override
    public void printWeak() {
        showWithParen();
    }
}

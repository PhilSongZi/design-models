package top.philsongzi.adapter.assign;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/1618:04
 * @description 适配器.继承了Print类，内部聚合了Banner类的实例。
 */
public class PrintBanner extends Print {

    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }
}

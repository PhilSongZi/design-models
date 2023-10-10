package top.philsongzi.builder;

/**
 * 声明编写文档的方法的抽象类。
 *
 * @author 小子松
 * @since 2023/10/9
 */
public abstract class Builder {

    // 编写标题 字符串 条目，完成文档。
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}

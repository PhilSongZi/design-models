package top.philsongzi.adapter.inherit;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/1618:04
 * @description 实际需求的print接口，包含两个方法：弱化 和 强调 字符串 显示。
 */
public interface Print {

    public abstract void printStrong();
    public abstract void printWeak();
}

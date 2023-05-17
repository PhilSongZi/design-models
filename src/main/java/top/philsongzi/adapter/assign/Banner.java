package top.philsongzi.adapter.assign;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/16 18:04
 * @description here is a description of this file.
 */
public class Banner {

    private String string;
    public Banner(String string){
        this.string = string;
    }
    public void showWithParen () {
        System.out.println("(" + string + ")");
    }
    public void showWithAster () {
        System.out.println("*" + string +  "*");
    }
}

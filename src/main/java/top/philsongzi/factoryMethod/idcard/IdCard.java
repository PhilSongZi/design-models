package top.philsongzi.factoryMethod.idcard;

import top.philsongzi.factoryMethod.framework.Product;

/**
 * @author 小子松
 * @version 1.0
 * @description 具体的产品——id卡。
 * @since 2023/6/1
 */
public class IdCard extends Product {

    private String owner;
    // 赋予编号
    private int serial;

    IdCard(String owner, int serial) {
        System.out.println("制作" + owner + "(" + serial + ")的ID卡。");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "(" + serial + ")的ID卡。");
    }

    public String getOwner() {
        return this.owner;
    }

    public int getSerial() {
        return this.serial;
    }
}

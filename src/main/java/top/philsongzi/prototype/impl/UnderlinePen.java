package top.philsongzi.prototype.impl;

import top.philsongzi.prototype.framework.Product;

/**
 * @author 小子松
 * @since 2023/7/4
 */
public class UnderlinePen implements Product {

    private char ulchar;
    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for(int i = 0; i < length; i++){
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try{
            p = (Product)clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}

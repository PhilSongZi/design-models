package top.philsongzi.factoryMethod.idcard;

import top.philsongzi.factoryMethod.framework.Factory;
import top.philsongzi.factoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @description ID卡生产类。工厂类的子类，使用了TemplateMethod模式。
 * @since 2023/6/1
 */
public class IdCardFactory extends Factory {

//    private List<String> owners = new ArrayList<String>();
    // 赋予编号后的生产类
    private HashMap<Integer, String> database = new HashMap<>();
    private Integer serial = 1;

    @Override
    protected synchronized Product createProduct(String owner) {
        // 初始化编号为1，每生产一个就自增1
        return new IdCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product p) {
//        owners.add(((IdCard) p).getOwner());
        IdCard card = (IdCard) p;
        database.put(card.getSerial(), card.getOwner());
    }

//    public List<String> getOwners() {
//        return owners;
//    }

    public HashMap<Integer, String> getDatabase() {
        return database;
    }
}

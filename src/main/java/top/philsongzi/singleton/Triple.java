package top.philsongzi.singleton;

/**
 * @author 小子松
 * @since 2023/6/9
 */
public class Triple {

    // 搞个静态类型数组，直接存三个 ID 不同的实例
    // triples 字段不是实例的字段，是静态字段！其初始化只会在类生成时进行一次！
    private static Triple[] triples = new Triple[] {
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };

    private int id;
    private Triple(int id) {
        System.out.println("生成id为 " + id + " 的实例。");
        this.id = id;
    }
    public static Triple getInstance(int id) {
        return triples[id];
    }
    @Override
    public String toString() {
        return "[Triple id = " + id + "]";
    }
}

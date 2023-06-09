package top.philsongzi.singleton;

/**
 * @author 小子松
 * @since 2023/6/9
 */
public class TestTriple {

    public static void main(String[] args) {
        System.out.println("Start...");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + " : " + triple);
        }
        System.out.println("End...");
    }
}

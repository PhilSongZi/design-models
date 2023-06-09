package top.philsongzi.singleton;

/**
 * @author 小子松
 * @since 2023/6/9
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Start...");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj2 == obj1) {     // ide 已经提示了。 condition is always true。
            System.out.println("obj1 obj2 是相同的实例");
        } else {
            System.out.println("obj1 obj2 是不同的实例");
        }
        System.out.println("End...");
    }
}

package top.philsongzi.singleton;

/**
 * @author 小子松
 * @since 2023/6/9
 */
public class TestUnStrictSingleton extends Thread{

    public static void main(String[] args) {
        System.out.println("Start...");

        new TestUnStrictSingleton("A").start();
        new TestUnStrictSingleton("B").start();
        new TestUnStrictSingleton("C").start();

        System.out.println("End...");
    }

    @Override
    public void run () {
        UnStrictSingleton obj = UnStrictSingleton.getInstance();
        System.out.println(getName() + " : obj = " + obj);
    }

    public TestUnStrictSingleton(String name) {
        super(name);
    }
}

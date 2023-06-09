package top.philsongzi.singleton;

/**
 * @author 小子松
 * @since 2023/6/9
 */
public class TestTicketMaker {

    public static void main(String[] args) {
        System.out.println("Start...");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End...");
    }
}

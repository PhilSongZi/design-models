package top.philsongzi.singleton;

/**
 * @author 小子松
 * @since 2023/6/9
 */
public class TicketMaker {

    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();
    private TicketMaker() {}
    public static TicketMaker getInstance() {
        return singleton;
    }
    // synchronized 是为了多线程模式下的同步，否则可能会出现同样号码的票
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}

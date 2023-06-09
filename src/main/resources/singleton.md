## 为何引入
- 想确保任何情况下都绝对只有一个实例
- 现在程序上表现出“只存在一个实例”
## 要点
- 何时生成这个唯一的实例？——第一次调用 getInstance() 方法时，Singleton 初始化， 类初始化时， static 字段会被初始化加载一次。
- 字段 static，构造函数 private，获取实例的方法是 static。
## 相关设计模式
- AbstractFactory
- Builder
- Facade
- Prototype
## 练习
1. 在下面的 TicketMaker 类中，每次调用 getNextTicketNumber 方法都会返回1000，1001,1002...的数列。我们可以用它生成票的编号或是其他序列号。
在现在该类的实现方式下，我们可以生成多个该类的实例。请修改代码，运用 Singleton模式确保只能生成一个该类的实例。
   > public  class TicketMaker {
   private int ticket  = 1000;
   public int getNextTicketNumber () {
   return ticket++;
   }
   }
2. 请编写 Triple 类，实现最多只能生成3个 Triple 类的实例，实例编号分别为0,1,2且可以通过 getInstance(int id)来获取该编号对应的实例(在第10章中也出现了这样的类)。
3. 某位开发人员编写了如下的singleton类。但这并非严格的Singleton 模式。请问是为什么呢?

       public class Singleton {
       private static Singleton singleton = null;
       private Singleton () {
       System.out.println("生成了一个实例");
       }
       public static Singleton getInstance() {
       if(singleton == null) {
       singleton = new Singleton();
       }
       return singleton;
       }
       }
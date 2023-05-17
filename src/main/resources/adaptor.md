## adaptor 适配器设计模式
### adapter模式中的登场角色
#### Target——对象
- 定义所需的方法。
- 本例中为Print接口（使用继承），Print类（使用委派）承担。
#### Client——请求者
- 使用Target角色定义的方法进行处理。
- main类。
#### Adaptee——被适配
- Adaptee是一个持有=既定方法的角色，本例中Banner类。
- 若Adaptee角色中的方法与Target角色的方法相同，那么，也就无需Adapter角色了。。。
#### Adapter——适配
- 使用Adapter角色的方法来满足Target角色的需求。
- PrintBanner类。
- **类适配器**中，Adapter角色通过**继承**来使用Adaptee角色；**对象适配器**中，Adapter角色通过**委托**来使用Adaptee角色。
#### 类图（找到了再插入吧）
### keypoint
- 何时使用adapter模式？
- 版本升级与兼容性
- 功能完全不同的类
- 相关设计模式
  - Bridge
  - Decorator
### practice:
1. 本例中在生成PrintBanner类实例时，使用了Print类型变量来保存，即：
    > Print p = new PrintBanner("hello world");
   
    为何不用PrintBanner类型的变量来保存PrintBanner的实例呢？

   > PrintBanner p = new PrintBanner("hello world");  

    解读：为了**强调“只使用了Print接口的方法”**。因为在本例中，Print接口和PrintBanner类对外提供的方法时相同的，在很多情况下，PrintBanner类中的方法会比Print接口中的多。  
    补充：即使将实例保存在Print类型的变量中，依旧可以通过强制类型转换来调用PrintBanner类中独有的方法：
    > ((PrintBanner) p).methodWhichExistsOnlyInPrintBanner();
    
    若p中不是PrintBanner类或他的子类，那么运行时会报错，抛出异常。
    > java.lang.ClassCastException
2. 使用Adapter模式编写一个将属性集合保存至文件中的FileProperties类。

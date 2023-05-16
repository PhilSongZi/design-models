## iterator 迭代器设计模式
### 角色
#### iterator（迭代器）
- 定义**按顺序逐个遍历元素**的接口（API）
- 本例中的Iterator.
  - 定义了hasNext方法——判断是否存在下一个元素
  - 定义Next方法——获取该元素
#### ConcreteIterator（具体的迭代器）
- 实现Iterator角色所定义的接口（API）。
- 本例中的BookShelfIterator。
  - BookShelf的实例保存在bookShelf字段，
  - 被指向的书的下标保存在index字段。
#### Aggregate（集合）
- 定义创建Iterator角色的接口（API）。这个接口是一个方法，会创建出“按顺序访问保存在我内部元素的人”。
- 本例中是Aggregate，他里面定义了Iterator方法。
#### ConcreteAggregate（具体的集合）
- 负责实现Aggregate角色所定义的接口。会创建出具体的Iterator角色，即ConcreteIterator角色。
- 本例中是BookShelf，实现了Iterator方法。
### keypoint
#### 抽象类和接口
#### 理解hasNext()、Next()、last
#### 相关设计模式
- Visitor模式
- Composite模式
- Factory Method模式
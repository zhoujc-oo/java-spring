使用注解需要导入context约束，增加注解的支持

###1.bean
```java
 @Component  //等价于<bean id="user" class="com.shanzj.pojo.User"/>
 ```
属性如何注入
```java
 @Component  //等价于<bean id="user" class="com.shanzj.pojo.User"/>
 public class User {
     @Value("shanzj")    //相当于<property name="name" value="shanzj"/>
     public String name;
 }
```
###2.衍生的注解
    
- @Component 有一些衍生注解，我们在web开发中，会按照mvc三层架构分层

- dao 【@Repository】

- service 【@Service】

- controller 【@Controller】

这四个注解的功能都是一样的，都是代表将某给类注册的IOC容器中，然后装配bean

###3.自动装配

- @Autowired

- @Nullable

- @Resource 见7.4

###4.作用域

单例模式 @Scope(“singleton”)

原型模式 @Scope(“Prototype”) 见6.4bean的作用域
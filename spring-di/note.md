   1.别名

- 别名，如果添加了别名，我们也可以使用别名获取到这个对象
```xml 
<alias name="user" alias="wwwww"/>
```
   2.Bean的配置  

- id:bean 的唯一标识符，也就是相对于我们学的对象名
- class：bean 对象所对应的全限定名：包名+类名
- name：也是别名,而且name可以同时取多个别名
- (user2 u2 u3 u4 这里可以用很多东西去分割)
```xml
<bean id="user" class="com.shanzj.pojo.User" name="user2,u2 u3;u4">
      <constructor-arg name="name" value="单子健爱生活2" />
</bean>
```
   3.import
- import 一般用于团队开发使用，他可以将多个配置文件，导入合并为一个
- 假如，现在项目中有多个人开发，这三个人复制不同的类开发，不同的类需要注册在不同的bean中，
我们可以利用import将所有人的beans.xml合并为一个总的配置文件

   4.通过set方式注入
- 依赖注入：set注入！
- 依赖：bean对象的创建依赖容器
- 注入：bean对象中的所有属性，由容器来注入！




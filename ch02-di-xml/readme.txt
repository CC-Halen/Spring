使用spring：spring作为容器管理对象，开发人员从spring中获取要使用的对象

实现步骤：
1.新建maven项目

2.加入依赖，修改pom.xml
    spring-context
    junit

3.开发人员定义类：接口和实现类

4.创建spring配置文件。作用：声明对象
    把对象交给spring创建和管理
    使用<bean>表示对象声明

5.使用容器中的对象
    创建一个表示spring容器的对象，ApplicationContext
    从容器中根据名称获取对象，使用getBean("对象名称")

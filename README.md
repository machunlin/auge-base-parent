

- 需要在本地部署zookeeper(https://www.apache.org/dyn/closer.cgi/zookeeper/)，zoo.cfg的端口号为:2181

--- 

- 项目启动:运行 BaseService.java-->main()方法

- 启动成功后，访问地址测试：

HTTP GET：
http://localhost:8088/demo/test?name=hahah

HTTP POST：
http://localhost:8088/demo/haha

HTTP GET：
向user表插入数据：
http://localhost:8088/demo/add/testusername

------

- 框架：dubbo+springboot+yml,全注解配置

- 持久层: baomidou.mybatisplus , 数据库表建好后，通过mybatis-sql项目，可以自动生成实体类，XXXmapper.java, xxxMapper.xml ,service.java，
  常用的增删改查代码不用写，比较复杂的sql或者多表关联，需要手写sql。

-----

- auge-base-common项目：
   - api包是对外暴露的dubbo restful风格的api接口，可以通过http get/post访问，返回json数据。 接口地址、参数校验都在此包的接口类中定义。
   - vo包，是接口请求参数POJO类;
    - DTO是接口返回参数的POJO类。

- auge-base-service项目:
   - api包是暴露的dubbo api接口实现类，注意：此包下的 XXXServiceApi.java 类引用的是dubbo 的@Service注解（不要和spring的@servie注解搞混了）
   - service包下，是正常的业务逻辑代码，注意：此包下的XXXServiceImpl.java类引用的是spring的@Service注解。


---

- 项目编码规范：

   《阿里巴巴编码规范》 + p3c插件：
    https://github.com/alibaba/p3c

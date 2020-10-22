# spring新手教程

1. spring-configuration: 构造器注入，alias作用

2. spring-04-di: 各种属性的注入方式。依赖注入。

3. spring-05-autowired: 注解

@Autowired: 自动装配，通过类型、名字，配合`Qualifier`使用

@Resource: 自动装配，通过名字、类型

@Component: 组件，放到类上。就不用了Bean标签了。

- 衍生注解dao @Repository
- service @Service
- controller @Controller
四个注解功能意义，都代表将类注册到Spring中。
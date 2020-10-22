import com.picard.Human;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test(){
        //自动装配测试
        ApplicationContext cont = new ClassPathXmlApplicationContext("autowire.xml");
        Human human = cont.getBean("human", Human.class);
        human.getDog().shout();
        human.getCat().shout();
    }
}

import com.picard.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)context.getBean("user");
        user.show();
        //using alias
        User user2 = (User)context.getBean("user2");
        user2.show();
    }
}

import com.picard.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("bean.xml");
        Student stu = (Student) context.getBean("student");
        System.out.println(stu.toString());
    }
}

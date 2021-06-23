import com.zhoujc.automatic_assembly.People;
import org.springframework.context.ApplicationContext;
import org.junit.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");

        People people = context.getBean("people",People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}

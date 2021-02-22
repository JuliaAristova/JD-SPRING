import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

/*
we create a container
as it is xml configuration we use - ClassPathXmlApplicationContext
Spring goes to config.xml and will create objects you described there
 */
public class CybertekApp {

    public static void main(String[] args) {

        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
     // ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

      //  Mentor mentor = new FullTimeMentor();  bad way for coding
      // we need to cast

        Mentor mentor = (Mentor) container.getBean("fullTimeMentor");
        Mentor mentor1 = container.getBean("partTimeMentor", Mentor.class);

        mentor.createAccount();
        mentor1.createAccount();


    }
}

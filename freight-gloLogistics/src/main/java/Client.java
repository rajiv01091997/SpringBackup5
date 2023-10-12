import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.glo.Service.ServiceImpl;



public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		System.out.println("IOC created: " +context);
		
		
		//Freight freight_one = (Freight) context.getBean("Freight");
        ServiceImpl service=(ServiceImpl) context.getBean("service");

        
        System.out.println("All freight are:\n"+ service.getAll());
        
         ((AbstractApplicationContext)context).close();

	}

}

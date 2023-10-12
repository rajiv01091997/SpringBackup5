import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.glo.Service.*;
public class Client {

	public static void main(String[] args) {
	//ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/resources/springconfig.xml");
		
		ApplicationContext context = new FileSystemXmlApplicationContext("/home/rajiv.yadav/Music/springconfig.xml");

   FleetServiceImpl service=(FleetServiceImpl) context.getBean("service");   
   
   System.out.println("All freight are:\n"+ service.getAllFleets());
   System.out.println("Fleet with asked id is:\n"+service.getFleetById(1001));
        
       //  ((AbstractApplicationContext)context).close();

	}

}

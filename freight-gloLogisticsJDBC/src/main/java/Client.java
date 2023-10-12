import com.glo.model.Freight;
import com.glo.repository.Repository;

public class Client {

	public static void main(String[] args) {
		Repository repo=new Repository();
	
		Freight freight1=new Freight(101,"Kolkata","Ahemdabad");
		Freight freight2=new Freight(102,"Mumbai","Bangalore");
		
         
         //repo.AddFreight(freight);
		
		
         //repo.getAllFreight();
		
		
         //repo.getById(101);
		
		//repo.update(102, "Hi", "hello");
		
		//repo.delete(102);
	}

}

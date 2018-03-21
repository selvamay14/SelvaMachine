package tlleaf.Lead;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class LearnDe {
	  @Test(expectedExceptions= {RuntimeException.class,NoSuchFieldError.class},
			  successPercentage=80)
	public void createLead() {		  
		  System.out.println("createLead");
		  throw new RuntimeException();
	  }
	  @Test(enabled=false)
	  public void mergeLead() {
		  System.out.println("mergeLead");
	  }
	  @Test(alwaysRun = true,dependsOnMethods= {"leaf.Lead.LearnDe.createLead"})
	  public void editLead() {
		  System.out.println("editLead");
	  }

}

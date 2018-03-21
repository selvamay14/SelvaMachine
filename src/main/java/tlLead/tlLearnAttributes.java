package tlLead;

import org.testng.annotations.Test;

public class tlLearnAttributes {
  @Test(priority=-1)
  public void createLead() {
	  System.out.println("createLead");
  }
  @Test(priority=1)
  public void mergeLead() {
	  System.out.println("mergeLead");
  }
  @Test
  public void editLead() {
	  System.out.println("editLead");
  }
}

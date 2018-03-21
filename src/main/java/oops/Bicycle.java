package oops;

public class Bicycle {

	public void applyBrake() {

	}

	public String getColorSrini() {
		return "red";
	}
	
	/*public String getColor(String br, String whom) {
		return "red";
	}*/
	
	//Method OverLoading
	public String getColorBabu(String whom) {
		if(whom.equals("wife")) {
			return "red";			
		}else if(whom.equals("son")) {
			return "Blue";
		}else {
			return "pink";
		}

	}


}











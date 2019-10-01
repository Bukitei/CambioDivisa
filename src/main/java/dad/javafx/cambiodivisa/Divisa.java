package dad.javafx.cambiodivisa;

public class Divisa {

	public String name;
	public double change;
	
	public Divisa(String nameD, double changeD) {
		
		name = nameD;
		change = changeD;
		
	}

	public double toEuro(double cuantity) {
		return cuantity/change;
	}
	
	public double fromEuro(double cuantity) {
		return cuantity*change;
	}
}

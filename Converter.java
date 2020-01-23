package dead;

public class Converter {

		//Your names go here:
		/*
		* @Author: Cobe Reinbold
		* Desiree Leal
		* Rohit Yeast
		*/
		private double celsiusToFahrenheit(double C)
		{
		int f;
		f = (C*(9/5))+32;
		return f;
			
		return 0;
		}
		private double fahrenheitToCelsius(double F){
			return (F - 32)*5/9;
			
			
		return 0;
		}
	private double kilometersToMiles (double K){
		return K*0.621371;	
		
	}
	
	
		public static void main(String[] args) {
			celsiusToFahrenheit (13);
			fahrenheitToCelsius (30);
		}

}

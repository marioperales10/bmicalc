
public class BMICalcImpl  implements BMICalc {
	
	public double bmi(double mass, double height) {
		
		double imc = 0;
		
		if ((mass > 0 && mass < 400) && (height > 0 && height < 3)) {
			imc = mass / (height * height);
			
		} else { 
			System.out.println("Los datos no son válidos, ERROR.");
		}
	
		return imc;
	}
	
	public String category(double bmi) {
		String result;
		
		if (bmi < 18.5 ) {
			result = "UNDERWEIGHT";
		}
		else if (bmi >= 18.5  && bmi <= 24.9) {
			result = "NORMAL";
		}	
		else if (bmi >= 25.0 && bmi <= 29.0) {
			result = "OVERWEIGHT";
		}
		
		else {
			result = "OBESE";
		}
		return result;
		
	}
	
	public boolean abdominalObesity(double waistCircumference, char gender){
		
		boolean esObeso = false;
		
		if (gender == 'M' && waistCircumference >= 90.0) {
			esObeso = true;
		}
		
		if (gender == 'F' && waistCircumference >= 80.0) {
			esObeso = true;
		}
		
		return esObeso; 
		
	}
	
	
}

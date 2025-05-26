public class functionMaximization{
	
public static int f(int x){
  int resultat;
  resultat = -x*x + 3*x - 2;
  return resultat;
}

public static void main(String[] args) {

	double[] values = new double[11];
	double[] functionValues = new double[11];


	double initial_value = -5.0;
	values[0] = initial_value;
	functionValues[0] = f((int) values[0]);
	for(int i=1; i<11; i++){

		values[i] = values[i-1]+1;
		functionValues[i] = f((int) values[i]);

	}

	for(int i=0; i<11; i++){

		System.out.print(values[i]+" ");

	}	
	System.out.println(" ");
	for(int i=0; i<11; i++){

		System.out.print(functionValues[i]+" ");
	}	


	// returning the max of the function 
	System.out.println(" ");
	double current = functionValues[0];

	for(int i=1; i<functionValues.length; i++){

		if(current<functionValues[i]){
			// swap the two values
			current = functionValues[i];
		}
	}
	System.out.println("Maximum value of function is "+current);
	
}
	


}
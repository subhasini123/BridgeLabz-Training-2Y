package lambda;
interface TotalCalc{
	int cal(int a, int b);
	}

public class First {
	public static void main(String[] args) {
		TotalCalc sum = (int X, int Y)->(X+Y);
		int s=sum.cal(3,6); 
		System.out.println("sum is:" +s);
		
		TotalCalc difference = (X,Y)->(X-Y);
		int d=difference.cal(5,3);
		System.out.println("difference is:" +d);
		
		TotalCalc multiply = (X,Y)->(X*Y);
		int m=multiply.cal(2, 3);
		System.out.println("multiply is:" +m);
		
		TotalCalc divide = (X,Y)->(X/Y);
		int f=divide.cal(6, 2);
		System.out.println("divide is:" +f);
		
		
	}
}



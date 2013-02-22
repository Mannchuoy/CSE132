
public class Factorial {
	public int fNumber(int n)
	{
		if(n<=1)
			return 0;
		else
			return n * fNumber(n-1);
	}

}

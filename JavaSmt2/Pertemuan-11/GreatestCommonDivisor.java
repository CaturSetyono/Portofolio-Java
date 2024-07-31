public class GreatestCommonDivisor{

static int gcd(int x, int y)
    {
        if(y==0)
            return x;
        else
        	//System.out.println(x+" dan "+y);
            return gcd(y,x%y);
    }

    public static void main(String args[]){
		System.out.println("GCD = "+gcd(500,3));
	}
}
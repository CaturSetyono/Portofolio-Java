public class ContohBreakModifikasi {
	public static void main(String args[]){
	int [] numbers = {10,20,30,40,50};
	int i = 0;
	while(i < numbers.length){
	if (numbers[i]==30){
	break;
	}
	System.out.print(numbers[i]);
	System.out.print("\n");
	i++;
	}

}
}

public class MyFunctions implements TestingFunctions {

	@Override
	public int greatestCommonDivisor(int a, int b) {
		if(a==0 && b!= 0)
			return b;
		if(b==0 && a!= 0)
			return a;
		if(b<0 || a<0)
			return -1;
		return greatestCommonDivisor(b, a % b);
	}

	@Override
	public void reverseWindow(int[] arr, int index1, int index2) throws IndexOutOfBoundsException {
		if(index1 <0 || index2 <0)
			throw new IndexOutOfBoundsException();
		if(index1 > index2) {
			int tempVal;
			tempVal = index1;
			index1 = index2;
			index2 = tempVal;
		}
		
			System.out.print(arr[1]);
		//System.out.println(index1 + "" + index2);	
	}

}

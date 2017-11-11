
public class ArrayChallenge {

  public static <T> Object[] rotateLeft(T[] things) {
    Object[] newArray = new Object[things.length];
    for(int i=0; i<things.length; i++) {
      if(i==0) {
        newArray[newArray.length-1]=things[i];
      } else {
        newArray[i-1] = things[i];
      }
    }
    return newArray;
  }
  
  public static Boolean firstLast6(int[] nums) {
	  if (nums[0]==6||nums[nums.length-1]==6) {
		  return true;
	  } else {
		return false;
	}
  }

	public static void main(String[] args) {
		int[] first6 = {1,2,6};
		int[] second6 = {6,1,2,3};
		int[] third6 = {13,6,1,2,3};
		System.out.println(firstLast6(first6));
		System.out.println(firstLast6(second6));
		System.out.println(firstLast6(third6));
		String[] strArr = { "one", "two", "three", "four" };
		Integer[] intArray = {1,2,3};
		Object[] rotatedInteger = rotateLeft(intArray);
		Object[] rotatedString = rotateLeft(strArr);
//		Integer[] rotatedInteger = (Integer[]) rotateLeft(intArray); 
//		we could always type cast if wanted to
	    for(int i=0; i<rotatedInteger.length; i++) {
	      System.out.println(rotatedInteger[i]);
	    }
	    for(int i=0; i<rotatedString.length; i++) {
		      System.out.println(rotatedString[i]);
		    }
	}

}

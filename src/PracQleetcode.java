
public class PracQleetcode {

	public static void main(String[] args) {

		String num = "1234";

		int[] nums = new int[num.length()];
        int j = 0;
        for(int i = 0; i < num.length(); i++)
        {
            nums[j] = num.charAt(i);
            System.out.print(nums[j] + " ");
            j++;
        }
        
        for(int i = 0; i < nums.length; i++)
        {
        	System.out.print(nums[i] + " ");
        }
	
	}

}

package searchingSorting;


/*
  	Q. A new racing track for kids is being built with 'n' starting spots. The spots are located along a straight line at positions x1, x2, x3,...., xn (xi <= 10^9). For each i, xi + 1 > xi.
  	
  	At a time only 'm' kids are allowed to enter the race. Since the race track is for kids, they may run into each other while running. TO prevent this, we want to choose the starting point/spots such that the minimum distance b/w any two of them is as large as possible. What is the largest minimum distance ? 
 
 
 ->  Basically, we have to find Maximal Minima.... by using binary search
 
 */

public class RaceTrack {
	
	static boolean isPossible(int[] track, int kids, int dist)
	{
		int kidsPlaced = 1;
		int lastKid = track[0];
		
		for(int i = 1; i < track.length; i++)
		{
			if(track[i] - lastKid >= dist)
			{
				kidsPlaced++;
				lastKid = track[i];
			}
		}
		return kidsPlaced >= kids;
	}
	
	static int raceTrack(int[] track, int kids)
	{
		if(kids > track.length) return -1;
		
		int s = 0, e = (int) 1e9;
		int ans = -1;
		
		while(s <= e)
		{
			int mid = s + (e-s)/2;
			if(isPossible(track, kids, mid))
			{
				ans = mid;
				s = mid + 1;
			}
			else
				e = mid - 1;
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] arr = {1,2,4,8,9};
		int kids = 3;
		
		System.out.println(raceTrack(arr, kids));
	}

}

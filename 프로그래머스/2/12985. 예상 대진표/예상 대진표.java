class Solution
{
   public int solution(int n, int a, int b)
		{
			int count = 0;
			while(true){
				count++;
				a = (int)Math.ceil((double)a /2);
				b = (int)Math.ceil((double)b /2);
				if(a == b)
					return count;
			}
		}
}
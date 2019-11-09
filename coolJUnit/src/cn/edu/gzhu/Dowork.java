package cn.edu.gzhu;

public class Dowork {
	public static void DoWork(int x, int y, int z){
		int k = 0;
		double j = 0;
		if ((x > 3) && (z < 10))
		{
			k = x * y - 1;
			j = Math.sqrt(k);

		} // Óï¾ä¿é1
		if ((x == 4) || (y > 5))
		{
			j = x * y + 10;
		} // Óï¾ä¿é2
		j = j % 3; // Óï¾ä¿é3
	}
	public static void main(String[] args) {
		
	}
}

public class Profit {
	  public float calculateProfit(int x, int y,  int z) 
	  {
		  float cp = y / 12f;
		  float p = z - cp;
		  float pPercentage = (p / cp) * 100f; 
		  return pPercentage;
	  }
}

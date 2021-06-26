package packB;
import packA.Science;
public class Commerce extends Science {
    protected int comm=500;
    int getScore() {
  	  return comm;
    }
    
	public static void main(String[] args) {
		Science c = new Science();
		c.getScore();
	}

}

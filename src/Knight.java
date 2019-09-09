
public class Knight {
	
	public int x;
	public int y;
	public int[] startingCoordinates = new int[2];
	
	public int[] currentCoordinates;
	
	public int[] GetcurrentCoordinates() {
		currentCoordinates = new int[2];
		currentCoordinates[0] = this.x;
		currentCoordinates[1] = this.y;
		return currentCoordinates;
	}
	
	public Knight() {	
		x = (int)(Math.random()* 8);
		y = (int)(Math.random()* 8);
		startingCoordinates[0] = x;
		startingCoordinates[1] = y;
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

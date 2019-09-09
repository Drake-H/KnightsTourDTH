public class NoHeuristic {
	
	public int [][] board = new int [8][8];//the 8x8 chessboard
	public int [][] moves = {{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2}};//the array of total possible moves
	public int [] trash = new int [8];//the array of unusable moves
	public int trashIndex = 0;//the number of unusable moves for the knight's current location
	public Knight knight;//the knight that moves and stores information about its location
	public int moveCount;//an integer that tracks the total moves of the knight
	public boolean moveAgain;//a boolean that confirms the loop can run again
	public boolean needNew;//a boolean that shows the loop needs to choose a new move for the knight
	public boolean foundTrash;//a boolean that confirms whether or not an unusable move is about to be used

	
	public NoHeuristic() {
    
	for (int[] i : board) {
		for (int j : i) { 
			j = 0;
		}
	}//ends for loop. This "clears" the board and sets the contents of each array index to 0.
	
	knight  = new Knight();
	foundTrash = false;
	moveCount = 0;
	
	while ( moveAgain = true) {
		int currentIndex = (int)(Math.random()*8);
		
			while (needNew = true)	{
				for (int iGuess = 0; iGuess < trashIndex; iGuess++) {
					if ( currentIndex == trash[iGuess]) {
						foundTrash = true;
					}//end if 'currentIndex' statement
				}//end for 'iGuess' loop
				if( foundTrash = false) {
					needNew = false;
				} else {
					currentIndex = (int)(Math.random()*8);
				}//end if else 'trash' statement
			}//end while 'needNew' loop
			
	 int[] nextMove = moves[currentIndex];
	 if(knight.GetcurrentCoordinates()[0] + nextMove[0] < 7 && knight.GetcurrentCoordinates()[0] + nextMove[0] > -1
	    && knight.GetcurrentCoordinates()[1] + nextMove[1] < 7 && knight.GetcurrentCoordinates()[1] + nextMove[1] > -1 
	    && board[knight.GetcurrentCoordinates()[0] + nextMove[0]][knight.GetcurrentCoordinates()[1] + nextMove[1]] != 0 ){
		 knight.currentCoordinates[0] = knight.GetcurrentCoordinates()[0] + nextMove[0];
		 knight.currentCoordinates[1] = knight.GetcurrentCoordinates()[1] + nextMove[1];
		 moveCount++;
		 board[knight.GetcurrentCoordinates()[0] + nextMove[0]][knight.GetcurrentCoordinates()[1] + nextMove[1]] = moveCount;
		 moveCount++;
	 } else {
		 trash[trashIndex] = currentIndex;
		 trashIndex = trashIndex + 1;
		 needNew = true;
		 
	 }//ends if-else statement
	 		
	}//ends while 'moveAgain' statement 
	
	System.out.println("[" + knight.startingCoordinates[0] + "," + knight.startingCoordinates[1] + "], " + moveCount + ", [" + knight.currentCoordinates[0]+ "," + knight.currentCoordinates[1] + "]");
	
	}//ends NoHeuristic
}//ends class

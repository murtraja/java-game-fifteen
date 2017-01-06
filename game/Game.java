package game;

public class Game {
	public int[][] gameGrid={
			{1,4,15,7},
			{8, 10, 2, 11},
			{14,3,6, 13},
			{12, 9, 5, 0}
	};
	public void getSpacePos(int index[])
	{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				if(gameGrid[i][j]==0)
				{
					index[0]=i;
					index[1]=j;
					return;
				}
			}
		}
	}
	public void pressedUp()
	{
		int [] space = new int[2];
		getSpacePos(space);
		/*
		 * now if space is in the last row
		 * i.e. space[0]==3, no change
		 */
		if(space[0]==3)
		{}
		else
		{
			/*
			 * now exchange values 
			 * row space[0}+1 will go to space[0]
			 */
			gameGrid[space[0]][space[1]] = gameGrid[space[0]+1][space[1]];
			gameGrid[space[0]+1][space[1]] = 0;
		}
		
	}
	public void pressedDown()
	{
		int [] space = new int[2];
		getSpacePos(space);
		/*
		 * now if space is in the top row
		 * i.e. space[0]==0, no change
		 */
		if(space[0]==0)
		{}
		else
		{
			/*
			 * now exchange values 
			 * 
			 */
			gameGrid[space[0]][space[1]] = gameGrid[space[0]-1][space[1]];
			gameGrid[space[0]-1][space[1]] = 0;
		}
	}
	public void pressedRight()
	{
		int [] space = new int[2];
		getSpacePos(space);
		/*
		 * now if space is in the first col
		 * i.e. space[1]==0, no change
		 */
		if(space[1]==0)
		{}
		else
		{
			/*
			 * now exchange values 
			 * row space[0}+1 will go to space[0]
			 */
			gameGrid[space[0]][space[1]] = gameGrid[space[0]][space[1]-1];
			gameGrid[space[0]][space[1]-1] = 0;
		}
	}
	public void pressedLeft()
	{
		int [] space = new int[2];
		getSpacePos(space);
		/*
		 * now if space is in the last col
		 * i.e. space[1]==3, no change
		 */
		if(space[1]==3)
		{}
		else
		{
			/*
			 * now exchange values 
			 * 
			 */
			gameGrid[space[0]][space[1]] = gameGrid[space[0]][space[1]+1];
			gameGrid[space[0]][space[1]+1] = 0;
		}
	}
	public void printGrid()
	{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				if(gameGrid[i][j]!=0)
				System.out.format("%5d", gameGrid[i][j]);
				else
					System.out.format("%5c", ' ');
			}
			System.out.println();
		}
	}
}

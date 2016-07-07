

	public class Box
	
	{ private int boxsize; // the size of the box
	/** Constructor Box builds the box
	* @param size - the size of the box */
	public Box(int size)
	{ boxsize = size; }
	/** inHorizontalContact replies whether a position has contacted a
	* horizontal wall.
	* @param x position - the position examined
	* @return true, if x position equals or exceeds the positions of the
	* horizontal walls; return false, otherwise */
	public boolean inHorizontalContact(int xposition)
	
	{ return ((xposition <= 0) || (xposition >= boxsize)||(xposition<=boxsize/2)&&(xposition>=boxsize/2)); }
	/** inVerticalContact replies whether a position has contacted a
	* vertical wall.
	* @param y position - the position examined
	* @return true, if y position equals or exceeds the positions of the
	* vertical walls; return false, otherwise */
	public boolean inVerticalContact(int yposition)
	{ return (yposition <=0) || (yposition >= boxsize)||yposition>boxsize; }
	/** sizeOf returns the size of the box */
	
	
	public int sizeOf()
	{ return boxsize; }
	}




public class topiLevizes {
	/** MovingBall models a moving ball */
	
	 private int xpos; // ball's center x-position
	private int ypos; // ball's center y-position
	private int radius; // ball's radius
	private int xvelocity = +5; // horizonal speed; positive is to the right
	private int yvelocity = +2; // vertical speed; positive is downwards
	private Box container; // the container in which the ball travels
	/** Constructor MovingBall constructs the ball.
	* @param x initial - the center of the ball's starting horizontal position
	* @param y initial - the center of the ball's starting vertical position
	* @param r - the ball's radius
	* @param box - the container in which the ball travels */
	public topiLevizes(int xinitial, int yinitial, int r, Box box)
	{ xpos = xinitial;
	ypos = yinitial;
	radius = r;
	container = box;
	}
	/** xPosition returns the ball's current horizontal position */
	public int xPosition()
	{ return xpos; }
	/** yPosition returns the ball's current vertical position */
	public int yPosition()
	{ return ypos; }
	/** radiusOf returns the ball's radius */
	public int radiusOf()
	{ return radius; }
	/** move moves the ball
	* @param time units - the amount of time since the ball last moved */
	public void move(int timeunits)
	{ xpos = xpos + (xvelocity * timeunits);
	if ( container.inHorizontalContact(xpos) )
	{ xvelocity = -xvelocity; } // reverse horizontal direction
	ypos = ypos + (yvelocity * timeunits);
	if ( container.inVerticalContact(ypos) )
	{ yvelocity = -yvelocity; } // reverse vertical direction
	}
	
}



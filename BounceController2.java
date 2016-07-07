
public class BounceController2 {
	 private topiLevizes ball1; // model object
	 private topiLevizes ball2;
	private animationWriter2 writer; // output-view object
	/** Constructor BounceController initializes the controller
	* @param b - the model object
	* @param w - the output-view object */
	public BounceController2(topiLevizes b,topiLevizes b1, animationWriter2 w)
	{ ball1 = b;
	ball2=b1;
	writer = w;
	}
	
	
	/** runAnimation runs the animation by means of an internal clock */
	public void runAnimation()
	{ int timeunit = 1; // time unit for each step of the animation
	int paintingdelay = 20; // how long to delay between repaintings
	while ( true )
	{ delay(paintingdelay);
	ball1.move(timeunit);
	ball2.move(timeunit);
	System.out.println(ball1.xPosition() + ", " + ball1.yPosition());
	System.out.println(ball2.xPosition() + ", " + ball2.yPosition());
	writer.repaint();// redisplay box and ball
	}
	}
	/** delay pauses execution for how long milliseconds */
	private void delay(int howlong)
	{try { Thread.sleep(howlong); }
	catch (InterruptedException e) { }
	}

}

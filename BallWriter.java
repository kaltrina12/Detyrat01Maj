import java.awt.*;

public class BallWriter
{
	private topiLevizes ball;
	private Color ballsColor;
	public BallWriter(topiLevizes x,Color c)
	{
		ball=x;
		ballsColor=c;
	}
	public void paint(Graphics g)
	{
		g.setColor(ballsColor);
		int radius=ball.radiusOf();
		g.fillOval(ball.xPosition() - radius,
				ball.yPosition() - radius, radius * 2, radius * 2);
		
	}
}
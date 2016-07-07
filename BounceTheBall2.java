import java.awt.*;

public class BounceTheBall2 {
	public static void main(String[]args)
	{
		int BoxSize =200;
		int radius=6;
		Box box=new Box(BoxSize);
		topiLevizes topi1 = new topiLevizes((int)(BoxSize / 2.0),
				(int)(BoxSize / 5.0),
				radius, box);
				topiLevizes topi2 = new topiLevizes((int)(BoxSize / 5.0),
				(int)(BoxSize / 2.0),
				radius, box);
				BallWriter ballwriter1=new BallWriter(topi1,Color.green);
				BoxWriter boxwriter1=new BoxWriter(box);
				BallWriter ballwriter2=new BallWriter(topi2,Color.blue);
				animationWriter2 writer =new animationWriter2(boxwriter1,ballwriter1,ballwriter2,BoxSize);
				new BounceController2(topi1,topi2,writer).runAnimation();

				
	}
	


}

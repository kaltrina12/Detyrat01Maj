import java.awt.*;

import javax.swing.*;


	public class animationWriter2 extends JPanel{
		
		/** AnimationWriter displays a box with a ball in it. */
		
		 private BoxWriter boxwriter; // the output-view of the box
		private BallWriter ballwriter1; // the output-view of the ball in the box
		private BallWriter ballwriter2;
		/** Constructor AnimationWriter constructs the view of box and ball
		* @param b - the box's writer
		* @param l - the ball's writer
		* @param size - the frame's size */
		public animationWriter2(BoxWriter b, BallWriter l,BallWriter ll, int size)
		{ boxwriter = b;
		ballwriter1 = l;
		ballwriter2=ll;
		JFrame myframe = new JFrame();
		myframe.getContentPane().add(this);
		myframe.setTitle("Bounce");
		myframe.setSize(size, size);
		myframe.setVisible(true);
		}
		/** paintComponent paints the box and ball
		* @param g - the graphics pen */
		public void paintComponent(Graphics g)
		{ boxwriter.paint(g);
		ballwriter1.paint(g);
		ballwriter2.paint(g);
		}

	
public static void main(String[]args)
{
	Box k=new Box(200);
	topiLevizes t=new topiLevizes(50,50,10,k);
	BoxWriter vk=new BoxWriter(k);
	BallWriter vt=new BallWriter(t,Color.red);
	
	
	
}

	


	
}
	
		
	


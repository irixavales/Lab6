import javax.swing.JFrame;

public class BouncingFiguresTester {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		JFrame frame= new JFrame();
		frame.setTitle("Mr Fresh Window");
		frame.setSize(600, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a box to put all objects in
		BouncingBox box = new BouncingBox();
		
		//Add all the components to the box
		BouncingFigure figure1 = new BouncingRectangle(0, 0, 10, 10, 325.0, 100);
		box.add(figure1);
		BouncingFigure figure2 = new BouncingRectangle(0, 500, 10, 10, 45.0, 50);
		box.add(figure2);
		BouncingFigure figure3 = new BouncingRectangle(500, 0, 10, 10, 30.0, 50);
		box.add(figure3);
		BouncingFigure figure4 = new BouncingRectangle(500, 500, 10, 10, 145.0, 50);
		box.add(figure4);
		BouncingFigure figure5 = new BouncingRectangle(250, 250, 10, 10, 90.0, 100);
		box.add(figure5);
		BouncingFigure figure6 = new BouncingRectangle(250, 250, 10, 10, 0.0, 100);
		box.add(figure6);
		BouncingCircle circle1 = new BouncingCircle(0, 500, 10, 45.0, 150);
        box.add(circle1);
        BouncingCircle circle2 = new BouncingCircle(0, 0, 20, 300.0, 98);
        box.add(circle2);
        BouncingCircle circle3 = new BouncingCircle(40, 60, 15, 45.0, 75);
        box.add(circle3);

		frame.add(box);
		
		// Make the frame visible
		frame.setVisible(true);
		
		// Continuously update the frame since some components will change position
		while(true) {
			try{
				Thread.sleep(100); // Wait for 0.1 second = 100 milliseconds
			}
			catch(InterruptedException e){}
			
			frame.repaint();
			
		} // end while

	}//end main

}//end class

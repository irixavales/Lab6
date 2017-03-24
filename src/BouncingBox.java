import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BouncingBox extends JComponent {

	private ArrayList<BouncingFigure> figures = new ArrayList<BouncingFigure>();

	public void add(BouncingFigure f) {
		figures.add(f);
	}

	public void paintComponent(Graphics g) {
        int height = this.getHeight() - 1; //Height of the frame
        int width = this.getWidth() - 1; //Width of the frame
        
        for (BouncingFigure f : figures) {
            if (f.upperBorderCollision() == true || f.lowerBorderCollision(height) == true) {
                f.setTrajectory(360 - f.getTrajectory()); //figure will bounce at the same angle it hits a horizontal line
            }
            else if (f.leftBorderCollision() == true || f.rightBorderCollision(width) == true) {
            	f.setTrajectory(180 - f.getTrajectory()); //figure will bounce at the same angle it hits a vertical line
            }
            f.draw(g); f.move();
        }
    }
}

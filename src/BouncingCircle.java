import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class BouncingCircle extends BouncingFigure {
   
    private int radius;
   
    BouncingCircle (int xLeft, int yTop, int radius, double trajectory, int speed) {
        setXLeft(xLeft);
        setYTop(yTop);
        setTrajectory(trajectory);
        setSpeed(speed);
        this.radius = radius;
    }
   
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Shape oval = new Ellipse2D.Float(getXLeft(), getYTop(), 2 * this.radius, 2 * this.radius);
        Color color = new Color(212, 233, 32);
        g2.setColor(color);
        g2.fill(oval);
    }
   
    //Methods to test of object hit each of four possible borders
        public boolean rightBorderCollision(int screenLimit){
            if(getXLeft()+this.radius*2 > screenLimit)
                return true;
            return false;
        }
       
        public boolean leftBorderCollision(){
            if(getXLeft() < 0)
                return true;
            return false;
        }

        public boolean upperBorderCollision(){
            if(getYTop() < 0)
                return true;
            return false;
        }

        public boolean lowerBorderCollision(int screenLimit){
            if(getYTop()+this.radius*2 > screenLimit)
                return true;
            return false;
        }
}


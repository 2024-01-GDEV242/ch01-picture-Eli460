/**
 * This is a basketball court with the squares representing the hoop
 * the triangle representing the rim and a scene of 2 people playing 
 * basketball outside at the park

 * @author  Elisha White 
 * @version 2024.01.29
 */
public class Picture
{
    private Square court;
    private Square window;
    private Triangle rim;
    private Circle sun;
    private boolean drawn;
    private Square line1;
    private Person eli;
    private Person opponent;
    private Square goal1;
    private Square goal2;
    private Circle ball;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        court = new Square();
        line1 = new Square();
        goal1 = new Square();
        goal2 = new Square();
        rim = new Triangle();  
        sun = new Circle();
        eli = new Person();
        opponent = new Person();
        ball = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            court.moveHorizontal(-320);
            court.moveVertical(-320);
            court.changeSize(550);
            court.makeVisible();
            court.changeColor("blue");
            
            line1.changeColor("green");
            line1.moveHorizontal(-360);
            line1.moveVertical(100);
            line1.changeSize(550);
            line1.makeVisible();
    
            eli.changeSize(80,40);
            eli.moveHorizontal(100);
            eli.moveVertical(25);
            eli.makeVisible();
            
            opponent.changeSize(80,40);
            opponent.moveHorizontal(-50);
            opponent.moveVertical(25);
            opponent.makeVisible();
            
    
            goal1.changeColor("white");
            goal1.moveHorizontal(-250);
            goal1.moveVertical(-55);
            goal1.changeSize(80);
            goal1.makeVisible();
        
            goal2.changeColor("black");
            goal2.moveHorizontal(-230);
            goal2.moveVertical(-35);
            goal2.changeSize(35);
            goal2.makeVisible();
            
            rim.changeColor("orange");
            rim.changeSize(20, 30);
            rim.moveHorizontal(-65);
            rim.moveVertical(-15);
            rim.makeVisible();
        
            ball.changeColor("orange");
            ball.moveHorizontal(15);
            ball.moveVertical(-10);
            ball.changeSize(18);
            ball.makeVisible();
        
    
            sun.changeColor("yellow");
            sun.moveHorizontal(175);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        court.changeColor("black");
         line1.changeColor("black");
         eli.changeColor("white");
         opponent.changeColor("white");
         goal1.changeColor("white");
         goal2.changeColor("black");
         rim.changeColor("white");
         ball.changeColor("white");
         sun.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        court.changeColor("green");
         line1.changeColor("blue");
         eli.changeColor("yellow");
         opponent.changeColor("yellow");
         goal1.changeColor("white");
         goal2.changeColor("black");
         rim.changeColor("white");
         ball.changeColor("white");
         sun.changeColor("blue");
    }
    
    public void sunSet()
    {
        sun.slowMoveVertical(400);
    }

}

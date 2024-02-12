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
    private Square goal3;
    private Square goal4;
    private Square goalPost;
    private Square goalPost2;
    private Square goalPost3;
    private Square goalPost4;
    private Triangle rim2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        court = new Square();
        line1 = new Square();
        goal1 = new Square();
        goal2 = new Square();
        goal3 = new Square();
        goal4 = new Square();
        rim = new Triangle();  
        rim2 = new Triangle(); 
        sun = new Circle();
        eli = new Person();
        opponent = new Person();
        ball = new Circle();
        goalPost = new Square();
        goalPost2 = new Square();
        goalPost3 = new Square();
        goalPost4 = new Square();
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
            eli.moveHorizontal(-25);
            eli.moveVertical(25);
            eli.makeVisible();
            
            opponent.changeSize(80,40);
            opponent.moveHorizontal(-150);
            opponent.moveVertical(25);
            opponent.makeVisible();
            
    
            goal1.changeColor("white");
            goal1.moveHorizontal(-310);
            goal1.moveVertical(-55);
            goal1.changeSize(80);
            goal1.makeVisible();
        
            goal2.changeColor("black");
            goal2.moveHorizontal(-290);
            goal2.moveVertical(-35);
            goal2.changeSize(35);
            goal2.makeVisible();
            
            rim.changeColor("orange");
            rim.changeSize(20, 30);
            rim.moveHorizontal(-125);
            rim.moveVertical(-15);
            rim.makeVisible();
            
            goal3.changeColor("white");
            goal3.moveHorizontal(110);
            goal3.moveVertical(-55);
            goal3.changeSize(80);
            goal3.makeVisible();
        
            goal4.changeColor("black");
            goal4.moveHorizontal(135);
            goal4.moveVertical(-35);
            goal4.changeSize(35);
            goal4.makeVisible();
            
            goalPost.changeColor("black");
            goalPost.moveHorizontal(-310);
            goalPost.moveVertical(26);
            goalPost.changeSize(40);
            goalPost.makeVisible();
            
            goalPost2.changeColor("black");
            goalPost2.moveHorizontal(-310);
            goalPost2.moveVertical(60);
            goalPost2.changeSize(40);
            goalPost2.makeVisible();
            
            goalPost3.changeColor("black");
            goalPost3.moveHorizontal(150);
            goalPost3.moveVertical(26);
            goalPost3.changeSize(40);
            goalPost3.makeVisible();
            
            goalPost4.changeColor("black");
            goalPost4.moveHorizontal(150);
            goalPost4.moveVertical(60);
            goalPost4.changeSize(40);
            goalPost4.makeVisible();
        
            
            rim2.changeColor("orange");
            rim2.changeSize(20, 30);
            rim2.moveHorizontal(200);
            rim2.moveVertical(-15);
            rim2.makeVisible();
        
            ball.changeColor("orange");
            ball.moveHorizontal(-50);
            ball.moveVertical(10);
            ball.changeSize(18);
            ball.makeVisible();
        
    
            sun.changeColor("yellow");
            sun.moveHorizontal(55);
            sun.moveVertical(-120);
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
         goal3.changeColor("white");
         goal4.changeColor("black");
         goalPost.changeColor("white");
         goalPost2.changeColor("white");
         goalPost3.changeColor("white");
         goalPost4.changeColor("white");
         rim.changeColor("white");
         rim2.changeColor("white");
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
         goal3.changeColor("white");
         goal4.changeColor("black");
         goalPost.changeColor("black");
         goalPost2.changeColor("black");
         goalPost3.changeColor("black");
         goalPost4.changeColor("black");
         rim.changeColor("white");
         rim2.changeColor("white");
         ball.changeColor("white");
         sun.changeColor("blue");
    }
    
    public void sunSet()
    {
        sun.slowMoveVertical(400);
    }

}

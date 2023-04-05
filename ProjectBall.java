import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import java.util.*;
import javafx.geometry.*;
import javafx.scene.paint.*;
import javafx.scene.image.*;
import javafx.event.*;
import javafx.animation.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import java.util.*;
import javafx.geometry.*;
import javafx.scene.paint.*;
import javafx.scene.image.*;
import javafx.scene.canvas.*;
import javafx.scene.input.*;

     
   
public class ProjectBall extends Application
{
  
   
   
   private int Circles = 0;
   
   // basic stage
   public void start(Stage stage)
   {
      
      BorderPane bp = new BorderPane();// new borderpan 
      GridPane gp = new GridPane();// new gridpane 
      Label l = new Label("Text Field");// Labe with the text field 
     
      bp.setAlignment(l,Pos.CENTER);// alining the label to the center 
      bp.setTop(l);// Setting the label to the top 

      gp.setHgap(10);// setting H Gap
      gp.setVgap(10);// setting v Gap
      gp.setAlignment(Pos.CENTER);
      
      for(int i=0;i<4;i++)// for loop for making it a 4x4 for each game pane 
    {
      for(int j=0;j<4;j++)
       {
        GamePane Game = new GamePane();
        gp.add(Game,j,i);
       }
    }
    
       bp.setCenter(gp);// centering the gridpane on the borderpane 
      
      
      
      Scene scene = new Scene(bp, 600, 600); // creating a scene
      stage.setScene(scene); // setting our scene to the scene from above
      stage.setTitle("Ball Game"); // our title is Lab 8
      stage.show(); // shows our stage
         
   }
      public class GamePane extends GridPane
    {
    private  Button Left = new Button();
    private Button Right = new Button();// Button variable 
    private Button Bottom = new Button();
    private Button Top = new Button();

    GridPane GridPane = new GridPane();// Gridpane 
    Canvas canvas = new Canvas(80,80);// canvas that is 80x80
    GraphicsContext gc = canvas.getGraphicsContext2D();// adding gc to canvas 
    
    public GamePane(){
      super();
     
     
     Left.setPrefHeight(80);// Setting the height and width of each button 
     Left.setPrefWidth(20);
     
     
     Top.setPrefHeight(20);
     Top.setPrefWidth(80);
     
     
     
     Right.setPrefHeight(80);
     Right.setPrefWidth(20);
     
     
     Bottom.setPrefHeight(20);
     Bottom.setPrefWidth(80);
    
     GridPane.add(Top,1,0);// Adding Buttons to their positions
     GridPane.add(Left,2,1);
     GridPane.add(Right,0,1);
     GridPane.add(Bottom,1,2);
     GridPane.add(canvas,1,1);
     
      gc.setFill(Color.BLACK);// setting the ball as a black color 
      gc.fillOval(0,0,80,80);

    
    getChildren().add(GridPane);
    }
    
 }
  
      
   public static void main(String[] args)
   {
      launch(args); // launches the code
    }
   }

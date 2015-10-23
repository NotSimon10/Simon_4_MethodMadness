import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.GRAY;
import static javafx.scene.paint.Color.WHITE;
import static javafx.scene.paint.Color.YELLOW;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
 
public class Simon_4_MethodMadness extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawBody(gc);
        drawFeet(gc);
        drawArms(gc);
        drawBodyOutline(gc);
        drawChestOutline(gc);
        drawEyeWhites(gc);
        drawPupils(gc);
        drawBeak(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawBody(GraphicsContext gc) {
        gc.setFill(BLACK);
        gc.fillOval(150, 50, 200, 400);
        
    }
        
        private void drawBodyOutline(GraphicsContext gc) {
        
        gc.setFill(GRAY);
        gc.fillOval(183, 97.5, 55, 55);
        gc.fillOval(172.5, 238, 155, 205);
        
    }
        
        private void drawChestOutline(GraphicsContext gc) {
        
        gc.setFill(GRAY);
        gc.fillOval(257.5, 97.5, 55, 55);
        
    }
        
        private void drawEyeWhites(GraphicsContext gc) {

        gc.setFill(WHITE);
        gc.fillOval(175, 240, 150, 200);
        gc.fillOval(185, 100, 50, 50);
        gc.setFill(WHITE);
        gc.fillOval(260, 100, 50, 50);
        
    }
        
        private void drawPupils(GraphicsContext gc) {
        
        gc.setFill(BLACK);
        gc.fillOval(204, 117, 10, 10);
        gc.fillOval(280, 117, 10, 10);
        
    }
        
        private void drawBeak(GraphicsContext gc) {
        
        gc.setFill(YELLOW);
        int shiftx = 90;
        int shifty = -140;
        gc.fillPolygon(new double []{130 + shiftx, 160 + shiftx, 190 + shiftx},
                new double[]{300 + shifty, 340 + shifty, 300 + shifty},3);
        gc.setFill(BLACK);
        gc.fillRect(249, 160, 2, 40); 
        gc.fillOval(235, 165, 10, 10);
        gc.fillOval(254, 165, 10, 10);
        
    }
        
        private void drawArms(GraphicsContext gc) {
        gc.setFill(BLACK);
        gc.fillOval(100, 200, 200, 30);
        gc.fillOval(200, 200, 200, 30);
        
    }
          
        
        private void drawFeet(GraphicsContext gc) {
        
        gc.setFill(BLACK);
        gc.fillRect(220, 440, 3, 30);
        gc.fillRect(277, 440, 3, 30);
        
    }

    }

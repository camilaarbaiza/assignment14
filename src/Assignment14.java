/*
   Author: Camila Arbaiza

   Professor: Tanes Kanchanawanchai

   Problem 14.2

    (Tic-tac-toe board) Write a program that displays a tic-tac-toe board, as shown
    in Figure 14.43b. A cell may be X, O, or empty. What to display at each cell is
    randomly decided. The X and O are images in the files cross.gif and o.gif.

 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Assignment14 extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        //Declare images for the tic tac toe cross and O
        Image cross = new Image("image/cross.gif");
        Image o = new Image("image/o.gif");


        GridPane pane = new GridPane();   //Create gridPane
        pane.setAlignment(Pos.CENTER);    //Set alignment of GridPane

        //Set spacing
        pane.setHgap(5);
        pane.setVgap(5);

        //Create nested for loop to randomly generate tic tac toe board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = (int) (Math.random() * 3);
                if (n == 0) {
                    pane.add(new ImageView(cross), j, i);
                } else if (n == 1) {
                    pane.add(new ImageView(o), j, i);
                } else {
                    continue;
                }
            }
        }

        //Create scene
        Scene scene = new Scene(pane, 200, 150);
        primaryStage.setTitle("Assignment14"); // Set title for stage
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

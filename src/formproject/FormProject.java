/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Kimz
 */
public class FormProject extends Application {
    
    @Override
    @SuppressWarnings("Convert2Lambda")
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Welcome");
        
        //adding Gridpane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setId("welcome-text");
        //scenetitle.setFont(Font.font("Tohoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 1, 0, 2, 1); 
        
        Label userName = new Label("LogIn ID:");
        grid.add(userName, 0, 1);
        
        TextField userTextField = new TextField();
        grid.add(userTextField,1,1);
        
        
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
               
        
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);          //hbox layout pane with spacing of 10 pixels
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        //a text control for displaying a message
        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);
        actionTarget.setId("actiontarget");
        
        //a code to handle an event
        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            @SuppressWarnings("empty-statement")
            public void handle(ActionEvent e) {
                
                //actionTarget.setFill(Color.BLUEVIOLET);
                actionTarget.setText("Sign in button pressed");
               
;            }
        });
      
        
        Scene scene = new Scene(grid, 500, 300);
        primaryStage.setScene(scene);
        
        //intilize stylesheets variable to point to the cascading style sheet
        //the code will then looks for style sheet in the scr\formProject directory
        scene.getStylesheets().add(FormProject.class.getResource("FormProject.css").toExternalForm());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.*;
import java.time.LocalDate;
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import java.util.Random;

public class Taskmenu extends Application{
    
	@Override
	public void start(Stage stage) throws Exception {
		
		MenuBar menu = new MenuBar();
		
		Menu printMenu = new Menu("Print");
		Menu writeMenu = new Menu("Write");
		Menu colorMenu = new Menu("Change Color", null, colorItem);
		Menu optionMenu = new Menu("Options");
		
		// create menu items
		
		MenuItem printItem = new MenuItem("Time and Date");
		MenuItem fileItem = new MenuItem("Save to file");
		MenuItem colorItem = new MenuItem("Random color");
		MenuItem exitItem = new MenuItem("Exit");

        //make border
        BorderPane border = new BorderPane();
        border.setTop(menu);
        Scene s = new Scene(border, 400, 200);
        setRandomBackgroundColor(stage);
        colorMenu.setOnAction(event -> setRandomBackgroundColor(stage));
        stage.setTitle("Interface Menu");
        stage.setScene(s);
        stage.show();

		
		//add menu items to menu
		
		printMenu.getItems().addAll(printItem);
		writeMenu.getItems().addAll(fileItem);
		colorMenu.getItems().addAll(colorItem);
		optionMenu.getItems().addAll(exitItem);
		
		//add all the menus to bar
		menu.getMenus().addAll(printMenu, writeMenu, colorMenu, optionMenu);
		
		// action for when user clicks on date
		printMenu.setOnAction(new EventHandler<ActionEvent>(){
		
		@Override
		public void handle(ActionEvent event) {
			LocalDate today = LocalDate.now();
			Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Date Printer");
            alert.setHeaderText(null);
            alert.setContentText("Today's Date is: " + today);
            alert.showAndWait();
                        }
    });
		writeMenu.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
			LocalDate today = LocalDate.now();
			 try {
                 
                 // Log message created
                 String aLog = "Message: " + today;

                 File file = new  File("log.txt");

                 // File already created on desktop
                 if (!file.exists()) {
                     file.createNewFile();
                 }

                 FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
                 BufferedWriter buffWriter = new BufferedWriter(fileWriter);
                 buffWriter.write(aLog);
                 buffWriter.close();

                 System.out.println("Finished");

             } catch (IOException ex) {
                 ex.printStackTrace();
             }
             }
     });
     
        public String colorString(Color color) {
            int r = (int)Math.round(color.getRed() * 255.0);
            int g = (int)Math.round(color.getGreen() * 255.0);
            int b = (int)Math.round(color.getBlue() * 255.0);
            int o = (int)Math.round(color.getOpacity() * 255.0);

            return String.format("%02x%02x%02x%02x" , r, g, b, o);
        }
		// When user clicks on Change Color MenuItem
        colorMenu.setOnAction(new EventHandler<ActionEvent>()   {

            @Override
            public void handle(ActionEvent event) {
                menu.setStyle("-fx-background-color: #33cc33;" + colorString(color));
                            }
        });
        
        
        // Set Accelerator for Exit MenuItem.
        exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl plus X"));
         
        // When user clicks on the Exit MenuItem
        exitItem.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
         
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
    }
 
    public static void main(String[] args) {

        Random random = new Random(42);
        Application.launch(args);

        public class ColorGenerator {
            int colorStart = 0;
            Color[] colorArray = {
            Color.rgb(0, 50, 0),
            Color.rgb(0, 100, 0),
            Color.rgb(0, 150, 0),
            Color.rgb(0, 250, 0),
        };
    Color generateRandomShadeOfGreen() {
        int changeColor = colorStart;

        while (changeColor == colorStart) {
            changeColor = random.nextInt(colorArray.length);
        }

        colorStart = changeColor;

        return colorArray[changeColor];
    }
    }
    }
}

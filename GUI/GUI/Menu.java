package GUI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Random;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.time.LocalDate;

public class Interface extends Application {
    @Override
    public void start(Stage container) {
 
        // Create MenuBar
        MenuBar menuTopBar = new MenuBar();
        
        // Create menus
        Menu dateMenu = new Menu("Print");
        Menu textMenu = new Menu("Write");
        Menu colorMenu = new Menu("Change Color");
        Menu exitMenu = new Menu("Options");
        
        // Create MenuItems
        MenuItem dateItem = new MenuItem("Date/Time");
        MenuItem textItem = new MenuItem("Save To Text File");
        MenuItem colorItem = new MenuItem("Random Color");
        MenuItem exitItem = new MenuItem("Exit");
        
        // Add menuItems to the Menus
        dateMenu.getItems().addAll(dateItem);
        textMenu.getItems().addAll(textItem);
        colorMenu.getItems().addAll(colorItem);
        exitMenu.getItems().addAll(exitItem);
        
        // Add Menus to the MenuBar
        menuTopBar.getMenus().addAll(dateMenu, textMenu, colorMenu, exitMenu);
        
       
        // When user clicks on Date/Time MenuItem
        dateMenu.setOnAction(new EventHandler<ActionEvent>()    {

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
        
        // When user clicks on Save to Text File MenuItem
        textMenu.setOnAction(new EventHandler<ActionEvent>()    {

            @Override
            public void handle(ActionEvent event) {
                LocalDate today = LocalDate.now();
                try {
                    
                    // Log message created
                    String content = "Button clicked on: " + today;

                    File cabinent = new  File("log.txt");

                    // File already created on desktop
                    if (!cabinent.exists()) {
                        cabinent.createNewFile();
                    }

                    FileWriter fileWriter = new FileWriter(cabinent.getAbsoluteFile());
                    BufferedWriter buffWriter = new BufferedWriter(fileWriter);
                    buffWriter.write(content);
                    buffWriter.close();

                    System.out.println("Done");

                } catch (IOException e) {
                    e.printStackTrace();
                }
                            }
        });
        
        // When user clicks on Change Color MenuItem
        colorMenu.setOnAction(new EventHandler<ActionEvent>()   {

            @Override
            public void handle(ActionEvent event) {
                menuTopBar.setStyle("-fx-background-color: #33cc33;");
                            }
        });
        
        // Set Accelerator for Exit MenuItem.
        exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
         
        // When user clicks on the Exit MenuItem
        exitItem.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
         
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        

        BorderPane border = new BorderPane();
        border.setTop(menuTopBar);
        Scene init = new Scene(border, 400, 200);
        
        container.setTitle("Interface Menu");
        container.setScene(init);
        container.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}
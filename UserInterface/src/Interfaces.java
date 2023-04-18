
public class Interfaces {

	public Interfaces() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class ColorSelector extends Application {
    private final Random random = new Random(42);

    private final ColorGenerator colorGenerator = new ColorGenerator();

    @Override
    public void start(Stage stage) {
        MenuItem colorItem = new MenuItem("Random Color");
        Menu colorMenu = new Menu("Change Color", null, colorItem);
        MenuBar menuBar = new MenuBar(colorMenu);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        setRandomBackgroundColor(root);
        colorMenu.setOnAction(event -> setRandomBackgroundColor(root));

        Scene scene = new Scene(root, 400, 200);
        stage.setScene(scene);

        stage.show();
    }

    private void setRandomBackgroundColor(Region region) {
        Color color = colorGenerator.generateRandomShadeOfGreen();

        // option 1: set the fill on the root via a background color.
        region.setBackground(
                new Background(
                        new BackgroundFill(color, null, null)
                )
        );

        // option 2: set the fill on the root via a css style.
        // region.setStyle("-fx-background-color: #" + colorToString(color));
    }

    private String colorToString(Color color) {
        int r = (int)Math.round(color.getRed() * 255.0);
        int g = (int)Math.round(color.getGreen() * 255.0);
        int b = (int)Math.round(color.getBlue() * 255.0);
        int o = (int)Math.round(color.getOpacity() * 255.0);

        return String.format("%02x%02x%02x%02x" , r, g, b, o);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private class ColorGenerator {
        private int curColorIndex = 0;

        private final Color[] colorTable = {
                Color.rgb(0, 50, 0),
                Color.rgb(0, 100, 0),
                Color.rgb(0, 150, 0),
                Color.rgb(0, 250, 0),
        };

        private Color generateRandomShadeOfGreen() {
            int nextColorIndex = curColorIndex;

            while (nextColorIndex == curColorIndex) {
                nextColorIndex = random.nextInt(colorTable.length);
            }

            curColorIndex = nextColorIndex;

            return colorTable[nextColorIndex];
        }
    }
}
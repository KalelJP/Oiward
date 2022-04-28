package ch.poeta.oiward;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application
{
	public void start(Stage stage) throws IOException
	{
		FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 320, 240);

		Image icon = new Image(getClass().getResourceAsStream("icon.png"));

		stage.setTitle("Oiward App");
		stage.getIcons().add(icon);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch();
	}
}
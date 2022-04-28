package ch.poeta.oiward;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController
{
	public Canvas cvCanvas;
	public Pane pnPane;
	private Stage stage;
	private Scene scene;
	private Parent root;

	public void onClick(MouseEvent mouseEvent) throws IOException
	{
		switchToMenuWindow(mouseEvent);
	}



	public void switchToMenuWindow(MouseEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("menuWindow.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}

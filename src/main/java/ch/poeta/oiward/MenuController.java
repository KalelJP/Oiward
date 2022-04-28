package ch.poeta.oiward;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController
{
	public Label lblSize;
	public ComboBox cbxGeoForm;
	public ColorPicker cpForm;

	public Button btnCreate;
	public Button btnCancel;

	private Stage stage;
	private Scene scene;
	private Parent root;



	public void createShape(MouseEvent mouseEvent) throws IOException
	{
		switchToMainWindow(mouseEvent);

//		switch ()
	}

	public void handleCancel(MouseEvent mouseEvent) throws IOException
	{
		switchToMainWindow(mouseEvent);
	}

	public void switchToMainWindow(MouseEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}

package ch.poeta.oiward;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController
{
	public Pane pnPane;
	public Label lblSize;
	public ColorPicker cpForm;
	public TextField txtSize;
	public Group gpShapes;
	public RowConstraints menuRowTwo;
	public RowConstraints menuRowOne;
	public GridPane gdpMenu;
	public HBox hbxOptions;
	private Stage stage;
	private Scene scene;
	private Parent root;

	private boolean isSquare = false;

	public ComboBox cbxGeoForm;
	

	public void initialize()
	{
		cbxGeoForm.getItems().add("Circle");
		cbxGeoForm.getItems().add("Rectangle");
		cbxGeoForm.getItems().add("Ellipse");
	}

	public void createShape(MouseEvent mouseEvent)
	{
		if (mouseEvent.getButton() == MouseButton.SECONDARY)
		{
			try
			{
				int lastItem = gpShapes.getChildren().size() - 1;
				gpShapes.getChildren().remove(lastItem);
			}
			catch (Exception ignored)
			{

			}
		}
		else{
			try
			{
				switch (cbxGeoForm.getValue().toString())
				{
					case "Circle":
						Circle circle = new Circle();
						circle.setCenterX(mouseEvent.getX());
						circle.setCenterY(mouseEvent.getY());
						circle.setRadius(Integer.parseInt(txtSize.getText()));
						circle.setFill(cpForm.getValue());
						break;
					case "Rectangle":

						lblSize.setText("Height");
						txtSize.setPrefWidth(107);
						Label lblWidth = new Label("Width");
						hbxOptions.getChildren().add(lblWidth);
						break;
					case "Ellipse":
						//shape = new Ellipse();
						break;
					default:
						break;
				}
			}
			catch (Exception exception)
			{
			}
		}
	}






}

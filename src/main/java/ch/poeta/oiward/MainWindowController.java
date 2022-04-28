package ch.poeta.oiward;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainWindowController
{
	public Pane pnPane;
	public Label lblSize;
	public ColorPicker cpForm;
	public Group gpShapes;
	public RowConstraints menuRowTwo;
	public RowConstraints menuRowOne;
	public GridPane gdpMenu;
	public HBox hbxOptions;
	public Slider sldSize;
	private Stage stage;
	private Scene scene;
	private Parent root;

	public ComboBox cbxGeoForm;
	

	public void initialize()
	{
		cbxGeoForm.getItems().add("Circle");
		cbxGeoForm.getItems().add("Square");
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
		else if (mouseEvent.getButton() == MouseButton.MIDDLE)
		{
			gpShapes.getChildren().clear();
		}
		else{
			try
			{
				switch (cbxGeoForm.getValue().toString())
				{
					case "Circle":
						Circle circle = new Circle(mouseEvent.getX(), mouseEvent.getY(), sldSize.getValue(),
								cpForm.getValue());
						gpShapes.getChildren().add(circle);
						break;
					case "Square":
						Rectangle rect = new Rectangle(mouseEvent.getX(), mouseEvent.getY(), sldSize.getValue(),
								sldSize.getValue());
						rect.setFill(cpForm.getValue());
						gpShapes.getChildren().add(rect);
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

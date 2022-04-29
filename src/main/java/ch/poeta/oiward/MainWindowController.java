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
	public Slider sldLengthX;
	public Slider sldLengthY;
	private Stage stage;
	private Scene scene;
	private Parent root;

	public ComboBox<String> cbxGeoForm;
	

	public void initialize()
	{
		cbxGeoForm.getItems().add("Circle");
		cbxGeoForm.getItems().add("Square");
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
		else if (mouseEvent.getButton() == MouseButton.MIDDLE)
		{
			gpShapes.getChildren().clear();
		}
		else{
			try
			{
				switch (cbxGeoForm.getValue())
				{
					case "Circle":
						disableSliders(true);

						Circle circle = new Circle(mouseEvent.getX(), mouseEvent.getY(), sldSize.getValue(),
								cpForm.getValue());

						gpShapes.getChildren().add(circle);
						break;
					case "Square":
						disableSliders(true);

						Rectangle square = new Rectangle(mouseEvent.getX() - (sldSize.getValue() / 2),
								mouseEvent.getY() - (sldSize.getValue() / 2), sldSize.getValue(), sldSize.getValue());
						square.setFill(cpForm.getValue());
						gpShapes.getChildren().add(square);
						break;
					case "Ellipse":
						disableSliders(false);
						break;
					case "Rectangle":
						disableSliders(false);

						Rectangle rect = new Rectangle(mouseEvent.getX() - (sldLengthX.getValue() / 2),
								mouseEvent.getY() - (sldLengthY.getValue() / 2), sldLengthX.getValue(),
								sldLengthY.getValue());
						rect.setFill(cpForm.getValue());
						gpShapes.getChildren().add(rect);

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

	public void disableSliders(boolean needsOneParameter)
	{
		if (needsOneParameter)
		{
			sldSize.setDisable(false);
			sldLengthX.setDisable(true);
			sldLengthY.setDisable(true);
		}
		else
		{
			sldSize.setDisable(true);
			sldLengthX.setDisable(false);
			sldLengthY.setDisable(false);
		}
	}






}

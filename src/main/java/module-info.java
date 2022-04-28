module ch.poeta.oiward {
	requires javafx.controls;
	requires javafx.fxml;

	opens ch.poeta.oiward to javafx.fxml;
	exports ch.poeta.oiward;
}
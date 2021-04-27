package com.example.mitfahrer;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class View {
	private Stage primaryStage;
	private Model model;

	public View(Stage primaryStage, Model model) {
		this.primaryStage = primaryStage;
		this.model = model;
		initKomponenten();
	}

	/**
	 * Only for tests
	 */
	public View() {
		
		
	}

	private GridPane pane = new GridPane();
	private Label lblEingabe = new Label("Gebe deine Suche auf");
	private Label lblName = new Label("Mitfahrername:");
	private Label lblDateofJourney = new Label("Datum der Reise:");
	private Label lblTimeOfJourney = new Label("Uhrzeit der Reise:");
	private Label lblDestinationOfJourney = new Label("Ziel der Reise:");
	private Label lblPayment = new Label("Bezahlung:");
	private TextField txtName = new TextField();
	private TextField txtDateofJourney = new TextField();
	private TextField txtTimeOfJourney = new TextField();
	private TextField txtDestinationOfJourney = new TextField();
	private TextField txtPayment = new TextField();
	private TextArea txt = new TextArea();
	private Button btnEingabe = new Button("Aufgeben");
	// -------Ende Attribute der grafischen Oberflaeche-------

	private void initKomponenten() {
		pane.setPadding(new Insets(2,2,2,2));
		Font font = new Font("Arial", 24);
		lblEingabe.setFont(font);
		lblEingabe.setStyle("-fx-font-weight: bold;");
		pane.add(lblEingabe, 0,0,4,1);
		// Textfelder
        pane.add(lblName, 0, 1,2,1);
        pane.add(lblDateofJourney, 0, 2,2,1);
        pane.add(lblTimeOfJourney, 0, 3,2,1);
        pane.add(lblDestinationOfJourney,0, 4,2,1);
        pane.add(lblPayment, 0,5,2,1);
		// Textbereich
        pane.add(txtName, 2, 1);
        pane.add(txtDateofJourney, 2, 2);
        pane.add(txtTimeOfJourney, 2, 3);
        pane.add(txtDestinationOfJourney, 2, 4);
        pane.add(txtPayment, 2, 5);
        pane.add(txt, 3,1,4,6);
        txt.setEditable(false);
        txt.setWrapText(true);
		// Knöpfe
        pane.add(btnEingabe,1,6,2,1);
		Scene scene = new Scene(this.pane, 640, 240)
				;
		primaryStage.setScene(scene);
		primaryStage.setTitle("Mitfahrender sucht Mitfahrer");
		primaryStage.show();
	}

	

	private void zeigeInformationsfensterAn(String meldung) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setContentText(meldung);
		alert.showAndWait();
	}

	private void zeigeFehlermeldungAn(String meldung) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Fehlermeldung");
		alert.setContentText(meldung);
		alert.showAndWait();
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Button getBtnEingabe() {
		return btnEingabe;
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public Model getModel() {
		return model;
	}

	public GridPane getPane() {
		return pane;
	}

	public Label getLblEingabe() {
		return lblEingabe;
	}

	public Label getLblName() {
		return lblName;
	}

	public Label getLblDateofJourney() {
		return lblDateofJourney;
	}

	public Label getLblTimeOfJourney() {
		return lblTimeOfJourney;
	}

	public Label getLblDestinationOfJourney() {
		return lblDestinationOfJourney;
	}

	public Label getLblPayment() {
		return lblPayment;
	}

	public TextField getTxtName() {
		return txtName;
	}

	public TextField getTxtDateofJourney() {
		return txtDateofJourney;
	}

	public TextField getTxtTimeOfJourney() {
		return txtTimeOfJourney;
	}

	public TextField getTxtDestinationOfJourney() {
		return txtDestinationOfJourney;
	}

	public TextField getTxtPayment() {
		return txtPayment;
	}

	public TextArea getTxt() {
		return txt;
	}
	

	

}


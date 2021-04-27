package com.example.mitfahrer;

import com.example.mitfahrer.Model.PaymentMethodes;

import javafx.stage.Stage;

public class Control {

	public static final String ANFRAGE_AKZEPTIERT = "Ihre Anfrage auf einen Fahrer wurde aufgegeben.";
	public static final String KEIN_VALIDE_RECHNUNG = "Keine valide Rechnungsoption.";
	public static final String EINGABE_NICHT_BEFUELLT = "Die Eingabe ist noch nicht vollständig befüllt.";
	private View view;
	private Model model;

	public Control(Stage primaryStage) {
		this.model = Model.getInstance();
		this.view = new View(primaryStage, model);
		initListeners();
	}

	// Only for TESTS!
	public Control() {
		
	}

	private void initListeners() {
		view.getBtnEingabe().setOnAction(aEvent -> {
			pruefeEingaben();
		});

	}

	public boolean sendToServerForValidification(Request re) throws Exception {

		if (re.getTime().isEmpty() || re.getDate().isEmpty() || re.getName().isEmpty() || re.getDestination().isEmpty()||re.getMethode().isEmpty())
			throw new Exception(EINGABE_NICHT_BEFUELLT);
		try {
			if (PaymentMethodes.valueOf(re.getMethode().toUpperCase()) != null) {
				for (int i = 0; i < 20; i++)
					System.out.println();
				System.out.println("Request wird an den Server geschickt:....");
				System.out.println("Warten warten...");
				System.out.println("Folgendes wird verschickt: "+re.toString());
				System.out.println("Erfolgreich verschickt!");
				return true;
			}
		} catch (Exception e) {
			throw new Exception(KEIN_VALIDE_RECHNUNG);
		}
		return false;
	}

	public void pruefeEingaben() {
		try {
			sendToServerForValidification(
					Request.builder().name(view.getTxtName().getText()).date(view.getTxtDateofJourney().getText())
							.time(view.getTxtTimeOfJourney().getText()).methode(view.getTxtPayment().getText())
							.destination(view.getTxtDestinationOfJourney().getText()).build());
			view.getTxt().setText(ANFRAGE_AKZEPTIERT);
			view.getTxtDateofJourney().clear();
			view.getTxtDestinationOfJourney().clear();
			view.getTxtName().clear();
			view.getTxtPayment().clear();
			view.getTxtTimeOfJourney().clear();
		} catch (Exception e) {
			view.getTxt().setText(e.getMessage());
		}
	}

	public View getView() {
		return view;
	}

	public Model getModel() {
		return model;
	}

}

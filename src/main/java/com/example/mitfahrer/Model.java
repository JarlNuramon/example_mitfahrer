package com.example.mitfahrer;


public class Model {

	public enum PaymentMethodes{
		CASH,PAYPAL,KLARNA,LASTSCHRIFT, //RECHNUNG
	}
	private Model() {

	}

	private static Model instance = null;

	public static Model getInstance() {
		if (instance == null)
			instance = new Model();
		return instance;

	}
}

package com.example.mitfahrer;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.*;


import com.example.mitfahrer.Model.PaymentMethodes;

import javafx.stage.Stage;

/**
 * Unit test for simple App.
 */

public class EingabeTest  {
	
		private Control c;
		private Request r;
		@BeforeEach
		public void setUp() {
			c = new Control();
			 r = Request.builder().name("generic").destination("Münster").time("7:06").date("25.04.2021").methode("").build();
		}
	
	    @DisplayName("Payment ist nicht gefüllt")
	    @Test
	    public void testNotFilled( ) {
	    	Exception exception = assertThrows(Exception.class,()->c.sendToServerForValidification(r));
		    Assertions.assertTrue(exception.getMessage().equals(Control.EINGABE_NICHT_BEFUELLT), "");
	    }
	    @DisplayName("Payment ist Paypal")
	    @Test
	    public void testPaypal() {
	    	r.setMethode("PayPal");
		      try {
				Assertions.assertTrue(c.sendToServerForValidification(r));
			} catch (Exception e) {
				Assertions.fail("Failed in Paypal");
			}
	    }

	    @DisplayName("Payment ist KLARNA")
	    @Test
	    public void textKlarna() {
	    	r.setMethode("Klarna");
		      try {
				Assertions.assertTrue(c.sendToServerForValidification(r));
			} catch (Exception e) {
				Assertions.fail("Failed in Klarna");
			}
	    }
	    @DisplayName("Payment ist RECHNUNG")
	    @Test
	    public void testRechnung() {
	    	r.setMethode("Rechnung");
		      try {
				Assertions.assertTrue(c.sendToServerForValidification(r));
			} catch (Exception e) {
				Assertions.fail("Failed in Rechnung");
			}
	    }
	    @DisplayName("Payment ist Cash")
	    @Test
	    public void testCash() {
	    	r.setMethode("Cash");
		      try {
				Assertions.assertTrue(c.sendToServerForValidification(r));
			} catch (Exception e) {
				Assertions.fail("Failed in Cash");
			}
	    }
	    @DisplayName("Payment ist Lastschrift")
	    @Test
	    public void testLastschrfit() {
	    	r.setMethode("Lastschrift");
		      try {
				Assertions.assertTrue(c.sendToServerForValidification(r));
			} catch (Exception e) {
				Assertions.fail("Failed in Lastschrift");
			}
	    }
	    @AfterEach
	    public void tearDown() {
	       c = null;
	    }

	
		
}

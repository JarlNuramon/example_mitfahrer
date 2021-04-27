package com.example.mitfahrer;



import com.example.mitfahrer.Model.PaymentMethodes;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Request {
	private String name;
	private String time;
	private String date;
	private String destination;
	private String methode;
	
}

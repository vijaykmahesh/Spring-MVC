package com.express.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.express.lc.dto.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {

		System.out.println("Inside PhoneFormatter Print()");

		return phone.getCountryCode() + "-" + phone.getUserNumber();

	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		// convert one datatype to another

		Phone phone = new Phone();

		String[] phoneNumberarray = completePhoneNumber.split("-");

		System.out.println("Parse is executing");

		// Splitting the string received from the user
		int index = completePhoneNumber.indexOf('-');

		// whether Number consist of -
		if (index == -1 || completePhoneNumber.startsWith("-")) {
			// if - is not found then add 91 as a default code

			phone.setCountryCode("91");
			phone.setUserNumber(phoneNumberarray[0]);
		}

		else {
			
			// Extract the countrycode and set to phone class of countrycode
			phone.setCountryCode(phoneNumberarray[0]);
			phone.setUserNumber(phoneNumberarray[1]);

		}
		return phone;
	}

}

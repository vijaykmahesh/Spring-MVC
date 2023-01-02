package com.express.lc.customannotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower;

	private int upper;

	public void initialize(Age age) {

		// i can write post construct work right here i,e we will do intialization part
		// here
		// to capture default value entered in annotation
		//only once this method will be executed 2nd tym directly isValid() will be executed since intialization is already done.
		
		System.out.println("initialize method of custom age validator");
		
		this.lower = age.lower();
		this.upper = age.upper();

	}

	;

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub

		// write logic here
		// values entered by user in form should be taken.
		
		System.out.println("isValid method of custom age validator");

		if (age == null) {
			return false;
		}

		if (age < lower || age > upper) {
			return false;// fail
		} else

			return true;// pass
	}

}

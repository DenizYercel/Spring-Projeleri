package com.deniz.validationn;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = RestDayValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface RestDay {
	// default rest day
	public String value() default "Sunday";
	
	// default error message
	public String message() default "Valid days are : Monday,....,Sunday";
	
	// default groups, ilgili constraintleri gruplamak için
	public Class<?>[] groups() default {};
	
	// default payloads, validasyonun gerçekleþmemesi nedeni için detaylar, severity level, error code,vs.
	public Class<? extends Payload>[] payload() default{};
}
/*
 * Created on 13 janv. 2014 ( Time 12:02:48 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */

package org.demo.validator;

import org.demo.bean.Review ;
import org.demo.common.MessagesKeys;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

/**
 * Validator for entity Review
 * 
 * @author Telosys Tools Generator
 *
 */
public class ReviewValidator extends AbstractValidator<Review>{

    @Override
    public void validateEntity(Review entity, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "customerCode", MessagesKeys.ID_MUST_DEFINE);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bookId", MessagesKeys.ID_MUST_DEFINE);


    }
}
package com.crescendocollective.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.crescendocollective.model.User;

@Component
public class UserValidator implements Validator {
//    @Autowired
//    @Qualifier("emailValidator")
//    EmailValidator emailValidator;

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        User user = (User) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "NotEmpty.contactForm.name");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "NotEmpty.contactForm.name");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.contactForm.email");

//        if (!emailValidator.valid(user.getEmail())) {
//            errors.rejectValue("email", "Pattern.contactForm.email");
//        }
    }
}

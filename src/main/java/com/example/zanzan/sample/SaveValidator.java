package com.example.zanzan.sample;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SaveValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
    @Override
    public void validate(Object target, Errors errors) {
        SaveForm saveForm = (SaveForm) target;
        // <**> は禁止
        if(saveForm.name.startsWith("<") && saveForm.name.endsWith(">")){
            errors.rejectValue("name", "error.required", "不正な文字列が含まれています。");
        }
    }
}

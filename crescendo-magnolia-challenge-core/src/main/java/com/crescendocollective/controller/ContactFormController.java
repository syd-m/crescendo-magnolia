package com.crescendocollective.controller;

import com.crescendocollective.model.User;
import com.crescendocollective.validator.UserValidator;
import info.magnolia.module.blossom.annotation.Area;
import info.magnolia.module.blossom.annotation.Template;
import info.magnolia.module.blossom.annotation.TemplateDescription;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;

//myModuleName: crescendo-magnolia-challenge

@Template(id = "crescendo-magnolia-challenge:components/contact/contactForm", title = "ContactUs 123")
@TemplateDescription("Adds a contact us form")
@Controller
//@RequestMapping("/")
public class ContactFormController {

//    @Autowired
//    UserValidator userValidator;
//
////    Set a form validator
//    @InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        binder.setValidator(userValidator);
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void doSomething(){
        System.out.print("test");
    }

//    @Controller
//    @Area("main")
//    public static class MainArea{
//        @RequestMapping("/main/mainArea")
//        public String render(){
//            return
//        }
//    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String getContactForm(@ModelAttribute("contactForm") User user) {
//        ModelAndView view = new ModelAndView("contactForm");
//        view.addObject("contactForm", new User());
        System.out.print("getContactForm");
        return "components/contact/contactForm";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String sendEmail(@ModelAttribute("contactForm") User user){
        // TODO: 1/12/18
        System.out.print("sendEmail");
//        userValidator.validate(user, result);
//        if(result.hasErrors()){
//            return "components/contact/contactForm";
//        }

        return "redirect:/contact/thankyou.html";
    }
}

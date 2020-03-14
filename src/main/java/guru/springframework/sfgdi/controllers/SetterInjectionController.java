package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class SetterInjectionController {
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

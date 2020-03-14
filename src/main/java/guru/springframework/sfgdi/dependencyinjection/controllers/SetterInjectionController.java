package guru.springframework.sfgdi.dependencyinjection.controllers;

import guru.springframework.sfgdi.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

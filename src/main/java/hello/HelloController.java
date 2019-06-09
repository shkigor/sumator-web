package hello;

import model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Hello from Spring Boot!!!";
    }

    @RequestMapping("/json")
    public Person json() {
        Person person = new Person();
        person.setId(1L);
        person.setName("Сергей Иванович");
        return person;
    }
}

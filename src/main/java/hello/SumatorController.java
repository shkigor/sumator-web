package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SumatorController {

    @GetMapping("/sumator")
    public String index() {
        return "sumator";
    }
}

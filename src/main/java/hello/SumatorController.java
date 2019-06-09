package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumatorController {

    @GetMapping("/sumator")
    public String index() {
        return "sumator/index";
    }

    @PostMapping("/sumator")
    public String calculate(@RequestParam String number1, @RequestParam String number2, Model model) {
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);

        double result = Double.parseDouble(number1) + Double.parseDouble(number2);
        model.addAttribute("result", result);
        return "sumator/index";
    }
}

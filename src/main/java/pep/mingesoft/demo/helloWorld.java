package pep.mingesoft.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

    @RequestMapping("/")
    public String holaMundo() {
        return "Hola Mundo, soy una aplicacion web super simple";
    }

}

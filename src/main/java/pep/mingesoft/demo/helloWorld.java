package pep.mingesoft.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

        @RequestMapping("/")
        public String holaMundo() {
                int b = 3;
                int c = 6;
                String var = " Version";
                return "Hola Chile, soy una aplicacion web super simple: " + (b + c * 3) + var;
        }

}

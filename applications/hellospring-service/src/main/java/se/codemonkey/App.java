package se.codemonkey;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class App {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
      return "Hello Spring";
    }

    public static void main(String[] args) throws Exception {
      SpringApplication.run(App.class, args);
    }
}

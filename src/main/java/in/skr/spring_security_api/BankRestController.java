package in.skr.spring_security_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
    @GetMapping("/")
    public String welcome(){
            return "welcome to SBI Bank....!!";
        }
    @GetMapping("/transfer")
    public String transfer(){
            return "welcome to SBI Bank transfer....!!";
        }
    @GetMapping("/balance")
    public String balance(){
            return "welcome to SBI Bank balance....!!";
        }
    @GetMapping("/about")
    public String about(){
            return "welcome to SBI Bank about....!!";
        }
    }
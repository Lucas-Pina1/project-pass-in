package rocketseat.com.passin.controlers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendee")
public class AttendeeController {

    @GetMapping
    public ResponseEntity<String> getTeste(){
        return ResponseEntity.ok("sucesso!");
    }
}

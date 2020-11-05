package io.springlab.awscicdspringbootinit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/cicdapps")
public class GenericMessageController {

    @GetMapping("/ping")
    public String getGenericMessage(){
        return "Instance :"+ UUID.randomUUID()+" displaying the date for you::"+new Date();
    }
}
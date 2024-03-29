package de.slacknet.spring.cloud.client.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author SzudraB
 */
@Controller
@Profile("operand")
public class OperandController {
    
	@GetMapping("/")
    public @ResponseBody String getOperand() {
        return "" + ThreadLocalRandom.current().nextInt(0, 101);
    }
}

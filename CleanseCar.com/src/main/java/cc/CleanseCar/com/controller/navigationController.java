package cc.CleanseCar.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class navigationController {

	
	@GetMapping(value="/")
    public String home(){
        return "webpages/index";
    }
	
	@GetMapping(value="/index")
    public String index(){
        return "webpages/index";
    }
	
	@GetMapping(value="/fbRequestsForm")
    public String fbRequestsForm(){
        return "webpages/fbRequestsForm";
    }
	
	
	
}






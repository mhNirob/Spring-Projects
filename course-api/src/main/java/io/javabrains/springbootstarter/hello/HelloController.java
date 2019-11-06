package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* two annotations 
 * scan every class on class path with annotations
 * controller mapping
 * */

@RestController

public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
}

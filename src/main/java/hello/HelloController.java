package hello;

import org.springframework.web.bind.annotation.RestController;

import dao.daoUtil;

import java.sql.Connection;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	
	Connection connection=daoUtil.getConnection();
	
	
    @RequestMapping("/")
    public String index() {
    	
    
        return "Greetings from Spring Boot!";
    }
    
}

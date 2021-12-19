package  com.example.codebuffer.codebuffer;

import javax.websocket.server.PathParam;

//import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/{name}")
	public String select(@PathParam("name") String name) {
	   String outPt = "<h1> hi hlo</h1>";
		
		return outPt;
		
	}
	

}

package AKS.AKSClusterApp;

import org.springframework.web.bind.annotation.GetMapping;

public class RestController {
	
	@GetMapping("/getMessageFromAKS")
	public String getMessage() {
	      return "New Test Msg.";
	}

}

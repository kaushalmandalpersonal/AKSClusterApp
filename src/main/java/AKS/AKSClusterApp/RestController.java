package AKS.AKSClusterApp;

import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/getMessageFromAKS")
	public String getMessage() {
	      return "New Test Msg.";
	}

}

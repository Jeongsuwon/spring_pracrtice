package customer;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller @RequestMapping("customer")
public class CustomerController {
	
	
	//고객 목록화면 요청
	@RequestMapping("/list")
	public String list(HttpSession session, Model model) {
		session.setAttribute("category", "cu");
		return "customer/list";
	}
}

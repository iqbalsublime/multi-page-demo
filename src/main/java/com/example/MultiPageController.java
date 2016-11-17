package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @author Bazlur Rahman Rokon
 * @since 11/17/16.
 */
@Controller
@SessionAttributes(value = "user", types = {User.class})
public class MultiPageController {

	@RequestMapping(value = {"/", "doSomething"})
	public String doSomething(User user) {

		return "doSomething";
	}

	@PostMapping("/doSomethingElse")
	public String doSomethingElse(User user) {

		return "doSomethingElse";
	}

	@PostMapping("/endSession")
	public String endSession(SessionStatus status, User user) {
		status.setComplete();

		return "endSession";
	}

}

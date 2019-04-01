/**
 * 
 */
package com.devops.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author cvred
 *
 */
@Controller
public class HelloWorldController {

	public String sayHello() {
		return "index";
	}
}

package com.amdocs.RestAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class Calculator 
{
	@GetMapping("additoin")
	@ResponseBody
	public double addition( @RequestParam double firstOperand, @RequestParam double secondOperand)
	{
		return firstOperand+secondOperand;
	}
}

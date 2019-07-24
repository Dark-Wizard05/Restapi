Feature: Calculator features
	Scenario: Doing addition
		Given A rest API "http://localhost:8080/addition?firstOperand=20&secondOperand=20"
		When invoking the rest API
		Then give the result as 40

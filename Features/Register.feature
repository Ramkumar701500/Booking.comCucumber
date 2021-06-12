Feature: Register Module

	Scenario: Register using valid email address and valid password
	    Given Launch the browser (register page)
	    And Open the register url "https://account.booking.com/register"
	    Then Enter valid email address as "dfhxdfhj3@gmail.com" (register page)
		And Click on continue button (register page)
	    Then Enter valid password as "Abcde@11111" (register page)
	    And Confirm same password as "Abcde@11111" 
	    Then Click on create account button
	    
	Scenario: Register using invalid email address
	    Given Launch the browser (register page)
	    And Open the register url "https://account.booking.com/register"
	    Then Enter invalid email address as "Ramkumar71000@vgf" (register page)
	    And Click on continue button (register page)
	      
	Scenario: Register using valid email address and invalid password
	    Given Launch the browser (register page)
	    And Open the register url "https://account.booking.com/register"
	    Then Enter valid email address as "dfhxdfhj4@gmail.com" (register page)
		And Click on continue button (register page)
	    Then Enter invalid password as "nscs1221" (register page)
	    And Confirm same password as "nscs1221"
	    Then Click on create account button	

	Scenario: Register using blank email address
	    Given Launch the browser (register page)
	    And Open the register url "https://account.booking.com/register"
	    Then Enter blank email address as "" (register page)
		And Click on continue button (register page)

	Scenario: Check whether the Terms & conditions link is working or not
	    Given Launch the browser (register page)
	    And Open the register url "https://account.booking.com/register"
	    Then Click on Terms & conditions link (register page)
	    
	Scenario: Check whether the Privacy statement link is working or not
	    Given Launch the browser (register page)
	    And Open the register url "https://account.booking.com/register"
	    Then Click on Click on Privacy statement link (register page)


	    
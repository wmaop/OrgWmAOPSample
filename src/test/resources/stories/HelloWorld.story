Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario: Concatenate two strings
Given pipeline values inString1 = "hello"; inString2 = " world"
When invoke pub.string:concat without idata
Then pipeline has value == "hello world"

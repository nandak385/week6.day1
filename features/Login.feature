#Feature: Login functionality of LeafTaps application
##Scenario: TC001_Login test using positive credentials
##Background:
##Given Open the Chrome browser
##And Load the application 'http://leaftaps.com/opentaps'
#
#@functional
#Scenario Outline: TCTL001_Login test using positive credentials
#
##Given Enter the username as 'DemoSalesManager'
##Given Enter the password as 'crmsfa'
#Given Enter the username as <username>
#Given Enter the password as <password>
#When Click on login button
#Then Homepage should be displayed
#When Click on CRMSFA 
#When Click on Leads link
#
#Examples:
#|username|password|
#|'Demosalesmanager'|'crmsfa'|
#|'DemoCSR'|'crmsfa'|
#
#@smoke
#Scenario: TCTL002_Login test using negative credentials
#Given Enter the username as 'Demo123'
#Given Enter the password as 'crmsfa'
#When Click on login button
#Then Error message should be Invalid username or password
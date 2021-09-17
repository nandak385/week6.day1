Feature: Merge Leads functionality check in LeafTaps application
Scenario Outline: TCTL005_Merge two leads for positive functionality test 

Given Click_on 'Merge Leads' link
And Click on the Lookup icon '1' child window opens
And Enter first name as <FirstName1> and click on Find Leads button
And Select the first row and save the lead id
And Click on the Lookup icon '2' child window opens
And Enter first name as <FirstName2> and click on Find Leads button
And Select the first row
And Click on Merge button and click ok on the popup
And Click_on 'Find Leads' link
When Enter lead id and click Find leads
Then Verify whether the Lead ID is still available

Examples:
|FirstName1|FirstName2|
|'Hari'|'R'|
|'R'|'Hari'|
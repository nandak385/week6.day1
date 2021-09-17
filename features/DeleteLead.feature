Feature: Delete Leads functionality check in LeafTaps application
Scenario Outline: TCTL007_Delete leads for positive functionality test 

Given ClickOn 'Find Leads'
And Click on Phone number tab and enter the <PhoneNumber>
And Click Find Leads button
And Select the first row and store the Lead ID
And ClickOn 'Delete'
And ClickOn 'Find Leads'
When Enter Lead ID and Click Find Leads
Then Verify whether the Lead ID is available

Examples:
|PhoneNumber|
|'99'|
|'98'|
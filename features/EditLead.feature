Feature: Edit Leads functionality of LeafTaps application
Scenario Outline: TCTL003_Editing multiple leads for positive functionality test
Given Click on the 'Find Leads' link
And Click on Phone tab
And Enter the Phone Number as <PhoneNumber>
And Click on Find lead button
And Click on First Lead link
And Click on 'Edit' link
And Enter the Company Name as <CompanyName>
When Click on Submit button
Then Verify the Portlet name

Examples:
|CompanyName|PhoneNumber|
|'CTS'|'99'|
|'TestLeaf'|'98'|

Scenario Outline: TCTL004_Edit lead without updating for positive functionality test
Given Click on the 'Find Leads' link
And Click on Phone tab
And Enter the Phone Number as <PhoneNumber>
And Click on Find lead button
And Click on First Lead link
When Click on 'Edit' link
Then Click on 'Submit' button

Examples:
|PhoneNumber|
|'98'|
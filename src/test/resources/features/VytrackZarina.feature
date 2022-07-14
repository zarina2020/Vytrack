Feature: Default

	#User Story:
	#
	#US: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Refresh, button
  @B26G31-48
  Scenario: User should see the Reset button
    Given User on the "Vehicles"page
    Then User should be able to click the "Reset" button
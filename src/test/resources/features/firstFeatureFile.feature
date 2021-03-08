" 1. As a user I should be able to make a reservation on Book it application Under “Hunt” module.

Acceptance Criteria :
1. Verify the team lead or a teacher should be able to make a reservation
2. Verify that authorized user can reserve only one room maximum per day
3. Verify that authorized user can cancel the reserved room at any time
4. Verify that during the reservation, authorized users can only book the room for future hours, and the system
should not allow the User to book a passed time/date. "

Feature: Reservation on BookIT

  As a user I should be able to make a reservation on Book it application Under “Hunt” module.

  Scenario: Reservation under HUNT module
    Given user is on the landing page
    When user logs in with "efewtrell8c@craigslist.org" and "jamesmay" credentials
    Then user navigates to "hunt" module
    And user click on date_dropDown
    Then user enter
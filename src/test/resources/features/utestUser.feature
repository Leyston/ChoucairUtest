# Autor: LeystonOñate

  @stories
  Feature: Utest
    As a user, I want to create a account in the page of Utest.com
  @scenario1
  Scenario Outline: Create a new user account
    Given Than alex wants to be a new user in Utest
    When He tries to join today
      | srtFirstName   | srtLastName   | srtEmail   | srtMonthOfBirth   | srtDayOfBirth   | srtYearOfBirth   | srtPassword   |
      | <srtFirstName> | <srtLastName> | <srtEmail> | <srtMonthOfBirth> | <srtDayOfBirth> | <srtYearOfBirth> | <srtPassword> |

    Then he creates an account
    Examples:
      | srtFirstName | srtLastName | srtEmail              | srtMonthOfBirth | srtDayOfBirth | srtYearOfBirth | srtPassword     |
      | Leyston      | Onate       | leyston52@hotmail.com | May               | 2             | 1996           | QUFyN5Zr!Wjr8mF |

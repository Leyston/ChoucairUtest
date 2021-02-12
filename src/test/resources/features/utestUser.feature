# Autor: LeystonOñate

  @stories
  Feature: Utest
    As a user, I want to create a account in the page of Utest.com
  @scenario1
  Scenario Outline: Create a new user account
    Given Than alex wants to be a new user in Utest
    When He tries to join today
      | srtFirstName   | srtLastName   | srtEmail   | srtMonthOfBirth   | srtDayOfBirth   | srtYearOfBirth   | srtPassword   | srtCity   | srtZip   | srtCountry   | srtOS   | srtOSVersion   | srtOSLanguage   |
      | <srtFirstName> | <srtLastName> | <srtEmail> | <srtMonthOfBirth> | <srtDayOfBirth> | <srtYearOfBirth> | <srtPassword> | <srtCity> | <srtZip> | <srtCountry> | <srtOS> | <srtOSVersion> | <srtOSLanguage> |

    Then he creates an account

    Examples:
      | srtFirstName | srtLastName | srtEmail                   | srtMonthOfBirth | srtDayOfBirth | srtYearOfBirth | srtPassword     | srtCity    | srtZip | srtCountry | srtOS   | srtOSVersion | srtOSLanguage |
      | Leyston      | Onate       | testingutestpage@gmail.com | May             | 2             | 1996           | TMFm2#aRb*fMrd6 | Los Patios | 541010 | Colombia   | Windows | 10 64-bit    | English       |

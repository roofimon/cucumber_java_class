Feature: Fizzbuzz

  Scenario Outline: Normal integer
    Given We want to count normal value with Fizzbuzz
    When I count <number>
    Then I got in <number_in_string>

    Examples: normal integer
      | number | number_in_string |
      | 1      |  "1"             |
      | 2      |  "2"             |
      | 4      |  "4"             |

    Examples: modulo by three integer
      | number | number_in_string |
      | 3      |  "Fizz"          |
      | 6      |  "Fizz"          |
      | 9      |  "Fizz"          |

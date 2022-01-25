Feature: dividing
  Check the if number can be divided by specific numbers

  Scenario Outline: Can number be divided
    Given number is <number>
    When Is it dividable by 3 or 5
    Then The result is <result>
    Examples:
      | number | result |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 2 | "Not dividable" |
      | 45  | "FizzBuzz"     |
      | 9  | "Fizz"     |
      | 10  | "Buzz"     |

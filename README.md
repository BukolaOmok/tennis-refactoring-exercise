## Debrief
I attempted this java version of the tennis task. Out of the six files, I was able to complete 2 and got started with a third one

Completed
- TennisGame3
- TennisGame6

Commenced
- TennisGame1

Not attempted
- TennisGame2
- TennisGame4
- TennisGame5

## Issues Spotted and how they were refactored and why the refactor was important
1. ***Poor variable naming***:
   - Issue: For instance TennisGame1 named player score variable "m_score1". This makes the code difficult to understand at a glance.
   - Refactor: I renamed variables to more descriptive names such as player1Score and player2Score. 
   - Why it was important: This improved readability and made the code more intuitive.
   
2. ***Use of poor comparison method***:
   - Issue: For instance in the wonPoint() method in TennisGame3, the author wanted to compare whether playerName is equal to player1Name and used "=". Best practice is to use equals()
   - Refactor: I replaced == with the proper equals() method for comparing strings.
   - Why it was important: It helps to make the code more maintainable and easier to debug

3. ***Hard-coding***: 
   - Issue: For instance, "Player 1" was hard-coded as a parameter into the wonPoint() method. This is not maintainable
   - Refactor:  I removed the hard-coded string and instead used the player1Name variable. 
   - Why it was important: This makes the code adaptable to any player name passed during initialisation and it helps for easier debugging
   
4. ***Too much logic lumped into one method***: 
   - Issue: I saw his in virtually all the files.Methods like getScore() had too much logic lumped together, making the code hard to understand and maintain.
   - Refactor:  I decomposed large methods like getScore() into smaller, more focused methods (isNormalRound(), differentScore(), deuceScore()).
   - Why it was important: It makes each method easier to read, test, and maintain.





* How did it feel to work with such fast, comprehensive tests?
* Did you make mistakes while refactoring that were caught by the tests?
* If you used a tool to record your test runs, review it. Could you have taken smaller steps? Made fewer refactoring mistakes?
* Did you ever make any refactoring mistakes and then back out your changes? How did it feel to throw away code?
* What would you say to your colleague if they had written this code?
* What would you say to your boss about the value of this refactoring work? Was there more reason to do it over and above the extra billable hour or so?

## Code Reading Practice
Test your code reading skills. Here is a description of what to do: [Scanning for Code Smells](https://sammancoaching.org/exercises/code_reading.html). There are suitable lists of urls to open in some of the language subdirectories.

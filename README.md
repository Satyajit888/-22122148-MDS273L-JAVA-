Write a JAVA program that reads a file (text file) and finds the following details.
Vowels and their count. Eg: [a:100, e:45, I:55, ..]
Digits and their count. Eg: [0:1000, 1:10, 2:40, ...]
Top Five repeated words and their count.
Least Five repeated words and their count.
Top Five repeated characters and their count.
Least FIve repeated characters and their count.
Note:
Use the file attached.
Use functions to implement the six functions asked.
Pass the file content to the functions and return the values accordingly.
No Global variables are allowed to be used.
Additional Task [htmlFile.txt]:
You have been given an HTML file; from the HTML File, identify the Top categories, display it to the user, and write the content to the file.

STEPS:

*Open the file and read it line by line.
*Initialize the variables for the count of vowels, digits, and characters.
*For each line in the file:
*a. Convert the line to lower case using the toLowerCase() method.
*b. Traverse each character of the line using a for loop.
*c. Check if the character is a vowel using the switch case statement and increment the count for the *vowel.
*d. Check if the character is a digit using the isDigit() method and increment the count for the digit.
*e. Count the occurrence of each character using the indexOf() method and increment the count of the *character.
*f. Split the line into words using the split() method and store them in an array.
*g. Traverse the array of words and count the occurrence of each word.
*Sort the word and character counts in descending order.
*Print the top 5 repeated words, least 5 repeated words, top 5 repeated characters, and least 5 repeated *characters along with their counts.
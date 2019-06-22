# polishParser
The assignment: write a command-line Java program that evaluates Normal Polish notation (NPN) formulas. 

- When run from the command line your program must read from standard input an NPN formula.
- You can assume there is a space between every operator and number. Every number will be a 32 bit integer.
- Your program should be able to correctly handle the operations: +, -, x.
- Your program then should write to standard out a single line with the correct output in standard integer format. The following example shows correct behaviour for your program:

  javac polishParser.java
  
  echo + 75 125 | java polishParser
  
  200 

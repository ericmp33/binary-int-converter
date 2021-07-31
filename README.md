# binary-int-converter
Exercise to practise the "manually" conversion from binary numbers to integer numbers, programmed with Java (build 14.0.2+12).

- Valid inputs✅<br>
  In this converter you can directly input your numbers to be converted. It decides if input is Binary or Integer and prints the proper conversion. Note that first checks if the number is binary, so si poses 110 pensarà que es binari, el 110 mai el traduirà a binari lol!
  
  
  Note that you can't mix both languages. Input just Latin or just Morse. Also note that if the translator can't find the translation of one single letter/character, the whole input will be marked as invalid.

- Supported characters️⌨️<br>
  Integers from `0` to `9`.



-------

the conversor first, check if it's binary, if n only contains 0s and or 1s will be considered as binary, despite can be decimal aswell

as is a positive-only conversor from int to binary and from binary to int, you must respect the int boundaries
bounds from 0 to 2147483647
bounds from 0 to 1111111111111111111111111111111
else will output unexpected input or if there is another character that is not number

# binary-int-converter🔢💾
I did this converter as an exercise to practise and understand more the convertion from binary numbers to integer numbers (and reverse), programmed with Java (build 14.0.2+12).

- How to run it?🤔<br>
  <a href="https://adoptopenjdk.net/?variant=openjdk16&jvmVariant=hotspot">Get Java☕</a> - build 14.0.2+12 or newer version and execute <a href="https://github.com/ericmp33/binary-int-converter/raw/main/out/artifacts/binary_int_converter_jar/binary-int-converter.jar">the jar</a>.

- Valid inputs✅<br>
  In this converter you can directly input your numbers without questions. The converter decides if the input is binary or integer and it prints the proper conversion. If the number is int or binary at same time, it outputs both possible conversions, else only the proper one. If a number out of int bounds is inputted or its conversion produces it, it's marked as invalid ("-1") its conversion isn't returned.

- Supported characters️⌨️<br>
  Also marks the input as invalid when detects not-numeric characters. It accepts integers from `0` to `9`.

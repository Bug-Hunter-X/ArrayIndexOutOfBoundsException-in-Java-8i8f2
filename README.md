# ArrayIndexOutOfBoundsException Bug in Java

This repository demonstrates a common error in Java: the `ArrayIndexOutOfBoundsException`.  The code attempts to access an array element beyond its valid index range, resulting in a runtime exception.

The `bug.java` file contains the erroneous code.  The `bugSolution.java` file shows the corrected code and how to avoid this exception.

This example highlights the importance of carefully considering array bounds when accessing array elements in Java.  Always ensure your loop conditions and index values are within the valid range of 0 to `array.length - 1`.
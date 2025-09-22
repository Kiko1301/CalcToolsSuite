CalcToolsSuite 🧮📐
A Java utility repository for payroll calculations, triangle validation, and number summation. Includes SalaryCalculator, TriangleValidator, and NumberSumCalculator for robust, user-friendly computations. Contributed by Kristijan Jordanovski.

---

## Features ✨

###SalaryCalculator

- Computes base salary, overtime (35%), night (35%), and holiday (250%) pay.
- Validates inputs for non-negative values.
- Displays detailed salary breakdown.

### TriangleValidator

- Validates triangles using the triangle inequality theorem.
- Classifies triangles as right, acute, or obtuse.
- Ensures robust input handling for side lengths.

### NumberSumCalculator

- Sums five numbers based on parity and divisibility rules:
- First number: adds to even/odd sum based on parity.
- Second number: adds to even sum if divisible by first, else odd sum.
- Third to fifth: adds 2 to even/odd sum based on parity.
  - Validates integer inputs.

---

## Requirements 🛠️

- Java Development Kit (JDK) 8 or higher.
- Command-line interface or IDE (e.g., IntelliJ, Eclipse).

## Installation 🔧

- Clone the repository:
  ```bash
  git clone https://github.com/<your-username>/CalcToolsSuite.git
- Navigate to the project directory:cd CalcToolsSuite
- Compile and run any program:
  ```bash
   SalaryCalculator:javac triangle/SalaryCalculator.java
   java triangle.SalaryCalculator
   TriangleValidator:javac triangle/TriangleValidator.java
   java triangle.TriangleValidator
   NumberSumCalculator:javac triangle/NumberSumCalculator.java
   java triangle.NumberSumCalculator

---

## Usage 🚀

### SalaryCalculator

- Enter base salary, total hours, night hours, and holiday hours.
- View formatted salary breakdown.
- Example:Enter base monthly salary: 1000
- Enter total hours worked: 50
- Enter total night hours worked: 10
- Enter total holiday hours worked: 5

- Salary Breakdown:
- Base Salary: $1000.00
- Overtime Pay: $87.50
- Night Pay: $87.50
- Holiday Pay: $312.50
- Total Salary: $1487.50

## TriangleValidator

- Enter three side lengths.
- Get validation and classification (right, acute, or obtuse).
- Example:Enter side A: 3
- Enter side B: 4
- Enter side C: 5

A triangle exists with the given sides.
It is a right triangle.


## NumberSumCalculator

- Enter five integers.
- Get sums of even and odd numbers based on specific rules.
- Example:Enter the first number: 4
- Enter the second number: 8
- Enter the third number: 3
- Enter the fourth number: 6
- Enter the fifth number: 5

- Sum of even numbers: 14
- Sum of odd numbers: 4

---

## Future Improvements 🔮

- Add tax calculations to SalaryCalculator.
- Support multiple employee processing.
- Add area/perimeter calculations for TriangleValidator.
- Export results to files for all programs.

---

Contributing 🤝
Fork the repository, make changes, and submit a pull request. Contributions are welcome!

---

License 📜

This project is open source under the MIT License.

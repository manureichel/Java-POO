# Java POO Exercises
This repository contains a set of Java exercises focused on Object-Oriented Programming (OOP) principles.

<details>
  <summary>Exercise 1</summary>

Create a class called `Account` that will have the following attributes: `holder` (account holder) and `amount` (amount, which can have decimals).

The `holder` is mandatory, and the `amount` is optional. Create two constructors that fulfill the above requirements.

Create its `get`, `set`, and `toString` methods.

It will have two special methods:

- `deposit(double amount)`: Adds an amount to the account. If the entered amount is negative, nothing will be done.
- `withdraw(double amount)`: Withdraws an amount from the account. If subtracting the current amount from the one passed to us is negative, the account's amount becomes 0.

</details>

<details>
  <summary>Exercise 2</summary>

Create a class called `Person` that follows the following conditions:

Its attributes are: name, age, ID, gender (M for male, F for female), weight, and height. We do not want direct access to them. Consider which access modifier is most appropriate, as well as their type. If you want to add any attributes, you can do so.
By default, all attributes except ID will be default values according to their type (0 for numbers, an empty string for String, etc.). Gender will be male by default, use a constant for this.
Several constructors will be implemented:
1. A default constructor.
2. A constructor with name, age, and gender; the rest will be set to default values.
3. A constructor with all attributes as parameters.
   The implemented methods are:
   - `calculateBMI()`: calculates if the person is at their ideal weight (weight in kg / (height in m)), if this formula returns a value less than 20, the function returns -1, if it returns a number between 20 and 25 (inclusive), it means they are below their ideal weight, the function returns 0, and if it returns a value greater than 25, it means they are overweight, and the function returns 1. It is recommended to use constants to return these values.
   - `isAdult()`: indicates if the person is of legal age, returns a boolean.
   - `checkGender(char gender)`: checks that the entered gender is correct. If it is incorrect, it will be set to H. It will not be visible externally.
   - `toString()`: returns all the information of the object.
   - `generateID()`: generates a random 8-digit number and calculates its corresponding letter. This method will be invoked when the object is constructed. You can divide the method to make it easier. It will not be visible externally.
   - Set methods for each parameter, except for ID.

Now, create an executable class that does the following:

1. Prompt the user for name, age, gender, weight, and height.
2. Create 3 objects of the above class. The first object will obtain the variables mentioned earlier from the user, the second object will obtain all the variables except weight and height, and the last one will use the set methods to give values to the attributes.
3. For each object, check if they are at their ideal weight, overweight, or below their ideal weight with a message.
4. Indicate for each object whether they are of legal age.
5. Finally, display the information for each object.

You can use methods in the executable class.
</details>

<details>
  <summary>Exercise 3</summary>

Create a class called `Password` that follows the following conditions:

- It should have the attributes `length` and `password`. By default, the length will be 8.
- The constructors will be as follows:
    1. A default constructor.
    2. A constructor with the length we pass to it. It will generate a random password with that length.

The implemented methods will be:
- `isStrong()`: returns a boolean indicating whether it is strong or not. To be strong, it must have more than 2 uppercase letters, more than 1 lowercase letter, and more than 5 numbers.
- `generatePassword()`: generates the password for the object with its current length.
- Getter method for password and length.
- Setter method for length.

Now, create an executable class:

1. Create an array of `Password` objects with the size specified by the user through the keyboard.
2. Create a loop that creates an object for each position in the array.
3. Also, input the length of the passwords through the keyboard before the loop.
4. Create another array of booleans to store whether the password from the `Password` array is strong or not (use the previous loop).
5. Finally, display the password and whether it is strong or not using the following simple format:

```
password1 boolean_value1
password2 boolean_value2
```
</details>

<details>
  <summary>Exercise 4</summary>

We will create a superclass called `Appliance` with the following characteristics:

- Its attributes are base price, color, energy consumption (letters from A to F), and weight. Specify that these can be inherited.
- By default, the color will be white, energy consumption will be F, the base price is €100, and the weight is 5 kg. Use constants for this.
- The available colors are white, black, red, blue, and gray. It doesn't matter if the name is in uppercase or lowercase.
- The implemented constructors will be:
    1. A default constructor.
    2. A constructor with the price and weight. The rest will be set to default values.
    3. A constructor with all attributes.
- The implemented methods will be:
    - Getter methods for all attributes.
    - `checkEnergyConsumption(char letter)`: checks that the letter is correct; if it's not, it will use the default letter. It will be invoked when creating the object and will not be visible.
    - `checkColor(String color)`: checks that the color is correct; if it's not, it will use the default color. It will be invoked when creating the object and will not be visible.
    - `finalPrice()`: increases the price based on energy consumption and weight. Here is the list of prices:


| Consumption | Price |
|-------------|-------|
| A           | $100  |
| B           | $80   |
| C           | $60   |
| D           | $50   |
| E           | $30   |
| F           | $10   |


| Size            | Price |
|-----------------|-------|
| 0 to 19 kg      | $10   |
| 20 to 49 kg     | $50   |
| 50 to 79 kg     | $80   |
| More than 80 kg | $100  |

We will create a subclass called `WashingMachine` with the following characteristics:

- Its attribute is `load`, in addition to the inherited attributes.
- By default, the load is 5 kg. Use a constant for this.
- The implemented constructors will be:
    1. A default constructor.
    2. A constructor with the price and weight. The rest will be set to default values.
    3. A constructor with the load and the rest of the inherited attributes. Remember to call the constructor of the parent class.
- The implemented method will be:
    - Getter method for load.
    - `finalPrice()`: if it has a load greater than 30 kg, it will increase the price by €50; otherwise, the price will not be increased. Call the parent method and add the necessary code. Remember that the conditions we have seen in the `Appliance` class should also affect the price.

We will create a subclass called `Television` with the following characteristics:

- Its attributes are `resolution` (in inches) and `TDT tuner` (boolean), in addition to the inherited attributes.
- By default, the resolution will be 20 inches, and the TDT tuner will be false.
- The implemented constructors will be:
    1. A default constructor.
    2. A constructor with the price and weight. The rest will be set to default values.
    3. A constructor with the resolution, TDT tuner, and the rest of the inherited attributes. Remember to call the constructor of the parent class.
- The implemented methods will be:
    - Getter methods for resolution and TDT tuner.
    - `finalPrice()`: if it has a resolution greater than 40 inches, the price will increase by 30%, and if it has a built-in TDT tuner, it will increase by €50. Remember that the conditions we have seen in the `Appliance` class should also affect the price.

Now create an executable class that does the following:

1. Create an array of `Appliance` with 10 positions.
2. Assign an object of the above classes to each position with the values you desire.
3. Now, iterate through this array and execute the `finalPrice()` method.
4. Display the price for each class separately, i.e., the price of all televisions on one side, the price of washing machines on the other, and the sum of all appliances (you can create `Appliance` objects, but remember that `Television` and `WashingMachine` are also appliances). Remember to use the `instanceof` operator.

For example, if we have an `Appliance` with a final price of €300, a washing machine for €200, and a television for €500, the final result will be €1000 (300 + 200 + 500) for appliances, €200 for the washing machine, and €500 for the television.


</details>
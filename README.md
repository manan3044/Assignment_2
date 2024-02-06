# Assignment 1 

## Part 1
### **Problem Statement**  
Write a Java program that declares two arrays named 'even' and 'odd'. Accept numbers from the user and move them to respective arrays depending on whether they are even or odd.

### **Description**  
This program shows the use of arrays in JAVA. In this program we will take input from user and divide the numbers into two seperate arrays. The first array being the array of even numbers and the second array being the array of odd numbers. The array will be of integer type, the size of array will also be taken from user along with the contents of the array.  
Once the array input is taken the array will be segregated into even and odd array. The output will be then displayed to the user.

### **Working**  
In this there are 3 different classes:
- ```Main.java``` : The main class accesses the methods of other 2 classes. This class starts by asking the user to enter the total elements they want in their array. Then a for loop is initiated to take the input for the elements of the array. The input is taken by the methods from ```input.java``` class. After the array is initated, the array is passed to ```numCheck.java``` class which divides the numbers to even and odd arrays and returns them to main function.
- ```input.java``` : This class has all the input methods stored in it. There are two methods in this class, the first is ```totalNumber()``` method which take integer input for the size of array. The other method is ```inputNumber()``` which takes the elements of the array.
- ```numCheck.java``` : This class checks if the number is divisible by 2 or not and then accordingly adds the number to the appropiate array.

## Part 2
### **Problem Statement**  
Implement a Java method that finds two neighboring numbers in an array with the smallest distance to each. The function should return the index of the 1st number.

### **Description**  
This program implements to find the minimum distance between two neighbouring elements of an array. In this first we make another array which stores the distance between two neighbouring elements, the size of that array will the ```size_of_array - 1```. Then from the distance array we will find the minimum distance and display the index of the element to the user. We also have applied absolute function on the distance because some distance can be negative but they should not be ignored so we will be considering them as postive values.

### **Working**  
In this there are 3 different class:
- ```Main.java``` : The main class accesses the methods of other 2 classes. This class starts by asking the user to enter the total elements they want in their array. Then a for loop is initiated to take the input for the elements of the array. The input is taken by the methods from ```input.java``` class. After the array is initated the array is passed to ```distance.java``` class which returns an array of distance between neighbouring elements. Later this same array is passed to get the minimum value from the array and the index of element is returned.
- ```input.java``` : This class has all the input methods stored in it. There are two methods in this class, the first is ```totalNumber()``` method which take integer input for the size of array. The other method is ```inputNumber()``` which takes the elements of the array.
- ```distance.java```: This class has two methods. The first method is ```distanceBetween()``` which returns an array which contains the distance between two neighbouring elements. The other method is ```minDistance()``` which returns the minimum index of the neighbours with least distance between them. 

## Part 3
### **Problem Statement**  
Write a Java program to convert an array into ArrayList and vice versa.

### **Description**  
This program shows the conversion between array and ArrayList of JAVA. The program starts by asking user what type of conversion they want to perform, the proceeds to take input in the appropiate type and the converts the array into arrayList or arrayList to array.

-Array: Array is used to store multiple values of a single data type, though they are static as once declared the size of the array cannot be changed. 
-ArrayList: ArrayList does what array can but they are of dynamic type so the size of the arraylist can be changed according to the codes need.

### **Working**  
In this there are 3 different class:
- ```Main.java``` : The main class accesses the methods of other 2 classes. The class starts by asking the user if they want to initate an array or arrayList. Then proceeds to ask for the total elements in either. The input is taken using the ```input.java``` class. Then the ```converter.java``` class is used to convert them accordingly.
- ```input.java``` : This class has all the input methods stored in it. There are two methods in this class, the first is ```arrayInput()``` method which takes integer input and stores them in form of array and returns the array to main function. The other method is ```arrayListInput()``` which takes integer input and stores them in form of ArrayList.
- ```converter.java```: This class has two methods. The first method is ```arrayListTOarray()``` which takes an arrayList and then converts it to an array and returns it to main function. The other function is ```arrayTOarrayList()``` which takes an array and converts it to an arrayList and returns an arrayList to the main function.

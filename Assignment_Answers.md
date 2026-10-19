# Module 3 - Assignment Answers

Name: Siddharth Jaspal
Degree: Bachelor of Technology in Artificial Intelligence
Enrollment Number: A0231109824068
University: Amity University
GitHub Username: heckkkerrr

These answers follow the supplied assignment document. Each numbered item is mapped to a source file or explanation below.

## Thread Concepts and Implementation

### 2. Create a thread by extending the Thread class: Create a thread by extending the Thread class that prints even numbers from 2 to 20 with a 500ms delay between each number.

See the related explanation and example in the repository.

### 3. Create a thread by implementing the Runnable interface: Create a thread by implementing the Runnable interface that takes a string "MULTITHREADING" and prints its characters in reverse order one by one.

See the related explanation and example in the repository.

### 4. Thread Sleep Method: Create a program that creates two threads. The first thread should print "Thread 1" every 1 second, and the second thread should print "Thread 2" every 2 seconds.

See the related explanation and example in the repository.

### 5. Thread Sleep with Multiple Threads (Countdown Timer): Write a program where one thread prints a countdown from 10 to 1 (1-second delay), while another thread simultaneously prints "Tick..." every half a second.

See the related explanation and example in the repository.

### 6. Thread Naming and Priority: Write a Java program that creates three threads: "Worker-1", "Worker-2", and "Worker-3". Assign different priorities and print messages from each thread showing their execution order.

See the related explanation and example in the repository.

### 7. Daemon Threads: Write a Java program where a daemon thread continuously writes "Auto-Save in progress..." every 3 seconds, while the main thread performs a file processing task.

See the related explanation and example in the repository.

## Thread Synchronization

### 9. Synchronized Method: Create a ticket booking system where multiple users (threads) attempt to book tickets simultaneously. Use synchronization to prevent overselling of tickets.

See the related explanation and example in the repository.

### 10. Synchronized Block: Create an inventory management program where multiple threads decrease the stock count of a product. Use a synchronized block to ensure stock updates are thread-safe.

See the related explanation and example in the repository.

### 11. Deadlock Example with Dining Philosophers: Simulate a simple Dining Philosophers problem where two philosophers try to pick up chopsticks (resources) and create a deadlock situation.

See the related explanation and example in the repository.

## Using wait(), notify(), and notifyAll():

### 13. Implement a producer-consumer scenario where one thread (producer) produces data and another thread (consumer) consumes it. Use the wait() and notify() methods for synchronization.

See the related explanation and example in the repository.

### 14. Write a program where two threads print numbers from 1 to 20 alternately: one prints odd numbers, and the other prints even numbers. Use wait() and notify() for synchronization.

See the related explanation and example in the repository.

### 15. Stopping a Thread: Write a program that simulates a file download in a thread (printing "Downloading chunk X"). Allow the download to stop gracefully when a stop flag is set to false.

See the related explanation and example in the repository.

## Lock Interface

### 17. Write a Java program using the ReentrantLock class to create a simple counter that can be safely incremented by multiple threads. Compare the result with the version that does not use a lock.

See the related explanation and example in the repository.

### 18. Write a program where two threads acquire two locks (lock1 and lock2) in opposite order, causing a deadlock. Then, fix the deadlock by using tryLock() with timeout.

See the related explanation and example in the repository.

## I/O Streams: Byte Stream and Character Stream

### 20. Reading File Using Byte Stream: Write a program that reads a text file using the FileInputStream and prints the contents to the console.

See the related explanation and example in the repository.

### 21. Writing to a File Using Byte Stream: Create a program that writes a string into a file using the FileOutputStream. Ensure that the program writes the string "Java I/O Streams Example" to a file named output.txt.

src/StreamExamples.java

### 22. Reading a File Using Character Stream: Write a program that reads a file using the FileReader class and prints the contents of the file to the console.

See the related explanation and example in the repository.

### 23. Writing to a File Using Character Stream: Write a program that writes a string to a file using the FileWriter class. The string should be written to a file named example.txt.

See the related explanation and example in the repository.

### 24. Buffered I/O: Modify the previous FileReader and FileWriter examples to use BufferedReader and BufferedWriter respectively to read from and write to the file, improving performance.

See the related explanation and example in the repository.

## File Handling

### 26. File Existence Check: Write a program that checks if a file exists in the system. If the file does not exist, create the file using the File class.

See the related explanation and example in the repository.

### 27. Listing All Files in a Directory: Write a Java program that lists all files in a directory specified by the user. The program should handle exceptions appropriately.

See the related explanation and example in the repository.

### 28. Copying a File: Create a program that copies the contents of one file to another using byte streams (FileInputStream and FileOutputStream).

See the related explanation and example in the repository.

### 29. Deleting a File: Write a Java program that deletes a file from the system using the File class.

See the related explanation and example in the repository.

### 30. Random Access File: Create a program that uses the RandomAccessFile class to read and write to specific positions within a file. The program should write some data at the beginning of the file, then overwrite part of it later.

See the related explanation and example in the repository.

## Exploring Java Packages

### 32. Using java.lang Package: Write a program that demonstrates the use of Math.random(), Math.abs(), and Math.pow() from the java.lang package.

See the related explanation and example in the repository.

### 33. Using java.util Package (Date and Calendar Example): Write a program that uses the Date and Calendar classes to display the current date and time.

See the related explanation and example in the repository.

### 34. Regular Expressions in java.util.regex: Create a program that uses the Pattern and Matcher classes from the java.util.regex package to check if a given string is a valid email address.

See the related explanation and example in the repository.

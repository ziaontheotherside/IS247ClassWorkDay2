# Challenge: Add Inheritance to the Book Class

## Problem Statement
Enhance the existing `Book` class by introducing an `EBook` class that demonstrates **inheritance** in Java.

### **Tasks:**
1. **Create an `EBook` Class:**
    - Inherit from the `Book` class.
    - Add a new property: `fileSize (double)`, representing the size of the eBook file in megabytes (MB).
    - Override the `displayDetails` method to include `fileSize` in the output.

2. **Update the `Main` Class:**
    - Create an instance of the `Book` class and call its `displayDetails` method.
    - Create an instance of the `EBook` class and call its `displayDetails` method.

---
## **Explanation of the Code**

### **1. Inheritance:**
- The `EBook` class **inherits** from the `Book` class using the `extends` keyword.
- It has **access** to the `title` and `author` properties from the `Book` class.

### **2. Additional Property:**
- The `EBook` class adds a new property, `fileSize`, to represent the eBook's size.

### **3. Method Overriding:**
- The `EBook` class **overrides** the `displayDetails` method to include `fileSize` in the output.

### **4. Main Class:**
- An instance of the `Book` class is created, and its `displayDetails` method is called.
- An instance of the `EBook` class is created, and its **overridden** `displayDetails` method is called.

---

## **Expected Output**

```java

Book Details:
Title: The Great Gatsby, Author: F. Scott Fitzgerald

EBook Details:
Title: Clean Code, Author: Robert C. Martin, File Size: 5.2 MB
```

## **Solution Link**
🔗 [Click here to view the solution](https://github.com/shivasharma/IS247ClassWork/tree/master/src/Chapter11ObjectOriented/Challenge2/Solution)

---

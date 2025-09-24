Java Lab Exercise – Student Registration System (Basic Classes, No OOP Concepts)
Objective

Learn how to use simple Java classes (Student, Course) to model real-world entities and practice working with lists and relationships — without using inheritance or polymorphism.

🔹 Step 1: Define the Course class

Create a Course class with:

id (int)

name (String)

Provide a constructor to initialize values.

Override toString() so printing a Course gives its name.

🔹 Step 2: Define the Student class

Create a Student class with:

id (int)

name (String)

type (String) → values like "HighSchool" or "Undergrad"

registeredCourses (List of Course)

Provide:

Constructor to set id, name, and type.

Method addCourse(Course course) to register a new course.

Method printDetails() to display the student’s info + registered courses.

🔹 Step 3: Define Eligibility Rules

Create a mapping of student type to eligible courses.

Example (use a Map<String, List<String>>):

"HighSchool" → ["BE", "BBA"]

"Undergrad" → ["MBA", "ME"]

🔹 Step 4: Registration Logic

Write a method registerStudentForCourse(Student student, Course course) that:

Looks up the eligibility list for the student’s type.

If the course is allowed → add to student’s registeredCourses.

If not allowed → print an error message.

🔹 Step 5: Testing the System

Create courses: BE, BBA, MBA, ME.

Create two students:

John → HighSchool

Priya → Undergrad

Try registering:

John → MBA ❌ not eligible

John → BE ✅

Priya → MBA ✅

Print student details.

🔹 Step 6: Expected Output
Attempting to register John (HighSchool) for MBA...
Not eligible for this course!

Registering John (HighSchool) for BE... Success
Registering Priya (Undergrad) for MBA... Success

--- Student Details ---
Student: John (HighSchool)
Registered Courses: BE

Student: Priya (Undergrad)
Registered Courses: MBA

🔹 Step 7: Extension Challenges (Optional)

Allow students to register for multiple courses in one go.

Prevent duplicate registrations.

Add a method to remove a registered course.

Store all students and courses in a single list and print a full registration report.

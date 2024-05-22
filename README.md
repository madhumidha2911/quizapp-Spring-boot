**Technologies Used:**

**Java 17**: The core programming language used for developing the application.

**Spring Framework**: Utilized for building the backend services, including dependency injection, RESTful API creation, and data management.

**PostgreSQL**: The database system used to store and manage quiz data, including questions, answers, user information, and scores.

IntelliJ IDEA: The integrated development environment (IDE) used for writing and maintaining the code.

**Postman**: Used for testing the API endpoints during development to ensure they function correctly.

**pgAdmin**: A management tool used to interact with the PostgreSQL database for data inspection and manipulation.


**Project Overview**:
The project is a quiz game application designed to provide a fun and interactive way for users to test their knowledge on various topics. The application includes the following features:

**GET Calls**:

  Retrieve quiz questions and options from the database.
  Fetch user profiles and their scores.
  Obtain quiz results and summaries for analysis.
  

**PUT Calls**:

Update user information such as profile details and preferences.
Modify quiz questions and answers if needed by an admin.


**POST Calls**:

Submit answers to quiz questions and calculate the score based on the responses.
Create new user profiles and register them in the system.
Add new quiz questions and options to the database.


**Functionality**:

**Quiz Management**: Admins can add, update, or delete quiz questions and options, ensuring the content remains relevant and up-to-date.

**User Interaction**: Users can create profiles, take quizzes, and view their scores and progress over time.

**Score Calculation**: The application calculates scores based on correct answers submitted, providing immediate feedback to users.

**Data Persistence**: All data, including questions, user profiles, and scores, are stored in PostgreSQL, ensuring reliable and efficient data management.

**Development Tools**:

**IntelliJ IDEA** was used for coding, debugging, and building the application.

**Postman** was utilized for testing the RESTful APIs to verify that the GET, PUT, and POST requests were functioning as expected.

**pgAdmin** helped in managing the PostgreSQL database, allowing for efficient data handling and querying.

This project showcases the effective use of modern technologies and tools to develop a robust, interactive quiz game application that can be easily maintained and scaled as needed.

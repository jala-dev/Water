# Before you start:
* Try not to read ahead.
* Do one task at a time. The trick is to learn to work incrementally.
* Make sure you only test for correct inputs, there is no need to test for invalid inputs.
* Apply any good practice you consider necesary in the code.
* Test First!

# Description
Water is a simple console application for the collection of water consumption for cooperatives in rural areas. The application is currently under development and has a beta version.
We need your help to complete the functionalities and offer a complete user experience.
 
## Current features
* Register consumption. The system records the water consumption of each partner in the system.  
* Get current debt. The system can calculate the total amount owed for a particular member.  

## Pending features to implement
* Consult details of the partner. Many users ask for a detail of their debt before paying. Implement the necessary support (UI and backend) to see all the consumption associated with a client and its total.
  
  1. Implement this new feature using the information currently available in the system.
   
* Make payment. We need to record the payment of consumption by a partner. Initially, only full payment of debts is allowed. Once paid, the consumptions must be marked as paid and not be considered in the calculation of the current debt.
  
  2. Implement this new feature using the information currently available in the system.
   
* Register member. We want register the members before to have consumptions. Implement this feature.
  
  3. Implement this new feature using the information currently available in the system.


### Validations
To have a robust application, we need to add certain controls to the information that we include in the system.

  4.1. Member code. A member code always has to be positive and it be a value between 5000 and 5999.

  4.2. Member name. A member name needs 4 chars as minimun length.

  4.3. Consumption. The consumption always is positive values.

5. If you have implemented the Member registration, validate that consumption always be associated to an already registered member.
     
### Persistence
Currently all the information is stored on memory, that means data is lost after finishing the application. 
Currently, the system does not save the information of the members and consumptions. 

6. Implement a persistence module so that the information is always available when the application is started again.

### Menu
We don't like how the action menu (Menu.java) is implemented, it has too much IFs; there should be a better way to implement it, 

7. Provide a better alternative that helps in the maintainability .

### Unit testing
There are some unit tests that will help you during the refactoring.

8. Include more scenarios. 

# Submit your task
You have less than 3 hours for this assignment, the way to submit your work is:
 * If you have a github account, you can accept the invite the Jalasoft Trainers will send you. By accepting this invite you'll have your GitHub repository ready for you. Clone it and ensure to push your changes when your are ready.
 
 * If you are not familiar with Git repositories or you don't have an account, you can download the project from the next url:
 https://github.com/jala-dev/Water/archive/refs/heads/main.zip
 
 To submit your changes, you can zip your project folder and send it to jose.ecos@fundacion-jala.org and felipe.canaviri@fundacion-jala.org before the time limit.  
 **NOTE:** Please make sure only include project files. 
 
# NOTE
To run the application you must have installed OpenJDK-8 (or higher) and Maven

Make sure that you are running the App.java file.

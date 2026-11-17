# Automation Exercise Website – Manual Testing, Selenium Automation & API Testing

## 1. Project Overview

This project focuses on testing the [Automation Exercise Website](https://automationexercise.com/) through manual testing, Selenium WebDriver automation, and API testing using Postman.

The objective was to understand the software testing process, validate website functionality, identify defects, automate selected test scenarios, and verify API functionalities using positive and negative test cases.

## 2. Tools and Technologies

- **Manual Testing:** Test scenarios, test cases, test data, functional testing, positive and negative testing, defect reporting
- **Automation Testing:** Java 17, Selenium WebDriver, TestNG, Maven, Page Object Model (POM), PageFactory
- **API Testing:** Postman, HTTP methods, request parameters, headers, form data, JSON response validation
- **Version Control:** Git and GitHub

## 3. Manual Testing

Performed manual testing of the Automation Exercise Website to verify its functionality and identify defects.

### Modules Tested

| Module | Test Cases |
|---|---:|
| Signup | 9 |
| Login | 8 |
| Contact Us | 8 |
| Cart | 7 |
| Products | 7 |
| Checkout | 6 |
| Home | 5 |
| **Total** | **50** |

### Testing Activities

- Prepared test scenarios and test cases.
- Executed positive and negative test cases.
- Validated input fields, buttons, navigation, and application behaviour.
- Compared actual results with expected results.
- Identified and documented defects with reproduction steps.
- Recorded test results and observations.

### Defects Identified

**Defect 1: Weak Password Accepted During Signup**

- **Module:** Signup
- **Scenario:** Entered a weak password during registration.
- **Expected Result:** The application should enforce appropriate password validation.
- **Actual Result:** The application accepted a weak password.
- **Impact:** Users could create accounts with weak passwords.

**Defect 2: Alphabetic Characters Accepted in Mobile Number Field**

- **Module:** Signup
- **Scenario:** Entered alphabetic characters in the mobile number field.
- **Expected Result:** The field should accept only valid numeric input.
- **Actual Result:** Alphabetic characters were accepted.
- **Impact:** Invalid mobile number information could be submitted.

*Note: These defects were identified and documented during testing. Application-side fixes were not verified.*

## 4. Selenium WebDriver Automation

Developed a Selenium WebDriver automation framework using Java, TestNG, Maven, and the Page Object Model.

### Framework Details

- Developed a reusable automation framework using Java and Selenium WebDriver.
- Implemented Page Object Model (POM) to separate page elements and test logic.
- Used PageFactory for locating and managing web elements.
- Created a BaseTest class for common test setup and configuration.
- Used TestNG to organize and execute test scripts.
- Managed project dependencies and execution through Maven.

### Automation Concepts Practiced

- Locators and XPath
- Web element identification
- Browser navigation and interactions
- Explicit waits and synchronization
- Actions class
- JavaScriptExecutor
- TestNG annotations and assertions
- Maven test execution

### Automation Challenges and Troubleshooting

- **Element identification:** Inspected page elements and adjusted locators when elements were not identified correctly.
- **Synchronization issues:** Used waits to handle elements that took time to load.
- **Unexpected pop-ups and overlays:** Investigated page overlays that interfered with element interactions.
- **Test execution:** Checked test configuration, dependencies, and TestNG execution settings when tests did not run as expected.

## 5. API Testing Using Postman

Created a Postman collection to test the API functionalities of the Automation Exercise Website.

### API Functionalities Tested

- Product listing
- Brand listing
- Product search
- User login
- User account creation
- User account update
- User account deletion
- User account details

### Testing Activities

- Created and executed API requests using Postman.
- Practiced different HTTP methods.
- Tested positive and negative scenarios.
- Passed request parameters and form data.
- Checked response status codes and response messages.
- Validated API behaviour with valid and invalid inputs.

### Negative Testing

Tested scenarios including:

- Missing required fields.
- Invalid email address.
- Incorrect password.
- Duplicate account registration.
- Invalid input data.

### Postman Collection

The Postman collection contains 14 requests covering different API functionalities.

Collection variables used:
- `baseUrl`
- `testEmail`
- `testPassword`

Replace the placeholder account credentials with a dedicated test account before executing requests that require login or account details.

## 6. Issues Faced and Troubleshooting

During API testing, I encountered some request configuration and execution issues.

| Issue | Cause / Observation | Troubleshooting |
|---|---|---|
| Product search request did not return the expected result | Required search parameter was missing | Added the `search_product` parameter to the request |
| Account creation returned a missing name message | The request was sent using raw JSON instead of the expected form-data format | Changed the request body to `x-www-form-urlencoded` |
| Account update returned Account not found | The account had already been deleted | Checked the account state and understood the dependency between account operations |
| Postman Desktop showed Operation timed out | Request execution or connectivity issue | Treated it as an execution/connectivity issue rather than an application defect |

These troubleshooting activities helped me understand request configuration, input requirements, account dependencies, and API execution behaviour.

## 7. How to Execute the Tests

### Selenium Automation

1. Clone or download the project from GitHub.
2. Open the project in an IDE such as Eclipse or IntelliJ IDEA.
3. Ensure Java 17 and Maven are configured.
4. Allow Maven to download the required dependencies.
5. Execute the TestNG test suite or run the required test classes.

### API Testing

1. Open Postman.
2. Import the exported Postman collection.
3. Configure the required collection variables.
4. Replace placeholder account credentials with valid test credentials.
5. Execute individual requests and verify the responses.

## 8. Key Learnings

Through this project, I practised:

- Understanding the manual testing process and preparing test documentation.
- Writing and executing positive and negative test cases.
- Identifying and documenting application defects.
- Developing a Selenium automation framework using POM.
- Working with Java, Selenium WebDriver, TestNG, and Maven.
- Creating and executing API requests using Postman.
- Troubleshooting request configuration and test execution issues.
- Understanding how manual, UI automation, and API testing complement one another.

## 9. Project Summary

This project provided practical learning in software testing through three approaches:

- **Manual Testing:** Prepared and executed 50 test cases across seven website modules.
- **Selenium Automation:** Practised building a reusable Java-based automation framework using Selenium WebDriver, TestNG, Maven, and POM.
- **API Testing:** Created a Postman collection containing 14 requests and practised positive and negative API testing.

The project helped strengthen my understanding of functional testing, test automation, API validation, defect reporting, and troubleshooting.

Feature: User Registration API Testing

  Background:
    * url 'https://api.example.com'
    * path '/register'
    * header Content-Type = 'application/json'

  Scenario: Successful User Registration
    Given request { "username": "testuser", "email": "testuser@example.com", "password": "Password@123" }
    When method POST
    Then status 201
    And match response.message == "User registered successfully"
    And match response.userId != null

  Scenario: Registration with Existing Email
    Given request { "username": "existinguser", "email": "existing@example.com", "password": "Password@123" }
    When method POST
    Then status 409
    And match response.message == "Email already exists"

  Scenario: Registration with Missing Fields
    Given request { "username": "", "email": "", "password": "" }
    When method POST
    Then status 400
    And match response.message == "Username, email, and password are required"

  Scenario: Registration with Invalid Email Format
    Given request { "username": "invalidUser", "email": "invalid-email", "password": "Password@123" }
    When method POST
    Then status 400
    And match response.message == "Invalid email format"

  Scenario: Registration with Weak Password
    Given request { "username": "user123", "email": "user123@example.com", "password": "12345" }
    When method POST
    Then status 400
    And match response.message == "Password does not meet security requirements"

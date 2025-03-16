Feature: Login API Testing

  Background:
    * url 'https://api.example.com'
    * path '/login'
    * header Content-Type = 'application/json'

  Scenario: Valid Login Test
    Given request { "username": "testuser", "password": "password123" }
    When method POST
    Then status 200
    And match response.token != null
    And match response.message == "Login successful"

  Scenario: Invalid Login Test (Wrong Password)
    Given request { "username": "testuser", "password": "wrongpassword" }
    When method POST
    Then status 401
    And match response.message == "Invalid credentials"

  Scenario: Login with Missing Fields
    Given request { "username": "" }
    When method POST
    Then status 400
    And match response.message == "Username and password are required"

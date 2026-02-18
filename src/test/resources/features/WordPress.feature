Feature: WordPress Website Validation

  Scenario: Verify WordPress Home Page and Get WordPress Page
    Given the user is on the WordPress home page
    When the user opens the Get WordPress page
    Then the Get WordPress page title should be displayed

  Scenario: Verify Photo Directory Search Functionality
    Given the user is on the WordPress home page
    When the user searches for a photo in the Photo Directory
    Then the photo search results should be displayed
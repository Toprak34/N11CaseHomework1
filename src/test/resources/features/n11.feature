Feature: Go to the n11 stores page and control comments count for chosen store

  Scenario: Control comment count for chosen store
    Given User open the browser and go to the stores page
    When  All store names are printed in excel file
    And  User selects desired store
    Then User see store reviews
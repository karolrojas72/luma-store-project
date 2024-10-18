Feature: Submit a form
  Scenario Outline: Submit a test form on Luma page
    Given Karol is on the homepage "<username>" and "<password>"

    Examples:

      | username                 | password |
      | lumadinamic@yopmail.com  | luma785* |

    When she completes the process of purchasing items "<name>" and "<lastname>" and "<company>" and "<streetAddress0>" and "<city>" and "<state>" and "<postalCode>" and "<country>" and "<phoneNumber>" and "<shippingMethods>"


    Examples:

      | name   | lastname | company | streetAddress0 | city      | state    | postalCode | country       | phoneNumber | shippingMethods |
      | Camila | Lopez    | Chec    | Cra 24 7-89    | Manizales | Colorado | 12345      | United States | 77777       | 1               |
      | Carlos | Rojas    | Manisol | Cra 7 4-89     | Medellin  | Colorado | 12345      | United States | 55555       | 0               |
      | Mario  | Villada  | Luker   | Avendida 32    | Bogota    | Colorado | 12345      | United States | 88888       | 1               |

    Then she transaction success message "Thank you for your purchase!" is generated







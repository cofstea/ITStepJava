@AddToCart
Feature: Add to cart functionality


  Scenario: Ability of adding a product to cart
    Given user goes to the 'Product' page
    And user is on the 'Product' page
    Then 'Add to cart' button is displayed
    Then 'Item Name' button is displayed
#    And 'Add to cart' is on the right of the product
    When user clicks to 'Add to cart' button
    When user clicks to 'Proceed to checkout' button
    Then user is on the 'Summary Checkout' page
#    And product 'Faded Short Sleeve T-shirts' is 'In stock'

  @Scenario1
  Scenario: Create an account
    Given user navigates to 'http://automationpractice.com/index.php'
    And user is on the 'Home Page' page
    When user clicks to 'Login' button
    And user is on the 'Authentication' page
    And user types new email into 'email create' field
    And user click to 'Create Account' button
    Then user is on the 'Account Creation' page


  @Scenario2
  Scenario: Ability of adding a product to cart from wish list
    When user clicks to 'Add to cart' button

  @ScenarioOutline
  Scenario Outline: Multiple execution scenario
    Given user is on the '<Start Page>' page
    And product type is <Type>
    Then 'Add to cart' button is displayed
    And 'Add to cart' is on the right of the product
    When user clicks to 'Add to cart' button
    When user click to 'Add to cart' button
    Then product is added to database
    And user is on the 'Checkout' page
    And user completes following fields
      | Field            | Value     |
      | email            | Baby Doll |
      | password         | Car       |
      | confirm password | Tedy bear |

    @HomePage @Clothes
    Examples:
      | Type    | Start Page | Quantity 1 | Quantity 2 | Quantity 3 |
      | CLOTHES | Home Page  | 2          | 2          | 1          |

    @Gadgets
    Examples:
      | Type    | Start Page |  | Quantity 1 | Quantity 2 | Quantity 3 |
      | GADGETS | Products   |  | 4          | 12         | 9          |

    @Toys
    Examples:
      | Type | Start Page      | Quantity 1 | Quantity 2 | Quantity 3 |
      | TOYS | Search Products | 22         | 12         | 1          |


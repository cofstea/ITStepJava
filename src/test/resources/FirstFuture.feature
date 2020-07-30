@AddToCart
Feature: Add to cart functionality

  @Scenario1
  Scenario: Ability of adding a product to cart
    Given user goes to the 'Product' page
    And user is on the 'Product' page
    Then 'Add to cart' button is displayed
#    And 'Add to cart' is on the right of the product
    When user clicks to 'Add to cart' button
    When user clicks to 'Proceed to checkout' button
    Then user is on the 'Summary Checkout' page
#    And product 'Faded Short Sleeve T-shirts' is 'In stock'


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
    And list of
      | Id | Name      | Price | Quantity     |
      | 1  | Baby Doll | 20    | <Quantity 1> |
      | 12 | Car       | 10    | <Quantity 2> |
      | 13 | Tedy bear | 50    | <Quantity 3> |

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


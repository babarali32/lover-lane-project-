Feature: Lovers Lane Test Suite

  Background:
    * login page is loaded
    * user enters credentials and clicks login button
    * user is logged in

  @StoreHoursLL @LLRegression
  Scenario: Store Hours and Locations for Lovers Lane
    * I click Store Hours link
    * I verify user can see Store locations and hours

  @FreeShippingLL @LLRegression
  Scenario: Free Shipping information for LL
    * I click FREE Standard Shipping link

  @AccountPagesLL @LLRegression @LLSmoke
  Scenario: Account Pages for LL
    * I click Login button for LL
    * I enter login information for LL
    * I verify I am logged into LL
    * I click "<LLAccountPage>" for LL
      | My Information  |
      | Frequent Lover |
      | Address Book   |
      | Order History  |
      | Wish List      |
      | Registry       |


  @TabsLL @LLRegession @LLSmoke
  Scenario: Making sure LL tabs show sub categories
    * I hover over Sex Toys
    * I hover over Lingerie
    * I hover over Curvy
    * I hover over Web Exclusives
    * I hover over Hosiery Accessories
    * I hover over Bridal Romantic Gifts
    * I hover over Costumes Role Play
    * I hover over Mens Wear

  @LingerieLL @LLRegression @LLSmoke
  Scenario: Lingerie sub cats for Lingerie
    * I hover over Lingerie
    * I select SubCatLingerie for Lingeries
      | All Lingerie & Apparel     |
      | Valentines Day             |
      | Babydolls & Chemises       |
      | Bodystockings              |
      | Bridal                     |
      | Corsets & Bustiers         |
      | Crotchless Lingerie        |
      | Dancewear                  |
      | Dresses                    |
      | Fetish                     |
      | Garterbelts                |
      | Gowns                      |
      | Lingerie Sets              |
      | Panties                    |
      | Peek-A-Boo                 |
      | Robes                      |
      | Separates                  |
      | Swimwear                   |
      | Teddies & Rompers          |
      | Xmas Lingerie & Apparel    |

  @CurvyLL @LLRegression
  Scenario: Curvy sub cats for Curvy
    * I hover over Curvy
    * I select SubCatCurvy for Curvy
      | All Curvy               |
      | Babydolls & Chemises    |
      | Bodystockings           |
      | Bridal                  |
      | Corsets & Bustiers      |
      | Crotchless Lingerie     |
      | Fetish                  |
      | Garterbelts             |
      | Gowns                   |
      | Hosiery                 |
      | Lingerie Sets           |
      | Panties                 |
      | Peek-a-Boo              |
      | Robes                   |
      | Teddies & Rompers       |
      | Holiday Lingerie & Apparel |
      | All Curvy               |

  @WebExclusivesLL @LLRegression
  Scenario: Web Exclusive sub cats for Web Exclusive
    * I hover over Web Exclusives
    * I select Lingerie for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select Bodystockings for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select Curvy for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select Clubwear for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select Entertainer for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select Fetish Wear for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select Pajamas & Loungewear for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select Panties for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select Peek a Boo for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select Costumes for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select Shapewear for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select Swimwear for Web Exclusive for LL
    * I hover over Web Exclusives
    * I select All Online Exclusives for Web Exclusive for LL

  @AccessoriesLL @LLRegression
  Scenario: Accessories sub cats for Accessories
    * I hover over Hosiery Accessories
    * I select SubCatAccessories for Accessories
      | Garters           |
      | Garter Belts      |
      | Gloves            |
      | Jewelry           |
      | Pantyhose & Tights |
      | Pasties           |
      | Shapewear         |
      | Shoes & Boots     |
      | Wigs              |
      | All               |


  @BridalLL @LLRegression
  Scenario: Bridal sub cats for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Adult Gifts & Bags for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Bachelorette Party Supplies for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Bath & Body for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Books for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Branded Gifts for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Candles for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Cards for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Games for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Gifts Card for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Love Kits for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Pheromones for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Pride for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Stimulation and Prolonging for Bridal
    * I hover over Bridal Romantic Gifts
    * I select Supplements and Aphrodisiacs for Bridal
    * I hover over Bridal Romantic Gifts
    * I select TasttyTreats for Bridal
    * I hover over Bridal Romantic Gifts
    * I select All Bridal for Bridal

  @RolePlaylLL @LLRegression
  Scenario: Role Play sub cats for Costumes Role Play
    * I hover over Costumes Role Play
    * I select All Roleplay for Role Play
    * I hover over Costumes Role Play
    * I select Costumes discount Costumes for Role Play
    * I hover over Costumes Role Play
    * I select Curvy Roleplay for Role Play
    * I hover over Costumes Role Play
    * I select Men's Roleplay for Role Play
    * I hover over Costumes Role Play
    * I select Women's Roleplay for Role Play

  @MensWearLL @LLRegression
  Scenario: Mens Wear sub cats for Mens Wear
    * I hover over Mens Wear
    * I select SubCatMensWear for Mens Wear
      | Boxers             |
      | Briefs             |
      | C-Rings            |
      | G-Strings & Thongs |
      | Loungewear          |
      | Prostate Play      |
      | Pumps & Extensions |
      | Strokers & Masturbators|
      | All Men's Wear & Toys|

  @RomanticGiftsLL @LLRegression
  Scenario: Romantic Gifts sub cats for Romantic Gifts
    * I hover over Bridal Romantic Gifts
    * I select SubCatRomanticGifts for Romantic Gifts
      | Adult Gifts & Bags  |
      | Bachelorette Party Supplies|
      | Bath & Body         |
      | Books               |
      | Branded Gifts       |
      | Candles             |
      | Cards               |
      | Games               |
      | Gift Cards          |
      | Love Kits           |
      | Pheromones          |
      | Pride               |
      | Stimulants & Prolonging|
      | Supplements & Aphrodisiacs|
      | Tasty Treats        |
      | All                 |

  @CostumesLL @LLRegression
  Scenario: Costume sub cats for Costumes
  *I hover over Costumes Role Play
    * I select SubCatCostumes for Costumes
      | All Role Play       |
      | $5 Costumes         |
      | Curvy Roleplay      |
      | Men's Roleplay      |
      | Women's Roleplay    |


  @Romance&RelationshipsLL @LLRegression
  Scenario: Romance & Relationships Link for LL
    * I scroll down on page LL
    * I click Romance & Relationship link
    * I verify Romance & Relationship link is working

  @Fetish&FantasyLL @LLRegression
  Scenario: Fetish & Fantasy Link for LL
    * I scroll down on page LL
    * I click Fetish & Fantasy link
    * I verify Fetish & Fantasy link is working

  @Tips&TricksLL @LLRegression
  Scenario: Tips & Tricks Link for LL
    * I scroll down on page LL
    * I click Tips & Tricks link
    * I verify Tips & Tricks link is working

  Scenario: Fashion & Fun for LL
    * I scroll down on page LL
    * I click Fashion & Fun
    * I verify Fashion & Fun link is working

  @TantalizingToysLL @LLRegression
  Scenario: Tantalizing Toys Link for LL
    * I scroll down on page LL
    * I click Tantalizing Toys
    * I verify Tantalizing Toys link is working

  @SexualZodiacLL @LLRegression
  Scenario: Sexual Zodiac Link for LL
    * I scroll down on page LL
    * I click Sexual Zodiac
    * I verify Sexual Zodaic link is working

  @SexualWellnessLL @LLRegression
  Scenario: Sexual Wellness Link for LL
    * I scroll down on page LL
    * I click Sexual Wellness
    * I verify Sexual Wellness link is working

  @ShoppingLinksLL @LLRegression
  Scenario: Shopping Links for LL
    * I scroll down on page LL
    * I click ShoppingLink for LL
      | Buy Online Pickup In Store   |
      | Backorders                   |
      | Current Offers               |
      | Gift Cards                   |
      | Loyalty Program              |
      | Order Form - Printable       |
      | Returns & Exchanges          |
      | Reviews                      |
      | Shipping                     |
      | Size Charts                  |
      | Terms of Sale & Use          |

  @CustomerSerivceLinksLL @LLRegression
  Scenario: Customer Service Links for LL
    * I scroll down on page LL
    * I click CustomerServiceLink for LL
      | ADA Accessibility    |
      | Bridal Registry      |
      | Contact Us           |
      | Disclaimer           |
      | FAQ                  |
      | My Account           |
      | Novelty Purchases    |
      | Ordering Information |
      | Order Tracking       |
      | PayPal               |
      | Wish List            |

  @AboutUsLinksLL @LLRegression
  Scenario: About Us Links for LL
    * I scroll down on page LL
    * I click AboutUsLink for LL
      | Affiliate & Influencer Programs|
      | Business Opportunities         |
      | Blog                           |
      | Employment                     |
      | News/Publicity                 |
      | Our Company                    |
      | Podcast                        |
      | Privacy Policy                 |
      | Site Map                       |
      | Stores - Hours                 |
      | Testimonials                   |
      | Value Statement                |
      | Why Buy From Us?               |

  @JoinEmailListLL @LLRegression @up
  Scenario: Joining Email List for LL
    * I scroll down on page LL
    * I enter 'test123477778@test.com' for LL email sign up
    * I click on Join button LL
    * I click Sign Up button LL
    * I verify user is subscribed to LL

  @JoinEmailListLL @LLRegression @up
  Scenario: User clicks on store for LL
    * I click on stores LL
    * I verify the store page
Feature:homepage verification

  Background:
    * login page is loaded
    * user enters credentials and clicks login button
    * user is logged in

  @logoLL
  Scenario: verify the logo of LL is  displayed
    * I navigate to the homepage logo of LL website is displayed
  @homepageTabsLL
  Scenario: verify tabs of LL homepage
    * I verify all the tabs are displayed
      | NEW                    |
      | BRANDS WE LOVE         |
      | LINGERIE CLUBWEAR      |
      | WEB EXCLUSIVES         |
      | EVERYTHING CURVY       |
      | SEX TOYS VIBRATORS     |
      | LUBES ESSENTIALS       |
      | BONDAGE FETISH APPAREL |
      | ROLES PLAY COSTUMES    |
      | HOSIERY ACCESSORIES    |
      | BRIDAL ROMANTIC GIFTS  |
      | MENS WEAR MENS TOYS    |
      | CLEARANCE              |






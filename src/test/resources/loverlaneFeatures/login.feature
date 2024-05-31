Feature: Ambiance Test Suite
  Background:
    * login page is loaded

  @LLRegression @LLSmoke
  Scenario: valid Login
    * user enters credentials and clicks login button
    * user is logged in

  @LLRegression
  Scenario: invalid password Login try
    * user enters Invalid password and clicks login button
    * user gets error msg

  @LLRegression
  Scenario: invalid UserName Login
    * user enters invalid userName and clicks login button
    * user gets error msg

  @LLRegression
  Scenario: invalid username and invalid password Login
    * user enters invalid userName and invalid password and clicks login button
    * user gets error msg
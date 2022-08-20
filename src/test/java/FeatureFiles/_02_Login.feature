#Senaryo 2| Login Functionality
#• Para Bank sitesine geçerli kullanıcı bilgileriyle giriş yapınız ve Login olduğunuzu doğrulayınız
#• Para Bank sitesine geçersiz kullanıcı bilgileriyle giriş yapınız ve login olmadığınızı doğrulayınız. (Username ve password için ayrı ayrı deneyin)

Feature: Login feature

  Background:
    Given navigate to parabank

  Scenario Outline: Scenario Outline: Login with valid data

    When login with valid name as "<username>" and password as "<password>"
    Then "<message>" should be displayed

    Examples:
      | username    | password | message           |
      | desusrog5252 | 525252   | Accounts Overview |
      | mdhASDgh    | 1236     | Error!            |
#Senaryo 1| Register Functionality
#• Para Bank sitesinde bir hesap açınız • Hesabın açıldığını “Your account was created successfully. You are now logged in.” mesajını doğrulayınız.


  Feature: Register Functionality
    Scenario: Create a profile

      Given navigate to parabank
      When create a profile
      Then success message should be displayed


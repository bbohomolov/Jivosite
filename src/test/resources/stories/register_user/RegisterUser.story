Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: User tries to register without password
Given the user is on Register page
When user enter valid email
When press submit button
Then 'Это обязательное поле' text is shown near password field

Scenario: User succesfully registered
Given the user is on Register page
When user enter valid password
When user enter valid email
When press submit button
Then 'Заполните профиль' page is shown
When user enter first name
When user enter url
When press submit button
Then 'Скачайте приложение' page is shown
<h1> loginMS<h1>

Learning Spring Security

The purpose of the application is to use some tool that spring security provide us.

<p>What it does is, allows a user to create an account. When the request is send, a random UUID token valid only for 15 minutes is created and an email is send
using Gmail`s SMTP Server. To learn more About Gmail`s SMTP Server, check this out: https://kinsta.com/blog/gmail-smtp-server/ <p>

You can generate a generic gmail passowrd to use this service, In order to do that you must go to https://myaccount.google.com/security? and generate a App passowrd

Once the user gets the email and validate his token, his able to log in.

All data is saved in a postgres database.


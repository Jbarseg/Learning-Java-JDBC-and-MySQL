Here's a Java exercise involving JDBC so you can keep practicing your knowledge:

Exercise:

Create a console application that allows the user to manage a table of products in a database. The products table must have the following fields:

id (primary key, type INT)
name (type VARCHAR)
price (DECIMAL type)
quantity (INT type)
The application must allow the user to perform the following operations:

Add a product: Allows the user to enter the data of a product and add a new record to the products table.

Consult products: Allows the user to see all the records of the products table.

Delete product: Allows the user to delete a record from the products table.

Update product: Allows the user to update the data of an existing product.

Make Sale: Allows the user to sell a specific quantity of a product. The quantity must be updated in the products table.

The application must use JDBC to connect to the database and perform CRUD operations on the product table.

Suggestions:

Use prepared queries to prevent SQL injection attacks.
It uses transactions to ensure the integrity of the data in the database.
It uses the Scanner class to read user input.
It uses the PreparedStatement class to perform the CRUD operations.
I hope this exercise helps you continue to practice your knowledge of JDBC and apply it in a practical project. If you have any questions or need more help, don't hesitate to ask.
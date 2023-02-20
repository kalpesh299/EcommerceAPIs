# EcommerceAPIs
We have created the ecommerceApi project. we are using the h2 database also we have learned the concept of Joincolumn and how can we handle and structure our database

#Language and Framework
We have used java to build this project
We have used spriingboot framework

#Packages,repo,services,controller we have used

- Model -
User,Product,Order,Address

- Dao -
userRepository,productRepository,orderReporsitory,adressRepository

 - Service -
userService,productService,orderService,adressService

- Controller -
userController,productController,orderController,adressController

- Database - used-H2 Database
tbl_user,tbl_order,tbl_product,tbl_address

Endpoints Created
1. Create users
2. Create products
3. Create Address
4. Place an order (Create Order) using userId, productId, addressId
5. Get order by order id
6. Get user by userid
7. Get all products
    - Get products based on category (query params)
8. delete products based on product id.


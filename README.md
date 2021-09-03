# Java Spring E-commerce

E-commerce REST API based on Java Spring, Spring Boot
## REST API Endpoints


```
/TokenGenerator
  GET / - Generate token using Email and password

/product
  GET / - Requires: OAuth 2.0 Authentication, Query Parameter "Product" (Only 1-3 available)

          View Product details

/Price
  GET / - Requires: OAuth 2.0 Authentication

          View all Product Prices

  POST / - Requires: ResponseBody of /product as RequestBody, Query Parameter "Quantity"

          View total cost of products based on quantity and product name


/order
  POST / - Requires: ResponseBody of /product as RequestBody, Query Parameters: "Email" as "Admin@test.com" only, "Password" as "Testingkey123" only, "Quantity", "Customer", "Address", "City"

          Creates Order

/payment
  POST / - Requires: ResponseBody of /order as RequestBody

          Notifies Payment Vendor of order

/ship
  POST / - Requires: ResponseBody of /order as RequestBody

          Notifies Shipment Vendor of order
```
Command to run Project: mvn spring-boot:run

Command to build Jar: ./mvnw clean package -DskipTests

Command to run Jar: java -jar target/rest-service-complete-0.0.1-SNAPSHOT.jar

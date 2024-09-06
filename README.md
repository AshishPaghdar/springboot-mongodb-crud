# Springboot-mongodb-crud
This is an example of Mongodb crud using Spring Boot framework. 

1. Spring boot v3.2.2
2. Mongo DB 
3. Swagger Explorer

# prerequisite and set up the project.
### Mongo DB 
1. Install Mongodb in local system.
2. Start the Mongodb service and connect on your local system.
    ```sh
       sudo systemctl start mongodb
       mongodb
     ```
3. Create database "ProductDB" in MongoDB.
   ```sh
      use ProductDB
     ```
   
### Set up the project and then run.
   ```sh
      mvn spring-boot:run
   ```

### Swagger APIs explorer : http://localhost:8081/v3/api-docs
### Swagger Documentation APIs : http://localhost:8081/swagger-ui/index.htm

# Create product using RestAPI
POST API: http://localhost:8081/products

Request Body:
   {
      "id": 12,
      "name": "Laptop",
      "description": "This is laptop product.",
      "dateOfBirth": "1996-07-10T00:00:00.000+00:00"
   }

# Get all the products from Mongodb
GET API: http://localhost:8081/products
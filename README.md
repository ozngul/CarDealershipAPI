
# 🏁 Getting Started 

<pre> ```git clone https://github.com/Exadus/CarDealershipAPI.git
 cd CarDealershipAPI 
./mvnw spring-boot:run ``` </pre>

# Car Dealership API 🚗

This project is a RESTful Web API for a car dealership built with Java and Spring Boot. It allows users to view, search, add, update, and delete vehicles. It also supports creating and retrieving sales and lease contracts.

## 👨‍💻 Developers
- Umut Tikbas ([@Exaadus](https://github.com/Exaadus))
- Ozan Gül ([@Ozngul](https://github.com/ozngul))

## 🚀 Features
- Full CRUD operations for vehicles
- Search with flexible filters (price, make, model, etc.)
- Sales and lease contracts
- Built using Spring Boot and MySQL

## 🛠️ Tech Stack
- Java 17
- Spring Boot
- Maven
- MySQL
- Postman (for API testing)
- JDBC + BasicDataSource configuration

## 📷 Screenshots


## 💡 Interesting Code Snippet
```java
@GetMapping("/vehicles")
public List<Vehicle> searchVehicles(@RequestParam Map<String, String> filters) {
    return vehicleDao.search(filters);
}

### Kirana Application
This is a simple Kirana application that is used to implement a data recording system.

[Still in process] To run this application, clone this project in your local, use Java 17, have Maven setup in your local and run KiranaApplication.java.

### API'S
1. To store an order into the system you can hit the following endpoint: "http://localhost:8080/orders" [PostMapping. It's a POST API and hence requires a body of JSON type, below is the template for that.\
   {\
   "orderId":8,\
   "buyer": "name",\
   "item":"shoes",\
   "numberOfItems": 5,\
   "costOfSingleItem": 9,\
   "currency": "INR"\
   }\
    If you make a request using USD, the application hits an external API to perform foreign exchange and stores it in INR.
2. To Fetch all the orders in the system just hit "http://localhost:8080/orders" [GetMapping].
3. TO fetch the orders in a date interval, just hit "http://localhost:8080/orders/inbetween" [PostMapping]. This requires you to add a body in JSON format and following is the body template.
   
   {\
   "from": "2024-01-13",\
   "to": "2024-01-13"\
   }

### NOTE: APPLICATION IS STILL IN DEVELOPMENT PHASE.
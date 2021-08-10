## Hello Candidate

This project is a service for payment, it is mainly in charge of dealing the order from client, calculating the price and finally return bills to clients. Please help to complete the coding in this project according to the following
requirements within 45 minutes.

### Price Calculating

We total have three kinds of order types: "ONLINE", "OFFLINE", "INTERNAL". Each order type has its own calculating logic, please help to implement the logic in `PaymentService.pay()`;
| Order Type | Logic |  
| -- | -- |  
| ONLINE | The total price = origin price * 85% |  
| OFFLINE | The total price = origin price |  
| INTERNAL | The total price = promotion price + (origin price for other products if any) |  

Notes:
1. Only when the orderType is internal, then the field "involvedPromotions" inside the Order has value;
2. One order only allow maximum one promotion; 
3. Factory design pattern is recommended.

### Unit testing

Please help to implement the Junit test case for the `PaymentService.pay()` method.




POST: 
http://localhost:8081/users
{
  "id": 1,
  "name": "Sardelka Sosiska",
  "email": "sardelka@gmail.com"
}
------
http://localhost:8082/orders
{
  "id": 1,
  "userId": 1,
  "product": "Sasiska"
}
-------
GET: http://localhost:8082/orders/1
------
POST: http://localhost:8082/orders
{
  "id": 2,
  "userId": 2,
  "product": "Kartoshechka"
}
Answer: User not found

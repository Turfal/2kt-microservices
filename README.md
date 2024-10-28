POST: 
http://localhost:8081/users
{
  "id": 1,
  "name": "name",
  "email": "test@mail"
}

![image](https://github.com/user-attachments/assets/3b5a3075-1e95-423e-8c97-5b20f4c6bf36)
------
http://localhost:8082/orders
{
  "id": 1,
  "userId": 1,
  "product": "test"
}

![image](https://github.com/user-attachments/assets/26665383-160e-4afd-ae11-e9995587cf58)
-------
GET: http://localhost:8082/orders/1

![image](https://github.com/user-attachments/assets/6b7f9a67-9e3c-4233-9063-d3af3ec75121)
------
POST: http://localhost:8082/orders
{
  "id": 2,
  "userId": 2,
  "product": "Kartoshechka"
}
![image](https://github.com/user-attachments/assets/bbd6df91-38fc-4322-a367-74538219c55f)

![image](https://github.com/user-attachments/assets/7702c1a4-406d-4719-bc33-ffc0e6266949)

Answer: User not found

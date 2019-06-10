# Microprofile sample project

## Build

```
mvn clean package
```
## Run

```
java -jar target/demo-thorntail.jar
```

## Test

### Request:

```
GET /greetings/2019/06/09 HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: */*
User-Agent: PostmanRuntime/7.13.0
Cache-Control: no-cache
cache-control: no-cache
Postman-Token: 8c02b933-4a52-455b-a60f-817d3fa2f3e3
```

### Response:

```json
{
    "name": "Thorntail",
    "message": "Request date: 2019/6/9",
    "date": "10-06-2019"
}
```

### Request:

```
PUT /greetings/put HTTP/1.1
Host: localhost:8080
Content-Type:  application/json
Accept:  application/json
User-Agent:  PostmanRuntime/7.13.0
Cache-Control:  no-cache
cache-control: no-cache
Postman-Token: ab012b06-876d-40f1-a44f-07f674317c91
{
    "name": "Kiet T. Tran",
    "message": "My put request",
    "date": "10-06-2019"
}------WebKitFormBoundary7MA4YWxkTrZu0gW--
```

```json
{
    "name": "Kiet T. Tran",
    "message": "My put request",
    "date": "10-06-2019"
}
```

### Response:

```json
{
    "name": "Thorntail to Kiet T. Tran",
    "message": "Hello, 'Kiet T. Tran' from student-VirtualBox/19062@student-VirtualBox",
    "date": "10-06-2019"
}
```
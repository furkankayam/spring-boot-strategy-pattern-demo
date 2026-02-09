# 💳 Spring Boot Strategy Pattern Demo

### Project Summary:

- This project demonstrates the use of **Strategy Design Pattern** for managing different payment methods (Crypto, Card). It is designed to process various payment types through a single endpoint and manage the specific logic for each payment method in an isolated manner using the Strategy Pattern. The system adheres to the Open/Closed Principle, allowing new payment methods to be easily added.

<br>

---

### Tech Stack:

[![Java](https://img.shields.io/badge/java-17.0-000?style=for-the-badge&logo=openjdk&logoColor=white&color=FF9A00)](https://www.java.com/en/)
[![Spring Boot](https://img.shields.io/badge/spring%20boot-4.0.2-000?style=for-the-badge&logo=springboot&logoColor=white&color=6DB33F)](https://spring.io/)
[![Lombok](https://img.shields.io/badge/Lombok-000?style=for-the-badge&logo=lombok&logoColor=white&color=BC2043)](https://projectlombok.org/)
[![Gradle](https://img.shields.io/badge/Gradle-9.2-000?style=for-the-badge&logo=gradle&logoColor=white&color=02303A)](https://gradle.org/)
[![Open API](https://img.shields.io/badge/Open%20API-2.8-000?style=for-the-badge&logo=openapiinitiative&logoColor=white&color=6BA539)](https://springdoc.org/)
[![Docker](https://img.shields.io/badge/Docker-28.3-000?style=for-the-badge&logo=Docker&logoColor=white&color=2496ED)](https://docs.docker.com/)
[![Docker Compose](https://img.shields.io/badge/Docker%20Compose-3.7-000?style=for-the-badge&logo=Docker&logoColor=white&color=2496ED)](https://docs.docker.com/compose/)

<br>

---

### 🚀 Setup

#### Application Configuration

```yaml
server:
  port: 8080
```

<br>

#### Start Application

```bash
docker-compose up -d
```

<br>

---

### 📚 API Documentation

#### 💰 Payment Operations

<details>
<summary>💳 Crypto Payment </summary>

![Response 1](./images/response1.png)

</details>

<details>
<summary>💵 Card Payment </summary>

![Response 2](./images/response2.png)

</details>

<br>

#### Request Example

```bash
POST /payment/strategy
Content-Type: application/json

{
  "type": "CRYPTO",
  "cryptoName": "Ethereum",
  "amount": 10000000
}
```

<br>

#### Response Example

```json
{
  "paymentResponse": {
    "name": "2",
    "cryptoName": "Ethereum",
    "amount": 10000000
  }
}
```

<br>

---

### 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details

**Created by** [Mehmet Furkan KAYA](https://www.linkedin.com/in/mehmet-furkan-kaya/)
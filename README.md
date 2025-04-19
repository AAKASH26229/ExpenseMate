# 💰 ExpenseMate

**ExpenseMate** is a personal wallet management backend built with Java and Spring Boot. It helps users manage income, expenses, and budgets securely and efficiently. Whether you're budgeting your monthly salary or tracking daily expenses, ExpenseMate provides the essential tools to take control of your finances.

---

## 🚀 Features

- 🔐 User authentication (JWT-based)
- 📥 Add, update, delete income & expense transactions
- 🗂️ Categorize expenses (Food, Rent, Travel, etc.)
- 📊 Budget tracking and alerts
- 📅 Filter transactions by date
- 📈 Dashboard-ready API for summaries and charts

---

## 🛠 Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Security + JWT
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Lombok

---

## 📁 Project Structure
src/ ├── config # Security & JWT configuration ├── controller # API endpoints ├── dto # Request/response models ├── exception # Custom exceptions & handling ├── model # JPA entities ├── repository # Database operations └── service # Business logic

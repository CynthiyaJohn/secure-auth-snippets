# 🔐 Secure Auth Snippets

A small collection of **security-focused Java and Python code snippets**
demonstrating **common authentication mistakes** and their **secure alternatives**.
This repository is intended for **learning, interview preparation, and security awareness**.

---

## 📌 Focus Areas

- Plaintext password vulnerabilities
- Secure password hashing practices
- Insecure vs secure login implementations
- Defensive coding mindset

---

## 📂 Structure

```

secure-auth-snippets/
├── python/
│   ├── insecure_password_check.py
│   └── secure_password_hashing.py
│
├── java/
│   ├── InsecureLogin.java
│   └── SecureLogin.java
└── README.md

---

## ▶️ How to Run

### Python
```bash
pip install bcrypt
python secure_password_hashing.py
````

### Java

```bash
javac SecureLogin.java
java SecureLogin
```

---

## 🧠 Key Insight

Passwords should **never** be stored or compared in plaintext.
Always use **strong, one-way hashing mechanisms**.

---

## ⚠️ Disclaimer

These snippets are **educational examples only**
and are **not production-ready implementations**.

```

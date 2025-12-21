# 🔐 Secure Auth Snippets

A curated collection of **security-focused Java and Python code snippets**
demonstrating **common authentication vulnerabilities** alongside their
**secure, industry-aligned alternatives**.

This repository is intentionally **snippet-based** — each file focuses on
**one security concept**, making it easy to understand, explain, and discuss
during **technical interviews**.

---

## 🎯 Purpose of This Repository

This project is designed for:

- 💡 Learning **secure coding practices**
- 🎯 **Technical interview preparation**
- 🛡️ Developing a **security-first mindset** as a software engineer

Rather than building a large framework-based system, this repository focuses on
**small, explainable, and realistic security scenarios**.

---

## 🧠 Key Security Concepts Covered

- Plaintext password storage vulnerabilities
- Secure password hashing and salting
- Password strength and reuse checks
- Insecure vs secure login implementations
- Hardcoded credentials vs environment-based secrets
- Timing attacks and constant-time comparison
- Username enumeration vulnerabilities
- Brute-force attempts and account lockout logic
- Input validation vs sanitization pitfalls
- Weak randomness vs cryptographically secure randomness
- Common string comparison mistakes in authentication logic

---

## 📂 Repository Structure

```

secure-auth-snippets/
│
├── java/
│   ├── InsecureLogin.java
│   ├── SecureLogin.java
│   ├── HardcodedCredentials.java
│   ├── EnvironmentBasedLogin.java
│   ├── TimingAttackExample.java
│   ├── StringComparisonPitfall.java
│   └── WeakRandomVsSecureRandom.java
│
├── python/
│   ├── insecure_password_check.py
│   ├── plain_text_password_storage.py
│   ├── secure_password_hashing.py
│   ├── salted_password_hashing.py
│   ├── constant_time_compare.py
│   ├── password_strength_check.py
│   ├── password_reuse_check.py
│   ├── bruteforce_login_attempt.py
│   ├── account_lockout.py
│   ├── username_enumeration.py
│   └── input_validation_vs_sanitization.py
│
├── docs/
│   └── (authentication-related documentation)
│
├── docs.txt
└── README.md

````

---

## ▶️ How to Run the Snippets

### 🐍 Python

Some hashing examples require `bcrypt`:

```bash
pip install bcrypt
````

Run any Python file:

```bash
python secure_password_hashing.py
```

Each file is **independent** and can be executed directly.

---

### ☕ Java

Compile and run any Java example:

```bash
javac SecureLogin.java
java SecureLogin
```

> Environment-based examples require setting environment variables
> before execution.

---

## 🧠 Key Takeaways

* Passwords should **never** be stored or compared in plaintext
* Secrets must **not** be hardcoded in source code
* Always use **strong hashing with salting** for credentials
* Prevent information leakage through **generic error messages**
* Use **constant-time comparisons** for sensitive values
* Security is about **eliminating entire attack classes**, not fixing symptoms

---

## ⚠️ Disclaimer

These snippets are **educational demonstrations only**.

They are intentionally minimal and **not production-ready authentication systems**.
Their goal is to **teach concepts**, encourage **defensive thinking**, and support
**interview discussions**, not to be used as drop-in solutions.

---

## ⭐ Why This Repo Stands Out

* Focuses on **security fundamentals**, not frameworks
* Easy to explain in interviews
* Demonstrates **defensive and attacker-aware thinking**
* Shows practical understanding of **real-world auth mistakes**

```

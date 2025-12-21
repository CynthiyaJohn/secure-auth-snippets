# Hashing vs Encryption

## Hashing
Hashing converts data into a fixed-length value using a **one-way function**.

Characteristics:
- Irreversible
- Same input → same output
- Used for password storage

Examples:
- bcrypt
- SHA-256 (with salt)

---

## Encryption
Encryption converts data into a scrambled format using a **reversible algorithm**.

Characteristics:
- Reversible with a key
- Protects data at rest and in transit

Examples:
- AES
- RSA

---

## Key Difference

| Hashing | Encryption |
|-------|------------|
| One-way | Two-way |
| Cannot be reversed | Can be decrypted |
| Used for passwords | Used for data |

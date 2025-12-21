# Authentication vs Authorization

## Authentication (AuthN)
Authentication is the process of verifying **who a user is**.

Examples:
- Username and password
- OTP verification
- Biometric checks

Authentication always happens **first**.

---

## Authorization (AuthZ)
Authorization determines **what an authenticated user is allowed to do**.

Examples:
- Accessing admin pages
- Reading or modifying resources
- Role-based permissions

Authorization happens **after authentication**.

---

## Key Difference

| Authentication | Authorization |
|---------------|---------------|
| Who are you? | What can you do? |
| Identity check | Permission check |
| Happens first | Happens after |

# Timing Attacks

A timing attack exploits **response time differences**
to infer sensitive information such as passwords.

---

## Example
Using direct equality checks (`==`) can leak timing information.

---

## Prevention
- Use constant-time comparison functions
- Normalize error responses
- Avoid early returns during secret comparisons

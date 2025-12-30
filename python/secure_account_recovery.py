#Concept: Token-based recovery instead of security questions

import secrets

def generate_recovery_token():
    return secrets.token_urlsafe(24)

print("Recovery token:", generate_recovery_token())

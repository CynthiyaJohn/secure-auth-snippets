import secrets

def generate_reset_token():
    return secrets.token_urlsafe(32)

print(generate_reset_token())

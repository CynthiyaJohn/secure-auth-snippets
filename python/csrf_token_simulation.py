import secrets

def generate_csrf_token():
    return secrets.token_hex(16)

print("CSRF Token:", generate_csrf_token())

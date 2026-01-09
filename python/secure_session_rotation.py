import secrets

def login():
    new_session = secrets.token_hex(16)
    return f"New session issued: {new_session}"

print(login())

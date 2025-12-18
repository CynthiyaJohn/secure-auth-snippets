def login(username, password):
    stored_password = "admin123"  # hardcoded password (BAD)
    return password == stored_password

print(login("admin", "admin123"))

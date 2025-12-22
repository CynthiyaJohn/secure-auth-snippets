password = "secret"

for attempt in ["1234", "admin", "secret"]:
    if attempt == password:
        print("Password cracked:", attempt)
        break

users = {"admin": "hash"}

def login(username):
    if username not in users:
        return "User not found"   # BAD
    return "Wrong password"

print(login("guest"))

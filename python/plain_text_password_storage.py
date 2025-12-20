users = {"admin": "password123"}

def login(user, password):
    return users.get(user) == password

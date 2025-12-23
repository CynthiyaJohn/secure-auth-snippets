import time

REQUEST_LIMIT = 3
requests = {}

def login(user):
    now = time.time()
    requests.setdefault(user, [])
    requests[user] = [t for t in requests[user] if now - t < 60]

    if len(requests[user]) >= REQUEST_LIMIT:
        return "Too many attempts. Try later."

    requests[user].append(now)
    return "Login attempt recorded"

print(login("admin"))
print(login("admin"))
print(login("admin"))
print(login("admin"))

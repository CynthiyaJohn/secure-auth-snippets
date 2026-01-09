def login(session_id):
    # ❌ session reused after login
    return f"User logged in with session {session_id}"

print(login("fixed-session-123"))

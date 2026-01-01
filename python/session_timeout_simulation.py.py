import time

SESSION_START = time.time()
SESSION_TIMEOUT = 5  # seconds

def is_session_valid():
    return (time.time() - SESSION_START) < SESSION_TIMEOUT

time.sleep(6)
print("Session valid:", is_session_valid())


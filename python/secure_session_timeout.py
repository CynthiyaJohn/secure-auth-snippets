#Concept: Proper session expiry check
import time

class Session:
    def __init__(self, ttl):
        self.created_at = time.time()
        self.ttl = ttl

    def is_valid(self):
        return (time.time() - self.created_at) < self.ttl

s = Session(5)
time.sleep(3)
print("Session valid:", s.is_valid())

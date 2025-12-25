import time

def insecure_check(a, b):
    for x, y in zip(a, b):
        if x != y:
            return False
        time.sleep(0.1)
    return True

print(insecure_check("secret", "secrex"))

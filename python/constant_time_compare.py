import hmac

def secure_compare(a, b):
    return hmac.compare_digest(a, b)

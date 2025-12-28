# MFA bypass simulation due to missing OTP verification

def login(username, password, otp=None):
    if username == "admin" and password == "secret":
        # ❌ OTP is not enforced
        return "Login successful"
    return "Login failed"

print(login("admin", "secret"))        # MFA bypass
print(login("admin", "secret", "123456"))

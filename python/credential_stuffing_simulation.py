#Concept: Credential stuffing attack

leaked_passwords = ["123456", "password", "admin123"]
real_password = "admin123"

for pwd in leaked_passwords:
    if pwd == real_password:
        print("Account compromised using:", pwd)
        break

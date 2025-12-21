MAX_ATTEMPTS = 3
attempts = 0

while attempts < MAX_ATTEMPTS:
    pwd = input("Enter password: ")
    if pwd == "secret":
        print("Login success")
        break
    attempts += 1
else:
    print("Account locked")

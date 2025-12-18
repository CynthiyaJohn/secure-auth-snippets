import bcrypt

password = b"admin123"

hashed = bcrypt.hashpw(password, bcrypt.gensalt())

print("Hashed:", hashed)
print("Verified:", bcrypt.checkpw(password, hashed))

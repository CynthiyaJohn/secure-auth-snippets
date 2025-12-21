old_passwords = {"hash1", "hash2"}

def is_reused(new_hash):
    return new_hash in old_passwords

print(is_reused("hash1"))

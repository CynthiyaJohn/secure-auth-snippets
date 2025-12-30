#Concept: Reusing password reset tokens (replay attack)
used_tokens = set()

def reset_password(token):
    if token in used_tokens:
        return "Token already used"
    used_tokens.add(token)
    return "Password reset successful"

print(reset_password("reset123"))
print(reset_password("reset123"))  # replay attack blocked

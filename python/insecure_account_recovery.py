#Concept: Weak security question–based recovery

def recover_account(answer):
    if answer.lower() == "india":
        return "Account recovered"
    return "Recovery failed"

print(recover_account("india"))

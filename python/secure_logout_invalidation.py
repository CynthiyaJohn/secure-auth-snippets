#Concept: Token invalidation on logout

active_tokens = {"token123", "token456"}

def logout(token):
    active_tokens.discard(token)

logout("token123")
print(active_tokens)

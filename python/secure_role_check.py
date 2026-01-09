def access_admin(role):
    if role != "admin":
        return "Access denied"
    return "Admin panel accessed"

print(access_admin("user"))

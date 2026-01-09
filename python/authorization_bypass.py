def access_admin(is_logged_in):
    if is_logged_in:
        return "Admin panel accessed"  # ❌ no role check
    return "Login required"

print(access_admin(True))

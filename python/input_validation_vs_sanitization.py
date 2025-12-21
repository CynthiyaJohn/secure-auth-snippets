def validate(username):
    return username.isalnum()

def sanitize(username):
    return username.replace("<", "").replace(">", "")

print(validate("admin<script>"))
print(sanitize("admin<script>"))

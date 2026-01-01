ALLOWED_DOMAINS = ["example.com", "myapp.com"]

def redirect(url):
    if any(domain in url for domain in ALLOWED_DOMAINS):
        return f"Redirecting to {url}"
    return "Invalid redirect"

print(redirect("http://evil.com"))
print(redirect("https://myapp.com/dashboard"))

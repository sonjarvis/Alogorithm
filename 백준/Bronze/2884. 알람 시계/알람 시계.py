H, M = map(int, input().split())

if M < 45:
    H -= 1
    M = 60 - (45 - M)
    if H < 0:
        H = 23;
    print(H, M)
else:
    print(H, (M-45))
    
A, B, V = map(int, input().split())
days = (V - A) / (A - B)

if days == round(days):
    print(int(days + 1))
else:
    print(round(days+1.5))

dot = []
x = []
y = []

for _ in range(3):
    dot.append(list(map(int, input().split())))

for [a, b] in dot:
    if a in x:
        x.remove(a)
    else:
        x.append(a)

    if b in y:
        y.remove(b)
    else:
        y.append(b)

print(x[0], y[0])

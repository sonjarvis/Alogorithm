a,b = map(int, input().split())
c = list(map(int,input().split()))

for i in range(a):
    if b > c[i]:
        print(c[i], end=' ')

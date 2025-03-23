num = input()
count = int(num)
number = list(map(int,input().split(' ')))
if len(number) == int(num):
    for i in number:
        if i != 1:
            for j in range(2,i):
                if (i/j) % 1 == 0:
                    count -=1
                    break
        else:
            count -=1
else:
    pass
print(count)
 

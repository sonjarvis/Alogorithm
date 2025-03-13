case_num = int(input())
result = []
for i in range(case_num):
    word = list(str(input()))
    
    for k in range(len(word)):
        if k != len(word)-1 and word[k] == word[k+1]:
            pass
        elif word[k+1:].count(word[k]) != 0:
            break
        elif k == len(word) - 1:
            result.append(i)

print(len(result))

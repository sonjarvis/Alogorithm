croatia_word = str(input())
croatia_reference = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
for word in croatia_reference:
    croatia_word = croatia_word.replace(word, "0")
print(len(croatia_word))

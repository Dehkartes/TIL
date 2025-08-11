text = input()
print(sum(1 for i in range(len(text) - 3) if text[i : i + 4] == "DKSH" ))
n=int(input(" give an integer : "))
for i in range(n+1):
    for j in range(i+1):
        print(j, end=" ")
    print()
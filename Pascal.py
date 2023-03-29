# function to print Pascal's Triangle
def printPascal(n):
    # initializations
    a = []

    # loop through each row
    for i in range(n):
        # add a new row
        a.append([])
        # loop through each element in the row
        for j in range(i+1):
            # add the value to the row
            if j==0 or j==i:
                a[i].append(1)
            else:
                a[i].append(a[i-1][j-1] + a[i-1][j])

    # print the triangle
    for i in range(n):
        print(' '*(n-i-1), end=' ')
        for j in range(i+1):
            print(a[i][j], end=' ')
        print()

# main program
n = int(input("Enter the number of lines for Pascal's Triangle: "))
printPascal(n)

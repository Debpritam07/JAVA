length = float(input("Enter the length of the farm (in feet): "))
breadth = float(input("Enter the breadth of the farm (in feet): "))

tree_distance = 2.0 # Distance between each tree in feet

rows = int(length / tree_distance)
columns = int(breadth / tree_distance)

total_trees = rows * columns

print(f"\nNumber of rows: {rows}")
print(f"Number of columns: {columns}")
print(f"Total number of trees required: {total_trees}")

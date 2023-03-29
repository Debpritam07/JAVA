import math

def distance(x1, y1, x2, y2):
    return round(math.sqrt((x1-x2)**2 + (y1-y2)**2), 2)

n = int(input("Enter the number of points: "))

points = []
for i in range(n):
    x = float(input(f"Enter the x-coordinate of point {i+1}: "))
    y = float(input(f"Enter the y-coordinate of point {i+1}: "))
    points.append((x, y))

max_dist = 0
max_pair = None

for i in range(n):
    for j in range(i+1, n):
        dist = distance(points[i][0], points[i][1], points[j][0], points[j][1])
        if dist > max_dist:
            max_dist = dist
            max_pair = (i, j)

print(f"The farthest pair of points is {points[max_pair[0]]} and {points[max_pair[1]]} with distance {max_dist}.")

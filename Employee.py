# Read the number of hours worked on each day of the week
hours_worked = []
for i in range(5):
    hours = float(input("Enter the number of hours worked on day {}:".format(i+1)))
    hours_worked.append(hours)

# Calculate the average number of hours worked per day
total_hours = sum(hours_worked)
average_hours = total_hours/5

# Print the average number of hours worked per day
print("Average number of hours worked per day: {:.2f}".format(average_hours))

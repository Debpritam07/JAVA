# Read the input values
n = int(input("Enter the number of labourers engaged in work: "))
t = int(input("Enter the total number of toys to be made: "))
d = int(input("Enter the total number of days allotted for completion: "))
d1 = int(input("Enter the number of days work had been done: "))
t1 = int(input("Enter the number of toys made in d1 days: "))

# Calculate the number of toys that can be made by 'n' men in 'd1' days
toys_per_day_per_man = t1 / (n * d1)

# Calculate the total number of toys that can be made in 'd' days with 'n' men
total_toys_with_n_men = n * toys_per_day_per_man * d

# Calculate the number of additional men required to make the remaining toys in time
additional_men = (t - total_toys_with_n_men) / (toys_per_day_per_man * (d - d1))

# Round up the number of additional men to an integer
additional_men = int(additional_men) + 1 if additional_men % 1 != 0 else int(additional_men)

# Output the result
print("Number of additional men required: ", additional_men)

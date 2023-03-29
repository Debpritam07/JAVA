dob = input("Enter the date of birth in the format 'dd/mm/yyyy': ")
current_year = int(input("Enter the current year: "))

dob_day, dob_month, dob_year = map(int, dob.split('/'))

num_birthdays = 0

if dob_month == 2 and dob_day == 29:
    for year in range(dob_year, current_year+1, 4):
        if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
            num_birthdays += 1
else:
    num_birthdays = current_year - dob_year

print(f"Mr. X has celebrated {num_birthdays} birthdays so far.")

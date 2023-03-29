initial_amt = float(input("Enter the initial amount: "))
n_years = int(input("Enter the number of years of investment: "))
expected_amt = float(input("Enter the expected amount after n years: "))

rate_of_interest = ((expected_amt - initial_amt) / (initial_amt * n_years)) * 100

print(f"The rate of interest for your investment is {rate_of_interest}%")

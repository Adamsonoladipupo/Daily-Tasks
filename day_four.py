
user_input = int(input("Enter the month of the year (from 1 - 12): "))
if user_input >= 1 and user_input <= 3:
    print("First quarter of the year")
elif user_input >= 4 and user_input <= 6:
    print("Second quarter of the year")
elif user_input >= 7 and user_input <= 9:
    print("Third quarter of the year")
elif user_input >= 10 and user_input <= 12:
    print("Fourth quarter of the year")
else:
    print("Invalid user input")
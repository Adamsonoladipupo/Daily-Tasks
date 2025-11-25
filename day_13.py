def  find_next_square(number):
    new_perfect_square = 0
    if (number ** 0.5) % 1 == 0:
        while (number+1 ** 0.5) != 0:
            number += 1
            if (number ** 0.5) % 1 == 0:
                new_perfect_square = number
                break
        return new_perfect_square
    else:
        return -1


print("Welcome, this function helps you get the next perfect sqaure after your input")
user_input = int(input("Enter a number: "))
print(find_next_square(user_input))

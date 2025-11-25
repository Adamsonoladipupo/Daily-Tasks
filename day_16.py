def get_integer_array(input):
    new_list = []
    for count in range (input, 0, -1):
        new_list.append(count)
    return new_list

user_input = 5
print(get_integer_array(user_input))
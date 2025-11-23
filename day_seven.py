sentence = "This nigga is a good programmer"
new_word = ""
temp_word = ""
for word in sentence:
    new_word += word
    if word == " ":
        for letter in word:
            print(letter)


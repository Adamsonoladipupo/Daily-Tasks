
words = "I love programming"

new_list = []
word = ""
def slipt_word(input):
	return input != " "
space = list(filter(slipt_word, words))
print(space)
def to_upper(inputs):
	if type(inputs) == int:
		return TypeError ("Invalid integer inputs, only strings allowed"")
	inputs = inputs.upper()
	return inputs

words = "The lord is good"
print(to_upper(words))
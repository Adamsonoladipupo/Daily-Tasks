function split_string(user_input){
	new_array = user_input.split(" ");
	return new_array;
}

sentence = "I love programming";
console.log(split_string(sentence));
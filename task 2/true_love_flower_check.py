def true_love_check(male, female):
	check = male + female
	check = check % 2 == 1
	return check 

timmy = int(input("Hey Timmy, pick a number: "))
sarah = int(input("Hey Sarah, pick a number: "))
love = true_love_check(timmy, sarah)
print ("True Love: ", (love))
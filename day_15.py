def get_present_sheep(array):
    present = 0
    for sheep in array:
        if sheep == True:
            present += 1
    return present


sheep_array = [True,  True,  True,  False,  True,  True,  True,  True ,True,  False, True, False,  True,  False, False, True ,True,  True,  True,  True ,False, False, True,  True,]
result = get_present_sheep(sheep_array)
print("Number of sheep present: ",result)
function get_present_sheep(array){
    let present = 0;
    for (let sheep of array){
        if (sheep == true){
            present++;
        }
    }
    return present;
}

sheep_array = [true,  true,  true,  false,  true,  true,  true,  true ,true,  true, true, true,  true,  false, false, true ,true,  true,  true,  true ,false, false, true,  true,]
result = get_present_sheep(sheep_array)
console.log("number of present sheeps: ",result)
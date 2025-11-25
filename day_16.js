const prompt = require("prompt-sync")({sigint: true})

function get_integer_array(input){
    new_array = []
    for (let count = input; count > 0; count--){
        new_array.push(count);
    }
    return new_array
}

let user_input = prompt("Enter a number: ");
console.log(get_integer_array(user_input));
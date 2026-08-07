function registration(){
    console.log("Let get the party started")
    fetch('http://localhost:8080/registration', {
        method: 'POST',
        headers: {
            'Content-Type':'application/json'
        },
        body: JSON.stringify({
            name: 'Adam',
            username: 'adams',
            email: 'adams@gmail.com',
            country:'Nigeria',
            password: 'adams'
        })
    })
    .then(response => {return response.json()})
    .then(rgstdUser => console.log(rgstdUser))
}

// registration()
const regForm = document.getElementById("regForm")
regForm.addEventListener('submit', (event)=>{
    event.preventDefault();
    


})
console.log(regForm)
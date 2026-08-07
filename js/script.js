// fetching data
// ====================================

// fetch ('https://fakestoreapi.com/users/20')
// .then(response => response.json())
// .then(data => console.log(data))
// .catch(error => console.log('error'))

fetch('http://localhost:8080/user/users')
.then(response => response.json())
.then(user => console.log(user))


// posting data
// =================================

// const formButton = document.getElementById("submit_button")

// fetch ('http://localhost:8080/registration', {
//     method: 'POST',
//     headers:{'Content-Type': 'application/json'},
//     body: JSON.stringify({
//         name:"bolanle",
//         username:"bolanle",
//         email:"bolanle@gmail.com",
//         country: "Nigeria",
//         password: 'bolanle'
//     })
// })
// .then(response => {
//     return response.json()
// })
// .then(data => console.log(data))
// .catch(error => console.log('error'))
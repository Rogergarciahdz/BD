

document.getElementById('formTest')
    .addEventListener('submit', function (event) {
        event.preventDefault();
let email=document.getElementById("email_id").value
let pass=document.getElementById("pssw_id").value
      
		
		const form = {
  			correo:email,
  			password:pass
  			
		};
		console.log(form);
		const url ='/api/usuario/';
		fetch(url, {
    method: "POST",
    headers: {
     'Content-Type': 'application/json',
    },
  
     body: JSON.stringify(form),
    
  })
    .then((response) => response.json())
    .then((form) => {
      console.log(form);
      // code here //
      if (error) {
        swal("Error", "El correo o contraseña son inválidos", "error");
      } else {
         window.location.replace("http://127.0.0.1:5512/userprofile.html");
      }
    })
    .catch((err) => {
      console.log(err);
    });
});
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       

       
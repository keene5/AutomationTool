alert("I'm active");



document.getElementById('reportbtn').addEventListener("click", function(){

    getReport();

});

function getReport() {
    console.log('inside fetch');

    fetch('http://localhost:8080/automation/report')
        .then(
            function(response) {
                if (response.status !== 200) {
                    console.log('Looks like there was a problem. Status Code: ' +
                        response.status);
                    return;
                }

                // Examine the text in the response
                console.log('Response200');
                response.json().then(function(data) {
                    console.log(data);
                    let myJson = JSON.stringify(data);
                    document.getElementById('demo').innerHTML = myJson;
                });
            }
        )
        .catch(function(err) {
            console.log('Fetch Error :-S', err);
        });


    // fetch('http://some-site.com/cors-enabled/some.json', {mode: 'cors'})
    //     .then(function(response) {
    //         return response.text();
    //     })
    //     .then(function(text) {
    //         console.log('Request successful', text);
    //     })
    //     .catch(function(error) {
    //         log('Request failed', error)
    //     });
}



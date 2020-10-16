
document.getElementById('getScenarioData').addEventListener("click", function(){
    getScenarioData();
});

function getScenarioData() {
    console.log('inside fetch');

    fetch('http://localhost:8080/automation/scenariodata')
        .then(
            function (response) {
                if (response.status !== 200) {
                    console.log('Looks like there was a problem. Status Code: ' +
                        response.status);
                    return;
                }

                // Examine the text in the response
                console.log('Response200');
                response.json().then(function (data) {
                    console.log(data);
                    let myJson = JSON.stringify(data);
                    insertScenarioDataRow(data);

                    //document.getElementById('demo').innerHTML = myJson;
                });
            }
        )
        .catch(function (err) {
            console.log('Fetch Error :-S', err);
        });
}

function insertScenarioDataRow(data){
    console.log(data);

}

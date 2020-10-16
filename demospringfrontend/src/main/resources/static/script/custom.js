



document.getElementById('getReport').addEventListener("click", function(){
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
                    insertReportRow(data);

                    //document.getElementById('demo').innerHTML = myJson;
                });
            }
        )
        .catch(function(err) {
            console.log('Fetch Error :-S', err);
        });}

    function clearTable(){
        let tableHeaderRowCount = 1;
        let table = document.getElementById('report-table');
        let rowCount = table.rows.length;
        for (var i = tableHeaderRowCount; i < rowCount; i++) {
            table.deleteRow(tableHeaderRowCount);
        }
    }

    function insertReportRow(data) {
        clearTable();
        let table = document.getElementById("report-table");
       for(let i = 0; i < data.length; i++){
           let row = table.insertRow(i+1);
           let jurisdiction = row.insertCell(0);
           let scenarioId = row.insertCell(1);
           let scenarioDescription = row.insertCell(2);
           let scenarioStatus = row.insertCell(3);
           let combineId = row.insertCell(4);
          combineId.appendChild(createCombineIdLink());
           jurisdiction.innerHTML = data[i].jurisdiction;
           scenarioId.innerHTML = data[i].scenarioId;
           scenarioDescription.innerHTML = data[i].scenarioDescription;
           scenarioStatus.innerHTML = data[i].status;
       }
    }


    function createCombineIdLink(){
        let link = document.createElement("a");
    link.setAttribute("href", "/combinedata");
    link.className = "someCSSclass";
// For IE only, you can simply set the innerText of the node.
// The below code, however, should work on all browsers.
    var linkText = document.createTextNode("Click me");
    link.appendChild(linkText);

// Add the link to the previously created TableCell.
    //newCell.appendChild(link);
        console.log(link);
        return link;
    }



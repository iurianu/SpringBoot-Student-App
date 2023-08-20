$.ajax(
    {
        type: "GET",
        contentType: "application/json",
        url:"/api/v1/student",
        cache: false,
        success: getResults,
        error: setErrorMessage
    }
)

function setErrorMessage(e) {
    console.log("Error" , e)
}

function getResults(result) {
    
    result.forEach((student) => {
        let tableContent = "<tr id='" + student.id + "'><td>" + student.name + "</td><td>" + student.email + "</td><td>" + student.dob + "</td><td>" + student.age + "</td></tr>"
        $('#first').append(tableContent)
    })

}

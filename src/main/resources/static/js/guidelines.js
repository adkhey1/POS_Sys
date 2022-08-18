
function updateTextValue(){
    var valueSection = document.getElementById("chooise");

    if(valueSection=="Service"){
        document.getElementById("firstText").hidden = true;
        document.getElementById("service").hidden = false;
    }

    if(valueSection=="Text1"){
        document.getElementById("firstText").hidden = false;
        document.getElementById("service").hidden = true;
    }
}

function getTermsOfUse(){
    document.getElementById("firstText").hidden = false;
    document.getElementById("service").hidden = true;
}




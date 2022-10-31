async function app(choice) {

    /*  Das könnte ein Json Objekt mit verschiedenen Parametern sein, die man unten
        bei body: JSON.stringify(choice) in die klammer macht
    const choice = {
        choice: choice,
        text: "your choice"
    }
     */

    $.ajax({
        async: "true",
        type: "POST",
        global: false,
        crossDomain: true,
        headers: {  'Access-Control-Allow-Origin': '*' },
        url: "http://localhost:8080/getPrices",
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            choice: choice
        }),
        success: function (data) {
            console.log(data)
        }
    });
}

/*
let priceList = null;

getpriceData()

async function getpriceData() {


    await $.ajax({
        'async': "false",
        'type': "GET",
        'global': false,
        'url': "/getPrice",
        //'contentType': "text",
        //'data':businessID.toString(),
        'contentType': "application/json; charset=utf-8",
        //'data': JSON.stringify({business_id: businessID}),
        //dataType: "json",
        'success': function (data) {
            //console.log("test")
            //console.log(data)
            priceList = data


        }
    });
}

$.when(getpriceData()).done(function () {
    console.log(priceList)
    allPrices()

});

function allPrices(){

    const ctx = document.getElementById("allPrices")

    function clickHandler(click) {
        getMoreInfo(priceList.countFranchise[points[0].index])
    }
    ctx.onclick = clickHandler;

    ctx.hidden = false;
}
function getMoreInfo(prices){};
 */

let moreButtons = document.getElementById("allPrices")
let testButton = document.getElementById("testButton")

testButton.addEventListener("click", getMoreInfo);

function getMoreInfo(){
    moreButtons.hidden = false;
}

async function app(choice) {

    /*  Das könnte ein Json Objekt mit verschiedenen Parametern sein, die man unten
        bei body: JSON.stringify(choice) in die klammer macht
    const choice = {
        choice: choice,
        text: "your choice"
    }
     */

    const results = fetch("http://localhost:8080/getPrices", {
        method: "POST",
        mode: 'no-cors',
        headers: {
            "Content-Type": "application/json" //inhalt von request ist json
        },
        body: JSON.stringify({
            choice: choice
        })
    })

    const resultInJson = await results.json()
    console.log(resultInJson);
}


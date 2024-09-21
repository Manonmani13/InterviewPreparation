const button = document.querySelector('button')
button.addEventListener('click',displayStats)
function displayStats(){
    console.log("hello")
    const input = document.getElementById("input")
    const city=input.options[input.selectedIndex].value
    console.log(city)
    let population = 0, literacyRate = 0, language =''
    let text = `The Indian city of ${city} has a population of ${population}. Language spoken is ${language} and literacy rate is ${literacyRate}%.`
    console.log(text)
    
}

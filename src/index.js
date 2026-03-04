


function findFactors(numbers) {
    const arrayList = [];
    for(let i = 1; i <=numbers; ++i) {
        if(numbers % i === 0 ) {
            arrayList.push(i);
        }
    }
    return arrayList;
}
//if number is 2 then it i = 1 then 1 < 2 then 2 <= 2 SO PUSH [1,2] AS NO REMAINDER 0
function isPrime(numbers) {
    if(numbers === 1 || numbers === 2 ) {
        return false;
    }
    return findFactors(numbers).length === 2;
}


const findFactors = document.getElementById('findFactors');


let maximumNumber = 200;
let minimumNumber = 1;


const apply = document.querySelector('.button').addEventListener('click', function () {
    //const inputNumber = document.getElementById('inputNumber').value;
})
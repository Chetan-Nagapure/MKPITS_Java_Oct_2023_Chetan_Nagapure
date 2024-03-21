let arr=[100,12,12,14,15];

let divTen = arr.filter(divisiblebyten);
function divisiblebyten(num){
    if(num % 10 ==0){
        return num;
    }
}
console.log(divTen);

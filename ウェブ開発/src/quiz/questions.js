const bmi = calculateBmi(1.72, 72);

let message = 'わかりません';

if(bmi < 18.5){
    // 痩せ　１８．５０未満 
    message = '低体重です';
} else if (bmi >= 25.0){
    // 肥満　２５．００以上～
    message = '太っています';
} else{
    // 普通　１８．５０以上～２５．００未満
    message = '普通です';
}

console.log(message);


function calculateBmi(height, weight) {
    // BMI = 体重[kg] / ( 身長[m] x 身長[m] )
	return weight / (height ** 2);
}
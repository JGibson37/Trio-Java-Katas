package fizz_buzz;

public class FizzBuzz {

    public String say(Integer number) {
        if (number % 3 == 0 && number % 5 ==0){
            return "FizzBuzz";
        }else if(number % 3 ==0 && number % 11 ==0){
            return "FizzBANG";
        }else if(number % 3 == 0){
            return "Fizz";
        }else if(number % 5 == 0){
            return "Buzz";
        }else if(number % 11 == 0){
            return "BANG";
        }
        return "" + number;
    }
}

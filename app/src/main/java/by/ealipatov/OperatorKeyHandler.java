package by.ealipatov;

public class OperatorKeyHandler {

    public double processing(String operator, Double res, StringBuilder buf) {
        double result = res;
        double number = 0;

        if (buf.length() > 0) {
            number = Double.parseDouble(String.valueOf(buf));
        }

        switch (operator) {
            case "+":
                if (result == 0.0 && buf.length() > 0) {
                    result = number;
                } else if (result != 0.0 && buf.length() > 0) {
                    result += number;
                }

                break;

            case "-":
                if (result == 0.0 && buf.length() > 0) {
                    result = number;
                } else if (result != 0.0 && buf.length() > 0) {
                    result -= number;
                } else result = res;

                break;

            case "*":
                if (result == 0.0 && buf.length() > 0) {
                    result = number;
                } else if (result != 0.0 && buf.length() > 0) {
                    result *= number;
                } else result = res;
                break;

            case "/":
                if (result == 0.0 && buf.length() > 0) {
                    result = number;
                } else if (result != 0.0 && buf.length() > 0 && number != 0) {
                    result /= number;
                } else result = res;
                break;

            case "%":
                if (result == 0.0 && buf.length() > 0) {
                    result = number;
                } else result = res;

                break;

        }
        return result;
    }

}

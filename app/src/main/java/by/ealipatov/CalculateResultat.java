package by.ealipatov;

public class CalculateResultat {

    public double res(String operator, Double res, StringBuilder buf) {

        switch (operator) {
            case "+":
                if (buf.length() > 0)
                    res += Double.parseDouble(String.valueOf(buf));
                else if (res != null && buf.length() == 0)
                    res += res;

                break;

            case "-":
                if (buf.length() > 0)
                    res -= Double.parseDouble(String.valueOf(buf));
                else if (res != null && buf.length() == 0)
                    res -= res;

                break;

            case "*":
                if (buf.length() > 0)
                    res *= Double.parseDouble(String.valueOf(buf));
                else if (res != null && buf.length() == 0)
                    res *= res;

                break;

            case "/":
                if (buf.length() > 0)
                    res /= Double.parseDouble(String.valueOf(buf));

                break;

            case "%":
                res = (res * Double.parseDouble(String.valueOf(buf))) / 100;

                break;

        }

        return res;
    }


}

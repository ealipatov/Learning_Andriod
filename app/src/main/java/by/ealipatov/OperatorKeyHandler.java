package by.ealipatov;

public class OperatorKeyHandler {

    public double resKey(String operator, Double res, StringBuilder buf) {

        switch (operator) {
            case "+":
                if (res == null && buf.length() > 0)
                    res = Double.valueOf(String.valueOf(buf));
                else if (res != null && buf.length() > 0)
                    res += Double.parseDouble(String.valueOf(buf));
                else if (res != null && buf.length() == 0)
                    res = res;
                else res = null;

                break;

            case "-":
                if (res == null && buf.length() > 0)
                    res = Double.valueOf(String.valueOf(buf));
                else if (res != null && buf.length() > 0)
                    res -= Double.parseDouble(String.valueOf(buf));
                else if (res != null && buf.length() == 0)
                    res = res;
                else res = null;

                break;

            case "*":
                if (res == null && buf.length() > 0)
                    res = Double.valueOf(String.valueOf(buf));
                else if (res != null && buf.length() > 0)
                    res *= Double.parseDouble(String.valueOf(buf));
                else if (res != null && buf.length() == 0)
                    res = res;
                else res = null;

                break;

            case "/":
                if (res == null && buf.length() > 0)
                    res = Double.valueOf(String.valueOf(buf));
                else if (res != null && buf.length() > 0)
                    res /= Double.parseDouble(String.valueOf(buf));
                else if (res != null && buf.length() == 0 && res != 0.0)
                    res = res;
                else res = null;

                break;

            case "%":
                if (res == null && buf.length() > 0)
                    res = Double.valueOf(String.valueOf(buf));

                break;

        }

        return res;
    }

}

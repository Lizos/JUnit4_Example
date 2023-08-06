import java.beans.PropertyEditorSupport;

public class Calculator {
    private Boolean _multiplier_divider; //mode

    public Calculator(Boolean multiplier_divider) {
        _multiplier_divider = multiplier_divider;
    }

    public int calculate_sum_mult(int arg1, int arg2) {
        int result = 0;
        if (_multiplier_divider) {
            result = arg1 * arg2;
        } else {
            result = arg1 + arg2;
        }
        return result;
    }

    public int calculate_diff_div(int arg1, int arg2) {
        int result = 0;
        if (_multiplier_divider) {
            result = arg1 / arg2;
        } else {
            result = arg1 - arg2;
        }
        return result;
    }

}

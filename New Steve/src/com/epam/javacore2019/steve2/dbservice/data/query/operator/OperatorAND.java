package com.epam.javacore2019.steve2.dbservice.data.query.operator;

public class OperatorAND implements BooleanOperator {
    @Override
    public boolean operate(Object... operands) {
        boolean result = true;
        for (Object operand : operands) {
            if (operand instanceof String) {
                result = result && Boolean.valueOf((String)operand);
            } else {
                result = result && (Boolean)operand;
            }
            if (!result) return false;
        }
        return result;
    }
}

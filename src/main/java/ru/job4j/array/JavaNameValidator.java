package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean verity = (isEmpty(name) && isLowerLatinLetter(name.codePointAt(0)));
        if (verity) {
            for (int i = 1; i < name.toCharArray().length; i++) {
                if (!(isSpecialSymbol(name.codePointAt(i)) || isUpperLatinLetter(name.codePointAt(i))
                || isLowerLatinLetter(name.codePointAt(i)) || isDigit(name.codePointAt(i)))) {
                    verity = false;
                    break;
                }
            }
        }
        return verity;
    }

    public static boolean isSpecialSymbol(int code) {
        return  (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code >= 65 && code <= 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (code >= 97 && code <= 122);
    }

    public static boolean isDigit(int code) {
        return (code >= 48 && code <= 57);
    }

    public static boolean isEmpty(String code) {
        return (code.length() != 0);
    }
}

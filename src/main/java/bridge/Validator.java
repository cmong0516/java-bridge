package bridge;

import java.util.regex.Pattern;

public class Validator {
    private static final Pattern NUMBER_PATTERN = Pattern.compile("^[0-9]+$");

    public static void validIsNum(String userInput) {
        if (!NUMBER_PATTERN.matcher(userInput).matches()) {
            System.out.println(ErrorMessage.IS_NOT_NUMBER);
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_NUMBER.getMessage());
        }
    }

    public static void validRange(String userInput) {
        int userInputToInt = Integer.parseInt(userInput);

        if (userInputToInt > 20 || userInputToInt < 3) {
            System.out.println(ErrorMessage.IS_NOT_IN_RANGE);
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_IN_RANGE.getMessage());
        }
    }

    public static void validMovingInput(String userInput) {
        if (!(userInput.equals("U") || userInput.equals("D"))) {
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_PERMIT_MOVING_INPUT.getMessage());
        }
    }

    public static void validGameCommandInput(String userInput) {
        if (!(userInput.equals("R") || userInput.equals("Q"))) {
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_PERMIT_GAME_COMMAND.getMessage());
        }
    }
}

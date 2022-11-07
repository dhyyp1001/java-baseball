package baseball;

import java.util.*;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Application {
    public static void main(String[] args) {

    }

    static int readUser() {
        int result = Integer.parseInt(Console.readLine());
        return result;
    }

    static List<Integer> writeUser() {
        List<Integer> result = new ArrayList<>();
        int userNum = readUser();

        while (userNum > 0) {
            result.add(userNum % 10);
            userNum /= 10;
        }
        Collections.reverse(result);

        return result;
    }


}

package excercise.service;

public class CountableImpl implements Countable {

    @Override
    public int countChar(String text, char ch) {
        int length = text.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            if(text.charAt(i) ==ch) {
                result++;
            }
        }
        return result;
    }




    }


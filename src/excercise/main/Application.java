package excercise.main;

import excercise.service.Countable;
import excercise.service.CountableImpl;

public class Application {
    public static void main(String[] args) {
        Countable counter = new CountableImpl();  // создаем объект counter
        String text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae abba illo inventore veritatis et quasi architecto beatae vitae    dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor   sit /// amet, consectetur, adipisci velit, sed quia non   numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat volupulov. Ut enimine ad minimaamInim veniam, quisiuq nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas ?nuLlun? pariatur?";
        System.out.println(printResult(counter, text, 'v'));
    }

        public static int printResult(Countable countable, String text, char ch){
        return countable.countChar(text,ch); // возвращает метод интерфейса
        }

}

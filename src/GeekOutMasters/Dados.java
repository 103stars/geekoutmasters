package GeekOutMasters;
import java.util.Random;
public class Dados {

    /**
     * Class Dado generate a ramdom value between 1 and 6
     * @author Alexis Lopez and Alejandro Lasso.
     * @version v 1.0.0 date 17/01/2022
     */
    private int cara;

    /**
     * Method that generate and random value to cara
     * @return number betweem (1, 4)
     */

    public int getCara() {
        /*Constructor de la clase Random*/
        Random aleatorio = new Random();
        cara = aleatorio.nextInt(6)+1;
        return cara;
    }
}

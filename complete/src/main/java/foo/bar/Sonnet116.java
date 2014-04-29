package foo.bar;

/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 20.04.14
 * Time: 17:08
 * To change this template use File | Settings | File Templates.
 */
public class Sonnet116 implements Poem {

    private String[] LINES ={
    "Zdrady są w związku dusz wiernych nieznane,",
   " Albowiem miłość nie będzie miłością, ",
    "Jeśli jest zmienna, mogąc mieć odmianę",
    "Lub skłonna odejść za cudzą skłonnością.",
    "Nie!To wzniesiona nad burzy bałwany",
    "Latarnia morska, gwiazda niewzruszona.",
    "Mknie ku niej każdy okręt zabłąkany,",
    "Nieznanej, choć jej wysokość zmierzona.",
    "Miłości w błazna swego nie przetworzy",
    "Czas, choć lic świeżość i róże warg ścina.",
    "Miłość z dnia na dzień się zmienić nie może;",
    "Przetrwa, aż przyjdzie śmiertelna godzina.",
    "Jeśli to błąd jest lub jeśli skłamałem,",
    "Nikt nie miłował, nigdy nie pisałem."
    };

    public Sonnet116(){}

    public void recite(){
    for(int i=0; i< LINES.length;i++){
        System.out.println(LINES[i]);
    }

    }
}

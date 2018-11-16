package at.htl.exam01.document;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */



    public static void main(String[] args) {

        Document[] array = new Document[1000];

        array[0] = new Book("Rowlings", "Harry Potter und der Stein der Weisen");
        array[1] = new Email("Susi","Bewerbung", "CoolCompany");
        array[2] = new Book("Tolkien", "lordOfTheRings");

        ausgabe(array);

    }

    private static void ausgabe(Document[] array) {

        int books = 0;
        int emails = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] instanceof Book){
                System.out.print("Book: ");
                books++;
            }else if(array[i] instanceof Email){
                System.out.println("Email: ");
                emails++;
            }

            System.out.println(array[i].toString());

        }

        System.out.printf("Anzahl Books: %d",books );
        System.out.printf("Anzahl Email: %d",emails );
    }


}


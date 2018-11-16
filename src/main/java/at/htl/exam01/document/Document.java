package at.htl.exam01.document;

abstract public class Document {

    private String author;

    Document(String author){
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public String toString(){
        return null;
    }


}


class Book extends Document {

    String title;

    Book(String author,String title) {
        super(author);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        StringBuilder ausgabe = new StringBuilder();

        ausgabe.append("'");
        ausgabe.append(getTitle());
        ausgabe.append("'");
        ausgabe.append(" von ");
        ausgabe.append("'");
        ausgabe.append(getAuthor());
        ausgabe.append("'");

        return ausgabe.toString();
    }
}

class Email extends Document {

    private String subject;
    private String to;

    Email(String author, String subject, String to){
        super(author);
        this.subject = subject;
        this.to = to;
    }


    public String getSubject() {
        return subject;
    }


    public String getTo() {
        return to;
    }

    @Override
    public String toString(){

        StringBuilder ausgabe = new StringBuilder();

        ausgabe.append("'");
        ausgabe.append(getSubject());
        ausgabe.append("'");
        ausgabe.append(" von ");
        ausgabe.append("'");
        ausgabe.append(getAuthor());
        ausgabe.append("'");
        ausgabe.append(" an ");
        ausgabe.append("'");
        ausgabe.append(getTo());
        ausgabe.append("'");

        return ausgabe.toString();
    }

}
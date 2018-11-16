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

        ausgabe.append(getTitle());
        ausgabe.append(" von ");
        ausgabe.append(getAuthor());

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

        ausgabe.append(getSubject());
        ausgabe.append(" von ");
        ausgabe.append(getAuthor());
        ausgabe.append(" an ");
        ausgabe.append(getTo());

        return ausgabe.toString();
    }

}
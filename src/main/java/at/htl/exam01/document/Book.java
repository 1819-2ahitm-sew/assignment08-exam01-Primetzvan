package at.htl.exam01.document;

import java.util.Formatter;

class Book extends Document {

    String title;

    public Book(String author,String title) {
        super(author);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        StringBuilder ausgabe = new StringBuilder();
        Formatter formatter = new Formatter(ausgabe);

//        ausgabe.append("'");
//        ausgabe.append(getTitle());
//        ausgabe.append("' von '");
//        ausgabe.append(getAuthor());
//        ausgabe.append("'");

        formatter.format("'%s' von '%s'",getTitle(),getAuthor());

        return ausgabe.toString();
    }
}

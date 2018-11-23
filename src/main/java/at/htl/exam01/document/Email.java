package at.htl.exam01.document;

import java.util.Formatter;

class Email extends Document {

    private String subject;
    private String to;

    public Email(String author, String subject, String to){
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
        Formatter formatter = new Formatter(ausgabe);

//        ausgabe.append("'");
//        ausgabe.append(getSubject());
//        ausgabe.append("' von '");
//        ausgabe.append(getAuthor());
//        ausgabe.append("' an '");
//        ausgabe.append(getTo());
//        ausgabe.append("'");

        formatter.format("'%s' von '%s' an '%s' ",getSubject(),getAuthor(),getTo());

        return ausgabe.toString();
    }

}

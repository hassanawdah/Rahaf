package Msg;

//import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
public class message {
    private long id;
    private String message;
    private Date created;
    private String author;

    public message(){

    }
    public message(long id, String message, String author) {
        this.id = id;
        this.message = message;
        this.created = new Date();
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
public void getMsg(){
    System.out.println("Message Test");
}
    public static void main(String[] args) {
        Msg.message m = new message();
        m.getMsg();
        System.out.println("Test");
    }
}

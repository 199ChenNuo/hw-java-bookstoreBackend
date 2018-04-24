package bookstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String writer;
    private double price;
    private String date;
    private String publish;

    protected book() {}

    public book(String name, String writer,double price,String date,String publish) {
        this.name=name;
        this.writer=writer;
        this.price=price;
        this.date=date;
        this.publish=publish;
    }

    @Override
    public String toString() {
        return String.format(
                "book[id=%d, 书名='%s', 作者='%s', 价格=%.2f, 出版日期='%s', 出版社='%s']",
                id, name, writer, price, date, publish);
    }



}

package ato.orramo.orramobackend.domain;

import javax.persistence.*;

@Entity
@Table(name = "datas")
public class Database {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="dataid",nullable = false, updatable = false)
    private int dataid;
    private String email;


    public Database(){

    }
    public Database(String email, int contact) {
        super();
        this.email = email;

    }


    public int getId() {
        return dataid;
    }

    public void setId(int dataid) {
        this.dataid = dataid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

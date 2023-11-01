/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javakanban.classes;

import java.math.BigInteger;

/**
 *
 * @author joao
 */
public class User {
    private BigInteger id;
    private String name;
    private String password;
    private String login;

    public User(BigInteger id, String name, String password, String login) {
        // Para quando pegar do banco de dados
        this.id = id;
        this.name = name;
        this.password = password;
        this.login = login;
    }

    public User(String name, String password, String login) {
        // Para quando criar um novo usuário
        this.name = name;
        this.password = password;
        this.login = login;
    }

    // GETTERS
    public BigInteger getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    // SETTERS
    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password= password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}

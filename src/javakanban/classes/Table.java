/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javakanban.classes;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author joao
 */
public class Table {
    private BigInteger id;
    private String name;
    private String description;
    private ArrayList<Column> columns;
    private User user;

    public Table(BigInteger id, String name, String description, ArrayList<Column> columns, User user) {
        // Para quando pegar do banco de dados
        this.id = id;
        this.name = name;
        this.description = description;
        this.columns = columns;
        this.user = user;
    }

    public Table(String name, String description, ArrayList<Column> columns, User user) {
        // Para quando criar uma nova tabela
        this.name = name;
        this.description = description;
        this.columns = columns;
        this.user = user;
    }

    public Table(BigInteger id, String name, String description, User user) {
        // Para quando pegar do banco de dados
        this.id = id;
        this.name = name;
        this.description = description;
        this.columns = new ArrayList<Column>();
        this.user = user;
    }
    
    public Table(String name, String description) {
        // Para quando criar uma nova tabela
        this.name = name;
        this.description = description;
        this.columns = new ArrayList<Column>();
        this.user = null;
    }

    // GETTERS
    public BigInteger getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Column> getColumns() {
        return columns;
    }

    public User getUser() {
        return user;
    }

    // SETTERS
    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setColumns(ArrayList<Column> columns) {
        this.columns = columns;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // METHODS
    public void addColumn(Column column) {
        this.columns.add(column);
    }

    public void removeColumn(Column column) {
        this.columns.remove(column);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javakanban.classes;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 *
 * @author joao
 */
public class Task {
    private BigInteger id;
    private String name;
    private String description;
    private LocalDateTime created;
    private LocalDateTime updated;
    private LocalDateTime moved;
    private Column column;

    public Task(BigInteger id, String name, String description, LocalDateTime created, LocalDateTime updated, LocalDateTime moved, Column column) {
        // Para quando pegar do banco de dados
        this.id = id;
        this.name = name;
        this.description = description;
        this.column = column;
        
        this.created = created;
        this.updated = updated;
        this.moved = moved;
    }

    public Task(String name, String description, Column column) {
        // Para quando criar uma nova task
        this.name = name;
        this.description = description;
        this.column = column;

        this.created = LocalDateTime.now();
        this.updated = LocalDateTime.now();
        this.moved = LocalDateTime.now();
    }

    public Task(String name, Column column) {
        // Para quando criar uma nova task sem descrição
        this.name = name;
        this.description = "";
        this.column = column;

        this.created = LocalDateTime.now();
        this.updated = LocalDateTime.now();
        this.moved = LocalDateTime.now();
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

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public LocalDateTime getMoved() {
        return moved;
    }

    public Column getColumn() {
        return column;
    }

    // SETTERS
    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setName(String name) {
        this.touch();
        this.name = name;
    }

    public void setDescription(String description) {
        this.touch();
        this.description = description;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = LocalDateTime.now();
    }

    public void setMoved(LocalDateTime moved) {
        this.moved = moved;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    // METHODS
    private void touch(){
        this.updated = LocalDateTime.now();
    }

    public void move(Column column){
        this.column = column;
        this.touch();
        this.moved = LocalDateTime.now();
    }
}

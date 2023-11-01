/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javakanban.classes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author joao
 */
public class Column {
    private BigInteger id;
    private String name;
    private ArrayList<Task> tasks;
    private Table table;

    public Column(BigInteger id, String name, ArrayList<Task> tasks, Table table) {
        // Para quando pegar do banco de dados
        this.id = id;
        this.name = name;
        this.tasks = tasks;
        this.table = table;
    }

    public Column(String name, ArrayList<Task> tasks, Table table) {
        // Para quando criar uma nova coluna
        this.name = name;
        this.tasks = tasks;
        this.table = table;
    }

    // GETTERS
    public BigInteger getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public Table getTable() {
        return table;
    }

    // SETTERS
    public void setId(BigInteger id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    // METHODS
    public void addTask(Task task) {
        this.tasks.add(task);
        task.move(this);
    }

    public void sendTask(Task task, Column column) {
        this.tasks.remove(task);
        column.addTask(task);
    }

    public ArrayList<Task> getStaleTasks(Integer days) {
        // Retorna todas as tasks que já estão numa mesma coluna há mais de 'days' dias
        return this.tasks.stream().filter(
            task -> task.getMoved().plusDays(days).isBefore(java.time.LocalDateTime.now())
        ).collect(Collectors.toCollection(ArrayList::new));
    }
}

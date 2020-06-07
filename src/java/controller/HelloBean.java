/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * CDI --> Context Dependency Injection
 */

@Named
@SessionScoped
public class HelloBean implements Serializable {

    private String name;

    public HelloBean() {
        this.name = "Hello World";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

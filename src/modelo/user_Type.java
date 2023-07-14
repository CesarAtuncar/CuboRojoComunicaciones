/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class user_Type extends User{
    private int id;
    private String name_cargo;

    public user_Type() {
    }

    public user_Type(int id, String name_cargo) {
        this.id = id;
        this.name_cargo = name_cargo;
    }

    public String getName_cargo() {
        return name_cargo;
    }

    public void setName_cargo(String name_cargo) {
        this.name_cargo = name_cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

}

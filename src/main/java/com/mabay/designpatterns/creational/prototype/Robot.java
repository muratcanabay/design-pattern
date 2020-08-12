package com.mabay.designpatterns.creational.prototype;

/**
 * Robot
 *
 * @author Murat Can Abay
 * @since 10/08/2020
 */
public class Robot implements Cloneable {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot clone() {

        Robot clone = null;

        try {
            clone = (Robot) super.clone();
        } catch (ClassCastException e) {
            e.printStackTrace();
            throw new ClassCastException("Cannot cast Object to" + this.getClass());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

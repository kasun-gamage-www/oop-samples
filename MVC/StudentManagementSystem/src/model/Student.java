/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Kasun Gamage
 */
public class Student {

    public Student(long registrationNumber) {
        setRegistrationNumber(registrationNumber);
    }

    private long registrationNumber;
    private String name;
    private int tma1;
    private int tma2;
    private int tma3;

    /**
     * @return the registrationNumber
     */
    public long getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * @param registrationNumber the registrationNumber to set. The Registration
     * number should be unalterable once set. Using a private setter is a better
     * approach than setting it directly in the constructor as this allows
     * implementation of validation rules
     */
    private void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tma1
     */
    public int getTma1() {
        return tma1;
    }

    /**
     * @param tma1 the tma1 to set
     */
    public void setTma1(int tma1) {
        this.tma1 = tma1;
    }

    /**
     * @return the tma2
     */
    public int getTma2() {
        return tma2;
    }

    /**
     * @param tma2 the tma2 to set
     */
    public void setTma2(int tma2) {
        this.tma2 = tma2;
    }

    /**
     * @return the tma3
     */
    public int getTma3() {
        return tma3;
    }

    /**
     * @param tma3 the tma3 to set
     */
    public void setTma3(int tma3) {
        this.tma3 = tma3;
    }

}

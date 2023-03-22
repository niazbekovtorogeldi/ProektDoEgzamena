package person;

import Enam.Gender;
import group.Grup.Grup;

import java.util.ArrayList;

public class Person {
    private int idPerson;
    private String firstNamePerson;
    private String lastNAmePerson;
    private String gmailPerson;
    private String passwordPerson;
    private Gender gender;

    public Person(){

    }

    public Person(int idPerson, String firstNamePerson, String lastNAmePerson, String gmailPerson, String passwordPerson, Gender gender) {
        this.idPerson = idPerson;
        this.firstNamePerson = firstNamePerson;
        this.lastNAmePerson = lastNAmePerson;
        this.gmailPerson = gmailPerson;
        this.passwordPerson = passwordPerson;
        this.gender = gender;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstNamePerson() {
        return firstNamePerson;
    }

    public void setFirstNamePerson(String firstNamePerson) {
        this.firstNamePerson = firstNamePerson;
    }

    public String getLastNAmePerson() {
        return lastNAmePerson;
    }

    public void setLastNAmePerson(String lastNAmePerson) {
        this.lastNAmePerson = lastNAmePerson;
    }

    public String getGmailPerson() {
        return gmailPerson;
    }

    public void setGmailPerson(String gmailPerson) {
        this.gmailPerson = gmailPerson;
    }

    public String getPasswordPerson() {
        return passwordPerson;
    }

    public void setPasswordPerson(String passwordPerson) {
        this.passwordPerson = passwordPerson;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person" +
                "\nidPerson=" + idPerson +
                "\nfirstNamePerson=" + firstNamePerson  +
                "\nlastNAmePerson='" + lastNAmePerson  +
                "\ngmailPerson='" + gmailPerson  +
                "\npasswordPerson='" + passwordPerson +
                "\ngender=" + gender ;
    }
}

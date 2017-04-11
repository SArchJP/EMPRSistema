package lt.vtvpmc.ems.pw.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class RequiredCourses implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // Int(In hours) fields
    // Dorinis ugdymas
    private int religion;
    private int ethics;
    // Kalbos (Plus: mokyklose, kuriose įteisintas mokymas tautinės mažumos kalba);
    private int lithuanian;
    private int lithuanianPlus;
    private int motherLanguageRussian;
    private int motherLanguagePolish;
    // Uzsenio kalbos
    private int foreignEnglish;
    private int foreignGerman;
    private int foreignFrench;
    private int foreignRussian;
    // Socialinis ugdymas
    private int history;
    private int geography;
    private int integratedHistoryGeography;
    //Matematika
    private int mathematics;
    // Gamtamokslinis ugdymas
    private int biology;
    private int physics;
    private int chemistry;
    private int integratedNaturalSciencesCourse;
    // Kūno kultūra
    private int generalPhysicalEducation;
    private int football;
    private int basketball;

    // Non arg constructor
    public RequiredCourses() {
    }

    // Arg true constructor
    public RequiredCourses(int religion, int ethics, int lithuanian, int lithuanianPlus, int motherLanguageRussian, int motherLanguagePolish, int foreignEnglish, int foreignGerman, int foreignFrench, int foreignRussian, int history, int geography, int integratedHistoryGeography, int mathematics, int biology, int physics, int chemistry, int integratedNaturalSciencesCourse, int generalPhysicalEducation, int football, int basketball) {
        this.religion = religion;
        this.ethics = ethics;
        this.lithuanian = lithuanian;
        this.lithuanianPlus = lithuanianPlus;
        this.motherLanguageRussian = motherLanguageRussian;
        this.motherLanguagePolish = motherLanguagePolish;
        this.foreignEnglish = foreignEnglish;
        this.foreignGerman = foreignGerman;
        this.foreignFrench = foreignFrench;
        this.foreignRussian = foreignRussian;
        this.history = history;
        this.geography = geography;
        this.integratedHistoryGeography = integratedHistoryGeography;
        this.mathematics = mathematics;
        this.biology = biology;
        this.physics = physics;
        this.chemistry = chemistry;
        this.integratedNaturalSciencesCourse = integratedNaturalSciencesCourse;
        this.generalPhysicalEducation = generalPhysicalEducation;
        this.football = football;
        this.basketball = basketball;
    }

    // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }

    public int getEthics() {
        return ethics;
    }

    public void setEthics(int ethics) {
        this.ethics = ethics;
    }

    public int getLithuanian() {
        return lithuanian;
    }

    public void setLithuanian(int lithuanian) {
        this.lithuanian = lithuanian;
    }

    public int getLithuanianPlus() {
        return lithuanianPlus;
    }

    public void setLithuanianPlus(int lithuanianPlus) {
        this.lithuanianPlus = lithuanianPlus;
    }

    public int getMotherLanguageRussian() {
        return motherLanguageRussian;
    }

    public void setMotherLanguageRussian(int motherLanguageRussian) {
        this.motherLanguageRussian = motherLanguageRussian;
    }

    public int getMotherLanguagePolish() {
        return motherLanguagePolish;
    }

    public void setMotherLanguagePolish(int motherLanguagePolish) {
        this.motherLanguagePolish = motherLanguagePolish;
    }

    public int getForeignEnglish() {
        return foreignEnglish;
    }

    public void setForeignEnglish(int foreignEnglish) {
        this.foreignEnglish = foreignEnglish;
    }

    public int getForeignGerman() {
        return foreignGerman;
    }

    public void setForeignGerman(int foreignGerman) {
        this.foreignGerman = foreignGerman;
    }

    public int getForeignFrench() {
        return foreignFrench;
    }

    public void setForeignFrench(int foreignFrench) {
        this.foreignFrench = foreignFrench;
    }

    public int getForeignRussian() {
        return foreignRussian;
    }

    public void setForeignRussian(int foreignRussian) {
        this.foreignRussian = foreignRussian;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getGeography() {
        return geography;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }

    public int getIntegratedHistoryGeography() {
        return integratedHistoryGeography;
    }

    public void setIntegratedHistoryGeography(int integratedHistoryGeography) {
        this.integratedHistoryGeography = integratedHistoryGeography;
    }

    public int getMathematics() {
        return mathematics;
    }

    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getIntegratedNaturalSciencesCourse() {
        return integratedNaturalSciencesCourse;
    }

    public void setIntegratedNaturalSciencesCourse(int integratedNaturalSciencesCourse) {
        this.integratedNaturalSciencesCourse = integratedNaturalSciencesCourse;
    }

    public int getGeneralPhysicalEducation() {
        return generalPhysicalEducation;
    }

    public void setGeneralPhysicalEducation(int generalPhysicalEducation) {
        this.generalPhysicalEducation = generalPhysicalEducation;
    }

    public int getFootball() {
        return football;
    }

    public void setFootball(int football) {
        this.football = football;
    }

    public int getBasketball() {
        return basketball;
    }

    public void setBasketball(int basketball) {
        this.basketball = basketball;
    }
}

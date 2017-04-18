package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

public class NewLearningPlanBean {

    @PersistenceContext
    private EntityManager entityManager;

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

    // Int(In hours) fields
    // Pasirenkamieji dalykai
    private int optionalEnglish;
    private int optionalGerman;
    private int optionalRussian;
    private int design;
    private int art;
    private int theater;
    private int music;
    private int it;
    // Isplestinis dalyku kursas
    private int extendedLithuanian;
    private int extendedLithuanianPlus;
    private int extendedForeignLanguage;
    private int extendedHistory;
    private int extendedMathematics;
    private int extendedBiology;
    private int extendedPhysics;
    private int extendedChemistry;
    // Dalyku moduliai
    private int biologyModuleOne;
    private int chemistryModule;
    private int biologyModuleTwo;
    private int phisicsModuleOne;
    private int phisicsModuleTwo;
    private int phisicsModuleThree;
    private int mathematicsModuleOne;
    private int mathematicsModuleTwo;
    private int mathematicsModuleThree;
    // Papildomai
    private String activities;
    private String wishes;


    @Transactional
    public String save(Student student) {
        RequiredCourses rc = new RequiredCourses(religion, ethics,
                lithuanian, lithuanianPlus, motherLanguageRussian, motherLanguagePolish,
                foreignEnglish, foreignGerman, foreignFrench, foreignRussian,
                history, geography, integratedHistoryGeography,
                mathematics,
                biology, physics, chemistry, integratedNaturalSciencesCourse,
                generalPhysicalEducation, football, basketball);
        entityManager.persist(rc);
        OptionalCourses oc = new OptionalCourses(optionalEnglish, optionalGerman, optionalRussian, design, art, theater, music, it,
                extendedLithuanian, extendedLithuanianPlus, extendedForeignLanguage, extendedHistory, extendedMathematics, extendedBiology, extendedPhysics, extendedChemistry,
                biologyModuleOne, chemistryModule, biologyModuleTwo, phisicsModuleOne, phisicsModuleTwo, phisicsModuleThree, mathematicsModuleOne, mathematicsModuleTwo, mathematicsModuleThree,
                activities, wishes);
        entityManager.persist(oc);


        student.setRequiredCourses(rc);
        student.setOptionalCourses(oc);
        entityManager.persist(student);


        return "main.xhtml";

    }

    // Entity manager get/set
    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
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

    public int getOptionalEnglish() {
        return optionalEnglish;
    }

    public void setOptionalEnglish(int optionalEnglish) {
        this.optionalEnglish = optionalEnglish;
    }

    public int getOptionalGerman() {
        return optionalGerman;
    }

    public void setOptionalGerman(int optionalGerman) {
        this.optionalGerman = optionalGerman;
    }

    public int getOptionalRussian() {
        return optionalRussian;
    }

    public void setOptionalRussian(int optionalRussian) {
        this.optionalRussian = optionalRussian;
    }

    public int getDesign() {
        return design;
    }

    public void setDesign(int design) {
        this.design = design;
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public int getTheater() {
        return theater;
    }

    public void setTheater(int theater) {
        this.theater = theater;
    }

    public int getMusic() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }

    public int getIt() {
        return it;
    }

    public void setIt(int it) {
        this.it = it;
    }

    public int getExtendedLithuanian() {
        return extendedLithuanian;
    }

    public void setExtendedLithuanian(int extendedLithuanian) {
        this.extendedLithuanian = extendedLithuanian;
    }

    public int getExtendedLithuanianPlus() {
        return extendedLithuanianPlus;
    }

    public void setExtendedLithuanianPlus(int extendedLithuanianPlus) {
        this.extendedLithuanianPlus = extendedLithuanianPlus;
    }

    public int getExtendedForeignLanguage() {
        return extendedForeignLanguage;
    }

    public void setExtendedForeignLanguage(int extendedForeignLanguage) {
        this.extendedForeignLanguage = extendedForeignLanguage;
    }

    public int getExtendedHistory() {
        return extendedHistory;
    }

    public void setExtendedHistory(int extendedHistory) {
        this.extendedHistory = extendedHistory;
    }

    public int getExtendedMathematics() {
        return extendedMathematics;
    }

    public void setExtendedMathematics(int extendedMathematics) {
        this.extendedMathematics = extendedMathematics;
    }

    public int getExtendedBiology() {
        return extendedBiology;
    }

    public void setExtendedBiology(int extendedBiology) {
        this.extendedBiology = extendedBiology;
    }

    public int getExtendedPhysics() {
        return extendedPhysics;
    }

    public void setExtendedPhysics(int extendedPhysics) {
        this.extendedPhysics = extendedPhysics;
    }

    public int getExtendedChemistry() {
        return extendedChemistry;
    }

    public void setExtendedChemistry(int extendedChemistry) {
        this.extendedChemistry = extendedChemistry;
    }

    public int getBiologyModuleOne() {
        return biologyModuleOne;
    }

    public void setBiologyModuleOne(int biologyModuleOne) {
        this.biologyModuleOne = biologyModuleOne;
    }

    public int getChemistryModule() {
        return chemistryModule;
    }

    public void setChemistryModule(int chemistryModule) {
        this.chemistryModule = chemistryModule;
    }

    public int getBiologyModuleTwo() {
        return biologyModuleTwo;
    }

    public void setBiologyModuleTwo(int biologyModuleTwo) {
        this.biologyModuleTwo = biologyModuleTwo;
    }

    public int getPhisicsModuleOne() {
        return phisicsModuleOne;
    }

    public void setPhisicsModuleOne(int phisicsModuleOne) {
        this.phisicsModuleOne = phisicsModuleOne;
    }

    public int getPhisicsModuleTwo() {
        return phisicsModuleTwo;
    }

    public void setPhisicsModuleTwo(int phisicsModuleTwo) {
        this.phisicsModuleTwo = phisicsModuleTwo;
    }

    public int getPhisicsModuleThree() {
        return phisicsModuleThree;
    }

    public void setPhisicsModuleThree(int phisicsModuleThree) {
        this.phisicsModuleThree = phisicsModuleThree;
    }

    public int getMathematicsModuleOne() {
        return mathematicsModuleOne;
    }

    public void setMathematicsModuleOne(int mathematicsModuleOne) {
        this.mathematicsModuleOne = mathematicsModuleOne;
    }

    public int getMathematicsModuleTwo() {
        return mathematicsModuleTwo;
    }

    public void setMathematicsModuleTwo(int mathematicsModuleTwo) {
        this.mathematicsModuleTwo = mathematicsModuleTwo;
    }

    public int getMathematicsModuleThree() {
        return mathematicsModuleThree;
    }

    public void setMathematicsModuleThree(int mathematicsModuleThree) {
        this.mathematicsModuleThree = mathematicsModuleThree;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public String getWishes() {
        return wishes;
    }

    public void setWishes(String wishes) {
        this.wishes = wishes;
    }


}

package lt.vtvpmc.ems.pw.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class OptionalCourses implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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

    // Non arg constructor
    public OptionalCourses() {
    }

    // Arg true constructor
    public OptionalCourses(int optionalEnglish, int optionalGerman, int optionalRussian, int design, int art, int theater, int music, int it, int extendedLithuanian, int extendedLithuanianPlus, int extendedForeignLanguage, int extendedHistory, int extendedMathematics, int extendedBiology, int extendedPhysics, int extendedChemistry, int biologyModuleOne, int chemistryModule, int biologyModuleTwo, int phisicsModuleOne, int phisicsModuleTwo, int phisicsModuleThree, int mathematicsModuleOne, int mathematicsModuleTwo, int mathematicsModuleThree, String activities, String wishes) {
        this.optionalEnglish = optionalEnglish;
        this.optionalGerman = optionalGerman;
        this.optionalRussian = optionalRussian;
        this.design = design;
        this.art = art;
        this.theater = theater;
        this.music = music;
        this.it = it;
        this.extendedLithuanian = extendedLithuanian;
        this.extendedLithuanianPlus = extendedLithuanianPlus;
        this.extendedForeignLanguage = extendedForeignLanguage;
        this.extendedHistory = extendedHistory;
        this.extendedMathematics = extendedMathematics;
        this.extendedBiology = extendedBiology;
        this.extendedPhysics = extendedPhysics;
        this.extendedChemistry = extendedChemistry;
        this.biologyModuleOne = biologyModuleOne;
        this.chemistryModule = chemistryModule;
        this.biologyModuleTwo = biologyModuleTwo;
        this.phisicsModuleOne = phisicsModuleOne;
        this.phisicsModuleTwo = phisicsModuleTwo;
        this.phisicsModuleThree = phisicsModuleThree;
        this.mathematicsModuleOne = mathematicsModuleOne;
        this.mathematicsModuleTwo = mathematicsModuleTwo;
        this.mathematicsModuleThree = mathematicsModuleThree;
        this.activities = activities;
        this.wishes = wishes;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
